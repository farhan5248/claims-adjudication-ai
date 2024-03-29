package org.farhan.mbt.converter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.xtext.impl.RuleCallImpl;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Background;
import org.farhan.cucumber.Examples;
import org.farhan.cucumber.Line;
import org.farhan.cucumber.Row;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.ScenarioOutline;
import org.farhan.cucumber.Statement;
import org.farhan.cucumber.Step;
import org.farhan.cucumber.Tag;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToUMLGherkinConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.core.Validator;
import org.farhan.mbt.cucumber.CucumberFeatureWrapper;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;
import org.farhan.validation.MBTEdgeValidator;
import org.farhan.validation.MBTVertexValidator;

public class FeatureToUMLConverter extends ToUMLGherkinConverter {

	private UMLClassWrapper tgtWrp;
	private CucumberProject srcPrj;

	public FeatureToUMLConverter(String layer, CucumberProject source, UMLProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
	}

	@Override
	protected void convertObjects() throws Exception {
		super.convertObjects();
		linkLayerFiles(getLayer());
	}

	@Override
	protected void selectObjects() throws Exception {

		ArrayList<File> files = Utilities.recursivelyListFiles(srcPrj.getDir(layer), srcPrj.getFileExt(layer));
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
			if (!isFileSelected(srcPrj.getObjects(layer).getLast(), srcPrj.tags)) {
				srcPrj.getObjects(layer).removeLast();
			}
		}
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void convertObject(ConvertibleObject theObject) throws Exception {

		CucumberFeatureWrapper cfw = (CucumberFeatureWrapper) theObject;
		String qualifiedName = convertObjectName(cfw.getFile().getAbsolutePath());
		tgtWrp = (UMLClassWrapper) tgtPrj.createObject(qualifiedName);

		Feature feature = (Feature) cfw.get();
		createAnnotation((Class) tgtWrp.get(), "title", feature.getName());
		for (Tag t : feature.getTags()) {
			createAnnotation((Class) tgtWrp.get(), "tags", t.getName());
		}
		((Class) tgtWrp.get()).createOwnedComment().setBody(convertStatementsToString(feature.getStatements()));
	}

	@Override
	protected void convertAbstractScenarios(ConvertibleObject theObject) throws Exception {

		CucumberFeatureWrapper cfw = (CucumberFeatureWrapper) theObject;
		Background b = null;
		for (AbstractScenario as : ((Feature) cfw.get()).getAbstractScenarios()) {
			Interaction anInteraction = convertScenarioToInteraction((Class) tgtWrp.get(), as);
			resetCurrentMachineAndState();
			if (as instanceof Background) {
				b = (Background) as;
				// If there is a background, add its steps first so that the component is
				// correctly identified
				convertMessages(anInteraction, as.getSteps());
				saveCurrentMachineAndState();
				createAnnotation(anInteraction, "background");
			} else {
				if (as instanceof Scenario) {
					Scenario s = (Scenario) as;
					convertTagsToParameters(anInteraction, s.getTags());
				}
				if (as instanceof ScenarioOutline) {
					ScenarioOutline so = (ScenarioOutline) as;
					convertTagsToParameters(anInteraction, so.getTags());
					convertExamplesToAnnotations(anInteraction, so);
				}
				convertMessages(anInteraction, as.getSteps());
			}
		}
	}

	@Override
	protected void convertMessages(Interaction anInteraction, List<?> steps) throws Exception {
		for (Object o : steps) {
			Step cs = (Step) o;
			String messageName = cs.getName();
			if (Validator.validateStepText(messageName)) {
				setCurrentMachineAndState(messageName);
				convertMessage(anInteraction, cs);
			} else {
				throw new Exception("Step (" + cs.getName() + ") is not valid, use Xtext editor to correct it first. ");
			}
		}
	}

	@Override
	protected void convertMessage(Interaction anInteraction, Object o) {
		Step s = (Step) o;
		Message theMessage = convertStepToMessage(anInteraction, s);
		convertKeywordToAnnotation(s, theMessage);
		// Some steps don't specify the component, it's determined by looking at
		// previous steps.
		convertTextToAnnotation(s, theMessage);
		convertDataTableToArgument(s, theMessage);
		convertDocStringToArgument(s, theMessage);
	}

	@Override
	protected String convertObjectName(String fullName) {
		String qualifiedName = fullName.trim();
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(srcPrj.FIRST_LAYER), "");
		// TODO this is removing org.farhan so change this and update all the tests so
		// that the package name is not droppedF
		qualifiedName = qualifiedName.replace(srcPrj.getDir(srcPrj.FIRST_LAYER).getAbsolutePath(), "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::specs" + qualifiedName;
		return qualifiedName;
	}

	private String convertStatementsToString(EList<Statement> eList) {
		String contents = "";
		for (Statement s : eList) {
			contents += s.getName() + "\n";
		}
		return contents.trim();
	}

