package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap1.arrays.Vector;
import utils.Person;

class HashTableTest {

	@Test
	void FuntionHash() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHash = new HashTable(13);
		// Step 2. Create the expected value variable
		int expectedValue = 12;
		// Step 3. Obtain the actual value
		int actualValue = testedHash.FuntionHash("18609698");
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void InsertTableHash() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHash = new HashTable(13);
		Person newperson = new Person("18609698", "Jairo Delgado", "3254777");
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[13];
		expectedValue[12] = newperson;
		// Step 3. Obtain the actual value
		Person[] actualValue = testedHash.InserTableHash("18609698", "Jairo Delgado", "3254777");
		// Step 4. Compare the expected versus actual values
		System.out.println("Charge factor in (insert) : " + testedHash.getChangefactor() + " % ");
		newperson.assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void DeleteTableHash() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHash = new HashTable(13);
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[13];
		// Step 3. Obtain the actual value
		testedHash.InserTableHash("18609698", "Jairo Delgado", "3254777");
		Person[] actualValue = testedHash.DeleteTableHash("18609698");
		// Step 4. Compare the expected versus actual values
		System.out.println("Charge factor in (delete): " + testedHash.getChangefactor() + " % ");
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void SearchTableHash() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHash = new HashTable(13);
		// Step 2. Create the expected value variable
		String expectedValue = "18609698";
		// Step 3. Obtain the actual value
		testedHash.InserTableHash("18609698", "Jairo Delgado", "3254777");
		String actualValue = testedHash.SearchTableHash("18609698");
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void UpdateTableHash() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHash = new HashTable(13);
		Person newperson = new Person("18609698", "Jairo Delgado Lopez", "3147890");
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[13];
		expectedValue[12] = newperson;
		// Step 3. Obtain the actual value
		testedHash.InserTableHash("18609698", "Jairo Delgado", "3254777");
		Person[] actualValue = testedHash.UpdateHashTable("18609698", "Jairo Delgado Lopez", "3147890");
		// Step 4. Compare the expected versus actual values
		newperson.assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void ListTableHash() {
		// Step 1. instantiate the tested class using the constructor method
		HashTable testedHash = new HashTable(13);
		Person newperson = new Person("18609698", "Jairo Delgado", "3254777");
		// Step 2. Create the expected value variable
		Person[] expectedValue = new Person[13];
		expectedValue[12] = newperson;
		// Step 3. Obtain the actual value
		testedHash.InserTableHash("1089100774", "Santiago Delgado", "3256789");
		testedHash.InserTableHash("24525887", "Rosalba Lopez", "3409870");
		Person[] actualValue = testedHash.InserTableHash("18609698", "Jairo Delgado", "3254777");
		// Step 4. Compare the expected versus actual values
		testedHash.ListHashTable("1089100774", "24525887", "18609698");
		System.out.println("Charge factor in (insert) : " + testedHash.getChangefactor() + " % ");
		newperson.assertArrayEquals(expectedValue, actualValue);
	}
}
