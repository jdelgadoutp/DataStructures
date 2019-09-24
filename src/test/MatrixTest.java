package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;
import cap1.arrays.Vector;

class MatrixTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5, 5);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[5][5];
		expectedValue[2][3] = 801;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.InsertElement(801, 2, 3);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5, 5);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[5][5];
		expectedValue[2][3] = 805;
		// Step 3. Obtain the actual value
		testedMatrix.InsertElement(801, 2, 3);
		int[][] actualValue = testedMatrix.UpdateElement(801, 805);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5, 5);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[5][5];
		expectedValue[2][3] = 0;
		// Step 3. Obtain the actual value
		testedMatrix.InsertElement(805, 2, 3);
		int[][] actualValue = testedMatrix.DeleteElement(805);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testListElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5, 5);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[5][5];
		expectedValue[2][3] = 801;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.InsertElement(801, 2, 3);
		testedMatrix.ListElements();
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testSearhElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(5, 5);
		// Step 2. Create the expected value variable
		int expectedValue = 805;
		// Step 3. Obtain the actual value
		testedMatrix.InsertElement(805, 3, 3);
		int actualValue = testedMatrix.SearchElement(805);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

}
