package org.farhan.mbt.graphuml;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.cucumber.Row;
import org.farhan.cucumber.Statement;
import org.farhan.cucumber.Step;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.ToUMLFirstLayerConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.core.Validator;
import org.farhan.mbt.graph.GraphProject;
import org.farhan.mbt.graph.GraphTextFile;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTPath;
import org.farhan.mbt.graph.MBTVertex;
import org.farhan.mbt.uml.AnnotationFactory;
import org.farhan.mbt.uml.ArgumentFactory;
import org.farhan.mbt.uml.ClassFactory;
import org.farhan.mbt.uml.ElementImportFactory;
import org.farhan.mbt.uml.InteractionFactory;
import org.farhan.mbt.uml.MessageFactory;
import org.farhan.mbt.uml.UMLNameConverter;
import org.farhan.mbt.uml.UMLProject;

public class GraphToUMLFirstLayerConverter extends ToUMLFirstLayerConverter {

	private GraphTextFile aGraphTextFile;

	private String layer;

	public GraphToUMLFirstLayerConverter(String layer) {
		this.layer = layer;
	}

	@Override
	protected String getLayer() {
		return layer;
	}

	@Override
	protected void selectLayerFiles() throws Exception {
		GraphProject.readFiles();
	}

	@Override
	protected ArrayList<ConvertibleObject> getLayerFiles(String layer) {
		// TODO make a GraphDotFile
		return GraphProject.getFirstLayerFiles();
	}

	@Override
	protected Class convertObject(ConvertibleObject theObject) throws Exception {

		aGraphTextFile = (GraphTextFile) theObject;
		String qualifiedName = convertAbsolutePathToQualifiedName(aGraphTextFile.getFile().getAbsolutePath());
		Class layerClass = ClassFactory.getClass(UMLProject.theSystem, qualifiedName);
		return layerClass;
	}

	@Override
	protected void convertToImports(Class layerClass) throws Exception {
	}

	@Override
	protected void convertToBehaviours(Class layerClass) throws Exception {

		ArrayList<MBTPath> paths = getAllPaths(aGraphTextFile.theGraph, aGraphTextFile.theGraph.getStartVertex());
		for (int i = 0; i < paths.size(); i++) {
			resetCurrentContainerObject();
			// TODO figure out names for this later, use a counter for now
			Interaction anInteraction = createInteraction(layerClass, "Scenario " + String.valueOf(i));
			// TODO think about adding tags by deriving them from the edges
			// convertTagsToParameters(anInteraction, s.getTags());
			convertToInteractionMessages(anInteraction, paths.get(i).getPath());
		}
	}

	@Override
	protected void convertToInteractionMessages(Interaction anInteraction, List<?> steps) throws Exception {

		boolean isField = false;
		boolean isKeyword = true;
		HashMap<String, String> dataTable = null;
		// use loop with counters
		// ignore 0, it's start
		// ignore 1, it's blank edge
		// ignore size -1, it's end
		for (int i = 2; i < steps.size() - 1; i++) {
			// for each i
			String cs = getLabel(steps.get(i));
			if (cs.contentEquals("start")) {
				// if it's start, make empty map, set isField to true, is Keyword to false, skip
				// empty edge
				dataTable = new HashMap<String, String>();
				isField = true;
				isKeyword = false;
				i++;
			} else if (cs.contentEquals("end")) {
				// if it's end, convert map to table, set isField to false, isKeyword to true
				convertDataTableToArgument(dataTable, anInteraction.getMessages().getLast());
				isField = false;
				isKeyword = true;
			} else if (isKeyword) {
				// if isKeyword, then make it a step
				if (Validator.validateStepText(cs)) {
					setCurrentMachineAndState(cs);
					convertToMessage(anInteraction, cs);
				} else {
					throw new Exception("Step (" + cs + ") is not valid, use Xtext editor to correct it first. ");
				}
				// skip the next element since it's an edge
				if (!getLabel(steps.get(i + 1)).contentEquals("start")) {
					i++;
				}
			} else if (isField) {
				// if isField, then add map element for i and i+1, then i++
				dataTable.put(cs, getLabel(steps.get(i + 1)));
				i++;
			}
		}
	}

	private String getLabel(Object o) {
		if (o instanceof MBTVertex) {
			return ((MBTVertex) o).getLabel();
		} else {
			return ((MBTEdge) o).getLabel();
		}
	}

	@Override
	protected void convertToMessage(Interaction anInteraction, Object o) {
		String s = (String) o;
		String messageName = s;
		Class owningClass = (Class) anInteraction.getOwner();
		String secondLayerClassName = getSecondLayerClassName();
		Class importedClass = ClassFactory.getClassByMessage(UMLProject.theSystem, messageName, secondLayerClassName);
		ElementImport classImport = ElementImportFactory.getElementImportByAlias(owningClass, importedClass.getName());
		if (classImport == null) {
			classImport = ElementImportFactory.getElementImport(owningClass, secondLayerClassName);
		}
		Message theMessage = MessageFactory.getMessage(anInteraction, importedClass, messageName);
	}

