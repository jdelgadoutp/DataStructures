package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap4.graphs.Graph;
import cap4.graphs.Vertex;

class GraphTest {

	@Test
	void testInsertGraph() {
		Graph myGraph = new Graph(10);
		assertEquals(myGraph.getCounter(), 0);
		myGraph.InsertGraph("A");
		assertEquals(myGraph.getCounter(), 1);
		assertEquals(myGraph.getVertices()[0].getData(), "A");
		myGraph.InsertGraph("B");
		assertEquals(myGraph.getCounter(), 2);
		assertEquals(myGraph.getVertices()[1].getData(), "B");
		myGraph.InsertGraph("C");
		assertEquals(myGraph.getCounter(), 3);
		assertEquals(myGraph.getVertices()[2].getData(), "C");
		myGraph.InsertGraph("D");
		assertEquals(myGraph.getCounter(), 4);
		assertEquals(myGraph.getVertices()[3].getData(), "D");
		myGraph.InsertGraph("E");
		assertEquals(myGraph.getCounter(), 5);
		assertEquals(myGraph.getVertices()[4].getData(), "E");
		myGraph.InsertArch(0, 1, 30);
		myGraph.InsertArch(0, 2, 20);
		myGraph.InsertArch(0, 3, -1);
		myGraph.InsertArch(0, 4, -1);
		myGraph.InsertArch(1, 0, 30);
		myGraph.InsertArch(1, 2, 15);
		myGraph.InsertArch(1, 3, 10);
		myGraph.InsertArch(1, 4, 5);
		myGraph.InsertArch(2, 0, 20);
		myGraph.InsertArch(2, 1, 15);
		myGraph.InsertArch(2, 3, -1);
		myGraph.InsertArch(2, 4, 25);
		myGraph.InsertArch(3, 0, -1);
		myGraph.InsertArch(3, 1, 10);
		myGraph.InsertArch(3, 2, -1);
		myGraph.InsertArch(3, 4, 22);
		myGraph.InsertArch(4, 0, -1);
		myGraph.InsertArch(4, 1, 5);
		myGraph.InsertArch(4, 2, 25);
		myGraph.InsertArch(4, 3, 22);
	}

	@Test
	void testSearchGraph() {
		Graph myGraph = new Graph(10);
		boolean expectedValue = true;
		assertEquals(myGraph.getCounter(), 0);
		myGraph.InsertGraph("A");
		assertEquals(myGraph.getCounter(), 1);
		assertEquals(myGraph.getVertices()[0].getData(), "A");
		myGraph.InsertGraph("B");
		assertEquals(myGraph.getCounter(), 2);
		assertEquals(myGraph.getVertices()[1].getData(), "B");
		myGraph.InsertGraph("C");
		assertEquals(myGraph.getCounter(), 3);
		assertEquals(myGraph.getVertices()[2].getData(), "C");
		myGraph.InsertGraph("D");
		assertEquals(myGraph.getCounter(), 4);
		assertEquals(myGraph.getVertices()[3].getData(), "D");
		myGraph.InsertGraph("E");
		assertEquals(myGraph.getCounter(), 5);
		assertEquals(myGraph.getVertices()[4].getData(), "E");
		myGraph.InsertArch(0, 1, 30);
		myGraph.InsertArch(0, 2, 20);
		myGraph.InsertArch(0, 3, -1);
		myGraph.InsertArch(0, 4, -1);
		myGraph.InsertArch(1, 0, 30);
		myGraph.InsertArch(1, 2, 15);
		myGraph.InsertArch(1, 3, 10);
		myGraph.InsertArch(1, 4, 5);
		myGraph.InsertArch(2, 0, 20);
		myGraph.InsertArch(2, 1, 15);
		myGraph.InsertArch(2, 3, -1);
		myGraph.InsertArch(2, 4, 25);
		myGraph.InsertArch(3, 0, -1);
		myGraph.InsertArch(3, 1, 10);
		myGraph.InsertArch(3, 2, -1);
		myGraph.InsertArch(3, 4, 22);
		myGraph.InsertArch(4, 0, -1);
		myGraph.InsertArch(4, 1, 5);
		myGraph.InsertArch(4, 2, 25);
		myGraph.InsertArch(4, 3, 22);
		assertEquals(expectedValue, myGraph.SearchGraph("B"));
	}
	
