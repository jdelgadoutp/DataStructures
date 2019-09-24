package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import cap1.arrays.Vector;

class VectorTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Vector testedVector = new Vector(10);
		// Step 2. Create the expected value variable
		int[] expectedValue = new int[10];
		expectedValue[0] = 999;
		// Step 3. Obtain the actual value
		int[] actualValue = testedVector.insertElement(999, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testSearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Vector testedVector = new Vector(10);
		// Step 2. Create the expected value variable
		int expectedValue = 999;
		testedVector.insertElement(expectedValue, 9);
		// Step 3. Obtain the actual value
		int actualValue = testedVector.searchElementByPosition(9);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testUpdateElement() {
		// Step 1. instantiate the tested class using the constructor method
		Vector testedVector = new Vector(10);
		// Step 2. Create the expected value variable
		int[] expectedValue = new int[10];
		expectedValue[0] = 888;
		// Step 3. Obtain the actual value
		int[] actualValue = testedVector.updateElement(888, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testDeleteElement() {
		// Step 1. instantiate the tested class using the constructor method
		Vector testedVector = new Vector(10);
		// Step 2. Create the expected value variable
		int expectedValue = 999;
		testedVector.insertElement(expectedValue, 9);
		// Step 3. Obtain the actual value
		int[] actualValue = testedVector.deleteElement(expectedValue);
		// Step 4. Compare the expected versus actual values
		int pos = testedVector.searchElementByValue(expectedValue);

		assertEquals(-1, pos);
	}
}
