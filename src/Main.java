import java.io.File;
import java.io.IOException;

import net.sourceforge.gxl.GXLDocument;
import net.sourceforge.gxl.GXLEdge;
import net.sourceforge.gxl.GXLGraph;
import net.sourceforge.gxl.GXLNode;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * GXLNode node1 = new GXLNode("node1"); GXLNode node2 = new GXLNode("node2");
		 * GXLNode node3 = new GXLNode("node3"); GXLNode node4 = new GXLNode("node4");
		 * GXLEdge edge1 = new GXLEdge(node1, node2); GXLEdge edge2 = new GXLEdge(node2,
		 * node3); GXLEdge edge3 = new GXLEdge(node3, node4); GXLEdge edge4 = new
		 * GXLEdge(node4, node1); GXLGraph graph = new GXLGraph("graph1"); GXLDocument
		 * gxlDocument = new GXLDocument(); { graph.add(node1); graph.add(node2);
		 * graph.add(node3); graph.add(node4); graph.add(edge1); graph.add(edge2);
		 * graph.add(edge3); graph.add(edge4);
		 * gxlDocument.getDocumentElement().add(graph); try { gxlDocument.write(new
		 * File("MyFirstGXLDocument.gxl")); } catch (IOException ioe) {
		 * System.out.println("Error while writing to file: " + ioe); }
		 */
		// Create document and elements
		GXLDoc gxld = new GXLDoc();
		System.out.println(gxld.examplemethod());
		
		

	}
}