	@Test
	void testDeleteGraph() {
		Graph myGraph = new Graph(10);
		assertEquals(myGraph.getCounter(), 0);
		myGraph.InsertGraph("A");
		assertEquals(myGraph.getCounter(), 1);
		assertEquals(myGraph.getVertices()[0].getData(), "A");
		myGraph.InsertGraph("B");
		assertEquals(myGraph.getCounter(), 2);
		assertEquals(myGraph.getVertices()[1].getData(), "B");
		myGraph.InsertGraph("C");
		assertEquals(myGraph.getCounter(), 3);
		assertEquals(myGraph.getVertices()[2].getData(), "C");
		myGraph.InsertGraph("D");
		assertEquals(myGraph.getCounter(), 4);
		assertEquals(myGraph.getVertices()[3].getData(), "D");
		myGraph.InsertGraph("E");
		assertEquals(myGraph.getCounter(), 5);
		assertEquals(myGraph.getVertices()[4].getData(), "E");
		myGraph.InsertArch(0, 1, 30);
		myGraph.InsertArch(0, 2, 20);
		myGraph.InsertArch(0, 3, -1);
		myGraph.InsertArch(0, 4, -1);
		myGraph.InsertArch(1, 0, 30);
		myGraph.InsertArch(1, 2, 15);
		myGraph.InsertArch(1, 3, 10);
		myGraph.InsertArch(1, 4, 5);
		myGraph.InsertArch(2, 0, 20);
		myGraph.InsertArch(2, 1, 15);
		myGraph.InsertArch(2, 3, -1);
		myGraph.InsertArch(2, 4, 25);
		myGraph.InsertArch(3, 0, -1);
		myGraph.InsertArch(3, 1, 10);
		myGraph.InsertArch(3, 2, -1);
		myGraph.InsertArch(3, 4, 22);
		myGraph.InsertArch(4, 0, -1);
		myGraph.InsertArch(4, 1, 5);
		myGraph.InsertArch(4, 2, 25);
		myGraph.InsertArch(4, 3, 22);
		myGraph.DeleteGraph("A");
		assertEquals(myGraph.getVertices()[0], null);
		myGraph.DeleteGraph("B");
		assertEquals(myGraph.getVertices()[1], null);
	}
	
	@Test
	void testListGraph() {
		Graph myGraph = new Graph(10);
		assertEquals(myGraph.getCounter(), 0);
		myGraph.InsertGraph("A");
		assertEquals(myGraph.getCounter(), 1);
		assertEquals(myGraph.getVertices()[0].getData(), "A");
		myGraph.InsertGraph("B");
		assertEquals(myGraph.getCounter(), 2);
		assertEquals(myGraph.getVertices()[1].getData(), "B");
		myGraph.InsertGraph("C");
		assertEquals(myGraph.getCounter(), 3);
		assertEquals(myGraph.getVertices()[2].getData(), "C");
		myGraph.InsertGraph("D");
		assertEquals(myGraph.getCounter(), 4);
		assertEquals(myGraph.getVertices()[3].getData(), "D");
		myGraph.InsertGraph("E");
		assertEquals(myGraph.getCounter(), 5);
		assertEquals(myGraph.getVertices()[4].getData(), "E");
		myGraph.InsertArch(0, 1, 30);
		myGraph.InsertArch(0, 2, 20);
		myGraph.InsertArch(0, 3, -1);
		myGraph.InsertArch(0, 4, -1);
		myGraph.InsertArch(1, 0, 30);
		myGraph.InsertArch(1, 2, 15);
		myGraph.InsertArch(1, 3, 10);
		myGraph.InsertArch(1, 4, 5);
		myGraph.InsertArch(2, 0, 20);
		myGraph.InsertArch(2, 1, 15);
		myGraph.InsertArch(2, 3, -1);
		myGraph.InsertArch(2, 4, 25);
		myGraph.InsertArch(3, 0, -1);
		myGraph.InsertArch(3, 1, 10);
		myGraph.InsertArch(3, 2, -1);
		myGraph.InsertArch(3, 4, 22);
		myGraph.InsertArch(4, 0, -1);
		myGraph.InsertArch(4, 1, 5);
		myGraph.InsertArch(4, 2, 25);
		myGraph.InsertArch(4, 3, 22);
		myGraph.ListGraph();
	}
	
