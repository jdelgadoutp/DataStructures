package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.BomInput.BytesProcessedNotification;

import cap3.trees.BinaryNode;
import cap3.trees.BinaryTree;

class BinaryTreeTest {

	@Test
	void InsertBinaryTree() {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.InsertarNodoB(5);
		assertEquals(5, binaryTree.getRoot().getContent());
		binaryTree.InsertarNodoB(2);
		assertEquals(2, binaryTree.getRoot().getLeft().getContent());
		binaryTree.InsertarNodoB(6);
		assertEquals(6, binaryTree.getRoot().getRight().getContent());
		binaryTree.InsertarNodoB(7);
		assertEquals(7, binaryTree.getRoot().getRight().getRight().getContent());
		binaryTree.InsertarNodoB(3);
		assertEquals(3, binaryTree.getRoot().getLeft().getRight().getContent());

	}

	@Test
	void SearchBinaryTree() {
		
		BinaryTree binaryTree = new BinaryTree();
		int expectedvalue=7;
		int actualvalue;
		binaryTree.InsertarNodoB(5);
		assertEquals(5, binaryTree.getRoot().getContent());
		binaryTree.InsertarNodoB(2);
		assertEquals(2, binaryTree.getRoot().getLeft().getContent());
		binaryTree.InsertarNodoB(6);
		assertEquals(6, binaryTree.getRoot().getRight().getContent());
		binaryTree.InsertarNodoB(7);
		assertEquals(7, binaryTree.getRoot().getRight().getRight().getContent());
		binaryTree.InsertarNodoB(3);
		assertEquals(3, binaryTree.getRoot().getLeft().getRight().getContent());
		actualvalue = binaryTree.SearchB(7,binaryTree.getRoot());
		assertEquals(expectedvalue, actualvalue);
		
	}
	
	@Test
	void DeleteBinaryTree() {
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.InsertarNodoB(5);
		assertEquals(5, binaryTree.getRoot().getContent());
		binaryTree.InsertarNodoB(2);
		assertEquals(2, binaryTree.getRoot().getLeft().getContent());
		binaryTree.InsertarNodoB(6);
		assertEquals(6, binaryTree.getRoot().getRight().getContent());
		binaryTree.InsertarNodoB(7);
		assertEquals(7, binaryTree.getRoot().getRight().getRight().getContent());
		binaryTree.InsertarNodoB(3);
		assertEquals(3, binaryTree.getRoot().getLeft().getRight().getContent());
		// delete branch
		binaryTree.DeleteB(2,binaryTree.getRoot());
		assertEquals(3, binaryTree.getRoot().getLeft().getContent());
		// delete root
		binaryTree.DeleteB(5,binaryTree.getRoot());
		assertEquals(6, binaryTree.getRoot().getContent());
		// delete sheet
		binaryTree.DeleteB(3,binaryTree.getRoot());
		assertEquals(null, binaryTree.getRoot().getLeft());
		
		
	}
	
	@Test
	void SwhowBinaryTree() {
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.InsertarNodoB(5);
		assertEquals(5, binaryTree.getRoot().getContent());
		binaryTree.InsertarNodoB(2);
		assertEquals(2, binaryTree.getRoot().getLeft().getContent());
		binaryTree.InsertarNodoB(6);
		assertEquals(6, binaryTree.getRoot().getRight().getContent());
		binaryTree.InsertarNodoB(7);
		assertEquals(7, binaryTree.getRoot().getRight().getRight().getContent());
		binaryTree.InsertarNodoB(3);
		assertEquals(3, binaryTree.getRoot().getLeft().getRight().getContent());
		binaryTree.ShowTreeB(binaryTree.getRoot());
	}
}