	private Interaction convertScenarioToInteraction(Class layerClass, AbstractScenario as) {
		Interaction anInteraction = createInteraction(layerClass, as.getName());
		anInteraction.setName(anInteraction.getName());
		anInteraction.createOwnedComment().setBody(convertStatementsToString(as.getStatements()));
		return anInteraction;
	}

	private void convertTagsToParameters(Interaction anInteraction, EList<Tag> tags) {
		for (Tag a : tags) {
			createParameter(anInteraction, a.getName().replace("@", ""), "", "in");
		}
	}

	private void convertKeywordToAnnotation(Step s, Message theMessage) {
		CompositeNodeWithSemanticElement keyword = (CompositeNodeWithSemanticElement) s.eAdapters().getFirst();
		RuleCallImpl rc = (RuleCallImpl) keyword.getGrammarElement();
		createAnnotation(theMessage, "Step", "Keyword", rc.getRule().getName());
	}

	private void convertTextToAnnotation(Step s, Message m) {
		createAnnotation(m, "Step", "Component", getFSMComponent());
		// TODO similar to the FSM component, keep track of the object and use its full
		// path
		if (MBTVertexValidator.isVertex(m.getName())) {
			createAnnotation(m, "Step", "Path", MBTVertexValidator.getObjectName(m.getName()));
		} else if (MBTEdgeValidator.isEdge(m.getName())) {
			createAnnotation(m, "Step", "Path", MBTEdgeValidator.getObjectName(m.getName()));
		}
	}

	private Message convertStepToMessage(Interaction anInteraction, Step step) {
		Class nextLayerClass = createClassImport(getNextLayerClassName(), anInteraction);
		Message theMessage = getMessage(anInteraction, nextLayerClass, step.getName());
		return theMessage;
	}

	private void convertDocStringToArgument(Step s, Message theMessage) {
		if (s.getTheDocString() != null) {
			ValueSpecification vs = createArgument(theMessage, "docString", "");
			EList<Line> lines = s.getTheDocString().getLines();
			String indent = "          ";
			for (int i = 0; i < lines.size(); i++) {
				String line = "";
				if (lines.get(i).getName() != null) {
					line = lines.get(i).getName().replaceFirst(indent, "").stripTrailing();
				}
				createAnnotation(vs, "docString", String.valueOf(i), line);
			}
		}
	}

	private void convertDataTableToArgument(Step s, Message theMessage) {
		if (s.getTheStepTable() != null) {
			ValueSpecification vs = createArgument(theMessage, "dataTable", "");
			EList<Row> rows = s.getTheStepTable().getRows();
			for (int i = 0; i < rows.size(); i++) {
				String value = "";
				for (int j = 0; j < rows.get(i).getCells().size(); j++) {
					value += rows.get(i).getCells().get(j).getName() + " |";
				}
				createAnnotation(vs, "dataTable", String.valueOf(i), value);
			}
		}
	}

	private void convertExamplesToAnnotations(Interaction anInteraction, ScenarioOutline so) {
		for (Examples e : so.getExamples()) {
			// TODO save example tags
			EList<Row> rows = e.getTheExamplesTable().getRows();
			for (int i = 0; i < rows.size(); i++) {
				String value = "";
				for (int j = 0; j < rows.get(i).getCells().size(); j++) {
					value += rows.get(i).getCells().get(j).getName() + "|";
				}
				createAnnotation(anInteraction, e.getName(), String.valueOf(i), value);
			}
		}
	}

	private String getNextLayerClassName() {
		String secondLayerClassName = "";
		secondLayerClassName = convertNextLayerClassName(getFSMName() + getFSMState() + "Steps");
		secondLayerClassName = "pst::" + srcPrj.SECOND_LAYER + "::" + Utilities.toLowerCamelCase(getFSMName()) + "::"
				+ secondLayerClassName;
		return secondLayerClassName;
	}

	private boolean isFileSelected(ConvertibleObject convertibleFile, String tag) throws Exception {

		CucumberFeatureWrapper ufw = (CucumberFeatureWrapper) convertibleFile;
		Feature f = (Feature) ufw.get();
		if (isTagged(f.getTags(), tag)) {
			return true;
		}
		for (AbstractScenario a : f.getAbstractScenarios()) {
			if (a instanceof Scenario) {
				if (isTagged(((Scenario) a).getTags(), tag)) {
					return true;
				}
			} else if (a instanceof ScenarioOutline) {
				if (isTagged(((ScenarioOutline) a).getTags(), tag)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isTagged(EList<Tag> tags, String tag) {
		if (tag.isEmpty()) {
			return true;
		}
		for (Tag t : tags) {
			if (t.getName().trim().contentEquals(tag)) {
				return true;
			}
		}
		return false;
	}
}