	@Test
	void testUpdateGraph() {
		Graph myGraph = new Graph(10);
		assertEquals(myGraph.getCounter(), 0);
		myGraph.InsertGraph("A");
		assertEquals(myGraph.getCounter(), 1);
		assertEquals(myGraph.getVertices()[0].getData(), "A");
		myGraph.InsertGraph("B");
		assertEquals(myGraph.getCounter(), 2);
		assertEquals(myGraph.getVertices()[1].getData(), "B");
		myGraph.InsertGraph("C");
		assertEquals(myGraph.getCounter(), 3);
		assertEquals(myGraph.getVertices()[2].getData(), "C");
		myGraph.InsertGraph("D");
		assertEquals(myGraph.getCounter(), 4);
		assertEquals(myGraph.getVertices()[3].getData(), "D");
		myGraph.InsertGraph("E");
		assertEquals(myGraph.getCounter(), 5);
		assertEquals(myGraph.getVertices()[4].getData(), "E");
		myGraph.InsertArch(0, 1, 30);
		myGraph.InsertArch(0, 2, 20);
		myGraph.InsertArch(0, 3, -1);
		myGraph.InsertArch(0, 4, -1);
		myGraph.InsertArch(1, 0, 30);
		myGraph.InsertArch(1, 2, 15);
		myGraph.InsertArch(1, 3, 10);
		myGraph.InsertArch(1, 4, 5);
		myGraph.InsertArch(2, 0, 20);
		myGraph.InsertArch(2, 1, 15);
		myGraph.InsertArch(2, 3, -1);
		myGraph.InsertArch(2, 4, 25);
		myGraph.InsertArch(3, 0, -1);
		myGraph.InsertArch(3, 1, 10);
		myGraph.InsertArch(3, 2, -1);
		myGraph.InsertArch(3, 4, 22);
		myGraph.InsertArch(4, 0, -1);
		myGraph.InsertArch(4, 1, 5);
		myGraph.InsertArch(4, 2, 25);
		myGraph.InsertArch(4, 3, 22);
		myGraph.UpdateGraph("E", "F");
		assertEquals(myGraph.getCounter(), 5);
		assertEquals(myGraph.getVertices()[4].getData(), "F");
	}
	
	@Test
	void testMinimalCost() {
		Graph myGraph = new Graph(10);
		int expectedValue = 62;
		assertEquals(myGraph.getCounter(), 0);
		myGraph.InsertGraph("A");
		assertEquals(myGraph.getCounter(), 1);
		assertEquals(myGraph.getVertices()[0].getData(), "A");
		myGraph.InsertGraph("B");
		assertEquals(myGraph.getCounter(), 2);
		assertEquals(myGraph.getVertices()[1].getData(), "B");
		myGraph.InsertGraph("C");
		assertEquals(myGraph.getCounter(), 3);
		assertEquals(myGraph.getVertices()[2].getData(), "C");
		myGraph.InsertGraph("D");
		assertEquals(myGraph.getCounter(), 4);
		assertEquals(myGraph.getVertices()[3].getData(), "D");
		myGraph.InsertGraph("E");
		assertEquals(myGraph.getCounter(), 5);
		assertEquals(myGraph.getVertices()[4].getData(), "E");
		myGraph.InsertArch(0, 1, 30);
		myGraph.InsertArch(0, 2, 20);
		myGraph.InsertArch(0, 3, -1);
		myGraph.InsertArch(0, 4, -1);
		myGraph.InsertArch(1, 0, 30);
		myGraph.InsertArch(1, 2, 15);
		myGraph.InsertArch(1, 3, 10);
		myGraph.InsertArch(1, 4, 5);
		myGraph.InsertArch(2, 0, 20);
		myGraph.InsertArch(2, 1, 15);
		myGraph.InsertArch(2, 3, -1);
		myGraph.InsertArch(2, 4, 25);
		myGraph.InsertArch(3, 0, -1);
		myGraph.InsertArch(3, 1, 10);
		myGraph.InsertArch(3, 2, -1);
		myGraph.InsertArch(3, 4, 22);
		myGraph.InsertArch(4, 0, -1);
		myGraph.InsertArch(4, 1, 5);
		myGraph.InsertArch(4, 2, 25);
		myGraph.InsertArch(4, 3, 22);
		myGraph.Vewed(0);
		assertEquals(expectedValue, myGraph.getMinimalcost());
		
	}

}