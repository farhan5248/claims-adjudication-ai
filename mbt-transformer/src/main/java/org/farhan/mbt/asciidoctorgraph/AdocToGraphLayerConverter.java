package org.farhan.mbt.asciidoctorgraph;

import java.io.File;
import java.util.ArrayList;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocFile;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToGraphConverter;
import org.farhan.mbt.graph.GraphProject;
import org.farhan.mbt.graph.GraphTextFile;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTVertex;

public class AdocToGraphLayerConverter extends ToGraphConverter {

	private AsciiDoctorAdocFile anAsciiDoctorFile;
	private String layer;

	AsciiDoctorProject sourceProject;
	GraphProject targetProject;

	public AdocToGraphLayerConverter(String layer, AsciiDoctorProject sourceProject,
			GraphProject targetProject) {
		this.layer = layer;
		this.sourceProject = sourceProject;
		this.targetProject = targetProject;
	}

	@Override
	protected String getLayer() {
		return layer;
	}

	public static MBTGraph<MBTVertex, MBTEdge> createEmptyGraph(String name) {
		MBTGraph<MBTVertex, MBTEdge> g = new MBTGraph<>(MBTEdge.class);
		g.setName(name);
		g.createStartVertex();
		g.createEndVertex();
		return g;
	}

	private static void createFromSection(MBTGraph<MBTVertex, MBTEdge> g, Section scenario) {

		ArrayList<Section> steps = new ArrayList<Section>();
		for (StructuralNode block : scenario.getBlocks()) {
			if (block instanceof Section) {
				steps.add((Section) block);
			}
		}
		g.createEdgeWithVertices(g.getStartVertex().getLabel(), steps.getFirst().getTitle(), "", null);
		for (int i = 0; i < steps.size() - 1; i++) {
			String source = steps.get(i).getTitle();
			String target = steps.get(i + 1).getTitle();
			MBTEdge inputs = g.createEdgeWithVertices(source, target, scenario.getTitle(), null);
			createFromTable(inputs, steps.get(i));
		}
		MBTEdge inputs = g.createEdgeWithVertices(steps.getLast().getTitle(), g.getEndVertex().getLabel(),
				scenario.getTitle(), null);
		createFromTable(inputs, steps.getLast());
	}

	private static void createFromTable(MBTEdge inputs, Section step) {

		// loop through the blocks which are tables
		for (StructuralNode block : step.getBlocks()) {
			if (block instanceof Table) {
				MBTGraph<MBTVertex, MBTEdge> g = createEmptyGraph(step.getTitle());
				Table table = (Table) block;
				// get vertices from table
				ArrayList<MBTVertex> vertices = new ArrayList<MBTVertex>();
				// TODO validate the table has at least two rows
				for (Row r : table.getHeader()) {
					for (Cell c : r.getCells()) {
						vertices.add(g.createVertex(c.getText()));
					}
				}
				// go through each row and convert to edge
				for (int i = 0; i < table.getBody().size(); i++) {

					g.createEdgeWithInput(g.getStartVertex(), vertices.getFirst(), "", "");

					Row row = table.getBody().get(i);
					for (int j = 0; j < vertices.size() - 1; j++) {
						String label = row.getCells().get(j).getText();
						if (!label.isEmpty()) {
							g.createEdgeWithInput(vertices.get(j), vertices.get(j + 1), label, label);
						}
					}
					// TODO this assumes the last column isn't blank
					g.createEdgeWithInput(vertices.getLast(), g.getEndVertex(), row.getCells().getLast().getText(),
							row.getCells().getLast().getText());
				}
				inputs.setValue(g);
			}
		}
	}

	@Override
	protected void selectLayerObjects() throws Exception {
		// TODO this should be filterLayerFiles since it's removing files
	}

	@Override
	protected void convertObject(ConvertibleObject layerFile) throws Exception {
		anAsciiDoctorFile = (AsciiDoctorAdocFile) layerFile;
		GraphTextFile gtf = new GraphTextFile(new File(convertFullName()));
		for (StructuralNode block : anAsciiDoctorFile.theDoc.getBlocks()) {
			if (block instanceof Section) {
				createFromSection(gtf.theGraph, (Section) block);
			}
		}
		// TODO the project should hide object creation and list management
		targetProject.getLayerObjects(targetProject.firstLayerName).add(gtf);
	}

	private String convertFullName() {
		return targetProject.getLayerDir(targetProject.firstLayerName).getAbsolutePath() + File.separator
				+ anAsciiDoctorFile.getFile().getName().replace(sourceProject.getLayerFileType(sourceProject.firstLayerName), "") + targetProject.getLayerFileType(targetProject.firstLayerName);
	}

	@Override
	protected ArrayList<ConvertibleObject> getLayerObjects(String layer) {
		return sourceProject.getLayerObjects(layer);
	}

}