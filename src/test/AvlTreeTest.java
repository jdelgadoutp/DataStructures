package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap3.trees.AvlTree;

class AvlTreeTest {

	@Test
	public void testInsertAvl() {

		AvlTree myAvlTree = new AvlTree();

		myAvlTree.AddNode(45);
		assertEquals(45, myAvlTree.getRoot().getData());
		myAvlTree.AddNode(7);
		assertEquals(7, myAvlTree.getRoot().getLeft().getData());
		myAvlTree.AddNode(6);
		assertEquals(6, myAvlTree.getRoot().getLeft().getLeft().getData());
		myAvlTree.AddNode(5);
		assertEquals(5, myAvlTree.getRoot().getLeft().getLeft().getLeft().getData());
		myAvlTree.AddNode(40);
		assertEquals(40, myAvlTree.getRoot().getLeft().getRight().getData());
		myAvlTree.AddNode(33);
		assertEquals(33, myAvlTree.getRoot().getLeft().getRight().getLeft().getData());
		myAvlTree.AddNode(31);
		assertEquals(31, myAvlTree.getRoot().getLeft().getRight().getLeft().getLeft().getData());
		myAvlTree.AddNode(46);
		assertEquals(46, myAvlTree.getRoot().getRight().getData());
		myAvlTree.AddNode(84);
		assertEquals(84, myAvlTree.getRoot().getRight().getRight().getData());

		assertEquals(45, myAvlTree.getRoot().getData());
		assertEquals(0, myAvlTree.getRoot().getBalancefactor());

	}
	
	@Test
	public void testDeleteAvl() {

		AvlTree myAvlTree = new AvlTree();

		myAvlTree.AddNode(45);
		assertEquals(45, myAvlTree.getRoot().getData());
		myAvlTree.AddNode(7);
		assertEquals(7, myAvlTree.getRoot().getLeft().getData());
		myAvlTree.AddNode(6);
		assertEquals(6, myAvlTree.getRoot().getLeft().getLeft().getData());
		myAvlTree.AddNode(5);
		assertEquals(5, myAvlTree.getRoot().getLeft().getLeft().getLeft().getData());
		myAvlTree.AddNode(40);
		assertEquals(40, myAvlTree.getRoot().getLeft().getRight().getData());
		myAvlTree.AddNode(33);
		assertEquals(33, myAvlTree.getRoot().getLeft().getRight().getLeft().getData());
		myAvlTree.AddNode(31);
		assertEquals(31, myAvlTree.getRoot().getLeft().getRight().getLeft().getLeft().getData());
		myAvlTree.AddNode(46);
		assertEquals(46, myAvlTree.getRoot().getRight().getData());
		myAvlTree.AddNode(84);
		assertEquals(84, myAvlTree.getRoot().getRight().getRight().getData());

		assertEquals(45, myAvlTree.getRoot().getData());
		assertEquals(0, myAvlTree.getRoot().getBalancefactor());
		
		myAvlTree.DeleteAvlTree(40, myAvlTree.getRoot());
		assertEquals(33, myAvlTree.getRoot().getLeft().getData());

	}
	
	@Test
	public void testListAvl() {

		AvlTree myAvlTree = new AvlTree();

		myAvlTree.AddNode(45);
		assertEquals(45, myAvlTree.getRoot().getData());
		myAvlTree.AddNode(7);
		assertEquals(7, myAvlTree.getRoot().getLeft().getData());
		myAvlTree.AddNode(6);
		assertEquals(6, myAvlTree.getRoot().getLeft().getLeft().getData());
		myAvlTree.AddNode(5);
		assertEquals(5, myAvlTree.getRoot().getLeft().getLeft().getLeft().getData());
		myAvlTree.AddNode(40);
		assertEquals(40, myAvlTree.getRoot().getLeft().getRight().getData());
		myAvlTree.AddNode(33);
		assertEquals(33, myAvlTree.getRoot().getLeft().getRight().getLeft().getData());
		myAvlTree.AddNode(31);
		assertEquals(31, myAvlTree.getRoot().getLeft().getRight().getLeft().getLeft().getData());
		myAvlTree.AddNode(46);
		assertEquals(46, myAvlTree.getRoot().getRight().getData());
		myAvlTree.AddNode(84);
		assertEquals(84, myAvlTree.getRoot().getRight().getRight().getData());

		assertEquals(45, myAvlTree.getRoot().getData());
		assertEquals(0, myAvlTree.getRoot().getBalancefactor());
		
		System.out.println("----------------- Print Tree Avl (In Order) -------------------");
		myAvlTree.ListAvlOrder(myAvlTree.getRoot());
		System.out.println("");
		System.out.println("----------------- Print Tree Avl (Not Order) -------------------");
		myAvlTree.ListAvlNotOrder(myAvlTree.getRoot());

	}
	

}