	@Override
	protected String convertQualifiedNameToAbsolutePath(String qualifiedName) {
		String pathName = qualifiedName;
		pathName = pathName.replace("pst::specs::", "");
		pathName = pathName.replace("::", File.separator);
		pathName = GraphProject.getFirstLayerDir().getAbsolutePath() + pathName;
		pathName = pathName + ".txt";
		return pathName;
	}

	@Override
	protected String convertAbsolutePathToQualifiedName(String pathName) {
		String qualifiedName = pathName.trim();
		qualifiedName = qualifiedName.replace(".txt", "");
		qualifiedName = qualifiedName.replace(GraphProject.getFirstLayerDir().getAbsolutePath(), "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::specs" + qualifiedName;
		return qualifiedName;
	}

	@Override
	protected String convertQualifiedNameToImportName(String qualifiedName) {
		// first layer files have no explicit imports
		return "";
	}

	@Override
	protected String convertImportNameToQualifiedName(String path) {
		// first layer files have no explicit imports
		return null;
	}

	private void convertDataTableToArgument(HashMap<String, String> dataTable, Message theMessage) {
		ValueSpecification vs = ArgumentFactory.getArgument(theMessage, "dataTable", "", true);

		String headerRow = "";
		String valueRow = "";
		for (String columnName : dataTable.keySet()) {
			headerRow += columnName + " |";
			valueRow += dataTable.get(columnName) + " |";
		}
		AnnotationFactory.getAnnotation(vs, "dataTable", String.valueOf(0), headerRow);
		AnnotationFactory.getAnnotation(vs, "dataTable", String.valueOf(1), valueRow);
	}

	private String getSecondLayerClassName() {
		String secondLayerClassName = "";
		secondLayerClassName = UMLNameConverter.filterClassName(getFSMName() + getFSMState() + "Steps");
		secondLayerClassName = "pst::" + Project.secondLayerPackageName + "::"
				+ Utilities.toLowerCamelCase(getFSMName()) + "::" + secondLayerClassName;
		return secondLayerClassName;
	}

	private Interaction createInteraction(Class layerClass, String pathName) {
		Interaction anInteraction = InteractionFactory.getInteraction(layerClass, pathName, true);
		return anInteraction;
	}

	private static ArrayList<MBTPath> getAllPaths(MBTGraph<MBTVertex, MBTEdge> g, MBTVertex vertex) {
		ArrayList<MBTPath> vertexPaths = new ArrayList<MBTPath>();
		Set<MBTEdge> edges = g.outgoingEdgesOf(vertex);
		if (edges.isEmpty()) {
			// last node creates empty list and returns it
			vertexPaths.add(new MBTPath());
			return vertexPaths;
		} else {
			for (MBTEdge e : edges) {
				ArrayList<MBTPath> childPaths = getAllPaths(g, g.getEdgeTarget(e));
				ArrayList<MBTPath> edgePaths = getEdgePaths(e);
				combinePaths(g, e, vertex, vertexPaths, childPaths, edgePaths);
			}
			return vertexPaths;
		}
	}

	private static void combinePaths(MBTGraph<MBTVertex, MBTEdge> g, MBTEdge e, MBTVertex vertex,
			ArrayList<MBTPath> vertexPaths, ArrayList<MBTPath> childPaths, ArrayList<MBTPath> edgePaths) {
		for (MBTPath pc : childPaths) {
			if (edgePaths.isEmpty()) {
				pc.getPath().add(0, g.getEdgeTarget(e));
				pc.getPath().add(0, e);
				if (vertex.getLabel().contentEquals(g.getStartVertex().getLabel())) {
					pc.getPath().add(0, vertex);
				}
				vertexPaths.add(pc);
			} else {
				for (MBTPath pe : edgePaths) {

					MBTPath expandedPath = new MBTPath();
					expandedPath.getPath().addAll(0, pc.getPath());
					expandedPath.getPath().add(0, g.getEdgeTarget(e));
					expandedPath.getPath().addAll(0, pe.getPath());
					if (vertex.getLabel().contentEquals(g.getStartVertex().getLabel())) {
						expandedPath.getPath().add(0, vertex);
					}
					vertexPaths.add(expandedPath);
				}
			}
		}
	}

	private static ArrayList<MBTPath> getEdgePaths(MBTEdge e) {
		if (e.getValue() != null) {
			if (e.getValue() instanceof MBTGraph<?, ?>) {
				MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) e.getValue();
				return getAllPaths(g, g.getStartVertex());
			}
		}
		return new ArrayList<MBTPath>();

	}

}
