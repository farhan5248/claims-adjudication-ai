package org.farhan.mbt.converter;

import java.io.File;
import java.util.ArrayList;
import java.util.Set;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.Table;
import org.asciidoctor.jruby.extension.internal.JRubyProcessor;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Row;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToDocumentConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTPathInfo;
import org.farhan.mbt.graph.MBTVertex;

public class GraphToAdocConverter extends ToDocumentConverter {

	private AsciiDoctorAdocWrapper tgtWrp;
	private JGraphTProject srcPrj;
	private JRubyProcessor jrp;

	public GraphToAdocConverter(String layer, JGraphTProject source, AsciiDoctorProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
		this.jrp = new JRubyProcessor();
	}

	@Override
	protected void selectObjects() throws Exception {
		// TODO duplicate method from GraphToUMLConverter
		ArrayList<File> files = Utilities.recursivelyListFiles(srcPrj.getDir(srcPrj.FIRST_LAYER),
				srcPrj.getFileExt(srcPrj.FIRST_LAYER));
		srcPrj.getObjects(srcPrj.FIRST_LAYER).clear();
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
		}
		// TODO this is an instance of selecting from multiple layers, think about how
		// that factors into the multilayer model. Perhaps remove first,second third and
		// make a dynamic list of 1,2,3?
		files = Utilities.recursivelyListFiles(srcPrj.getDir(srcPrj.SECOND_LAYER),
				srcPrj.getFileExt(srcPrj.SECOND_LAYER));
		srcPrj.getObjects(srcPrj.SECOND_LAYER).clear();
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
		}
	}

	@Override
	protected void convertObject(ConvertibleObject object) throws Exception {
		JGraphTGraphWrapper adaw = (JGraphTGraphWrapper) object;
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) adaw.get();
		tgtWrp = (AsciiDoctorAdocWrapper) tgtPrj.createObject(convertObjectName(adaw.getFile().getAbsolutePath()));
		Document theDoc = (Document) tgtWrp.get();
		theDoc.setTitle(g.getName());
		theDoc.getAttributes().put("tags", g.getTags());
		Block block = jrp.createBlock(theDoc, "paragraph", g.getDescription());
		theDoc.getBlocks().add(block);
	}

	@Override
	protected String convertObjectName(String documentTitle) {
		return convertObjectName(documentTitle, tgtPrj.FIRST_LAYER);
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void convertElements(ConvertibleObject object) throws Exception {
		JGraphTGraphWrapper adaw = (JGraphTGraphWrapper) object;
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) adaw.get();
		Document theDoc = (Document) tgtWrp.get();
		for (MBTPathInfo pi : g.getPathInfo()) {

			Section scenario = jrp.createSection(theDoc);
			theDoc.getBlocks().add(scenario);
			scenario.setTitle(pi.getName());
			scenario.getAttributes().put("tags", pi.getTags());
			Block description = jrp.createBlock(scenario, "paragraph", pi.getDescription());
			scenario.getBlocks().add(description);

			Section step;
			ArrayList<Object> p = getPath(g, g.getStartVertex(), pi);
			for (Object o : p) {
				if (o instanceof MBTVertex) {
					MBTVertex v = (MBTVertex) o;
					if (!v.getLabel().contentEquals(g.getStartVertex().getLabel())
							&& !v.getLabel().contentEquals(g.getEndVertex().getLabel())) {
						step = jrp.createSection(scenario);
						step.setTitle(getLabel(o));
						scenario.getBlocks().add(step);
					}
				} else {
					MBTEdge e = (MBTEdge) o;
					MBTGraph<MBTVertex, MBTEdge> edgeGraph = getGraph(g.getEdgeSource(e).getLabel());
					if (edgeGraph != null) {
						step = (Section) scenario.getBlocks().getLast();
						Table table = jrp.createTable(step);
						step.getBlocks().add(table);
						convertPathToTable(edgeGraph, table, pi);
					}
				}
			}
		}
	}

	private String convertObjectName(String fileName, String layer) {
		String qualifiedName = fileName.replace(",", "");
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(layer), "");
		qualifiedName = qualifiedName.replace(srcPrj.getDir(layer).getAbsolutePath(), "");
		qualifiedName = tgtPrj.getDir(layer) + qualifiedName + tgtPrj.getFileExt(layer);
		return qualifiedName;
	}

	private void convertPathToTable(MBTGraph<MBTVertex, MBTEdge> g, Table table, MBTPathInfo pi) {

		ArrayList<Object> edgePath = getPath(g, g.getStartVertex(), pi);

		Row row = jrp.createTableRow(table);
		table.getHeader().add(row);
		int colCnt = 0;
		for (Object o : edgePath) {
			if (o instanceof MBTVertex) {
				MBTVertex v = (MBTVertex) o;
				if (v.getLabel().startsWith("0 ")) {
					Column column = jrp.createTableColumn(table, colCnt);
					table.getColumns().add(column);
					Cell cell = jrp.createTableCell(column, v.getLabel().replaceFirst("0 ", ""));
					row.getCells().add(cell);
					colCnt++;
				} else if (v.getLabel().startsWith("1 ")) {
					break;
				} else {
					continue;
				}
			}
		}
		colCnt = table.getHeader().getFirst().getCells().size();
		for (Object o : edgePath) {
			if (o instanceof MBTVertex) {
				MBTVertex v = (MBTVertex) o;
				if (v.equals(g.getStartVertex())) {
					continue;
				}
				if (colCnt < table.getHeader().getFirst().getCells().size()) {
					colCnt++;
				} else {
					colCnt = 0;
					row = jrp.createTableRow(table);
					table.getBody().add(row);
				}
			} else {
				MBTEdge e = (MBTEdge) o;
				if (g.getEdgeSource(e).equals(g.getStartVertex())) {
					continue;
				}
				Cell cell = jrp.createTableCell(table.getColumns().get(colCnt), e.getLabel());
				row.getCells().add(cell);
			}
		}
	}

	private ArrayList<Object> getPath(MBTGraph<MBTVertex, MBTEdge> g, MBTVertex vertex, MBTPathInfo pi) {

		// TODO this is a duplicate method, instead of removing the Wrapper classes,
		// perhaps all the UML/Graph stuff should go in there and there should be basic
		// methods like create feature, scenario, step that manages the Class/Graph/Java
		// code? I'll try that out in April.

		ArrayList<Object> path = null;
		Set<MBTEdge> edges = g.outgoingEdgesOf(vertex);
		if (edges.isEmpty()) {
			path = new ArrayList<Object>();
			path.add(vertex);
		} else {
			for (MBTEdge e : edges) {
				if (pi.isCoveredBy(e)) {
					path = getPath(g, g.getEdgeTarget(e), pi);
					path.add(0, e);
					path.add(0, vertex);
				}
			}
		}
		return path;
	}

	private MBTGraph<MBTVertex, MBTEdge> getGraph(String graphName) {
		// TODO This is a duplicate method like above
		for (Object o : srcPrj.getObjects(srcPrj.SECOND_LAYER)) {
			MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) ((JGraphTGraphWrapper) o).get();
			if (g.getName().contentEquals(graphName)) {
				return g;
			}
		}
		return null;
	}

	private String getLabel(Object o) {
		// TODO also a duplicate, maybe make a super type for label, name, tag etc?
		if (o instanceof MBTVertex) {
			return ((MBTVertex) o).getLabel();
		} else {
			return ((MBTEdge) o).getLabel();
		}
	}
}