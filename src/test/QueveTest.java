package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.HashTable;
import cap2.lists.Queve;
import utils.Person;

class QueveTest {

	@Test
	void testEnqueve() {
		// Step 1. instantiate the tested class using the constructor method
		Queve myQueve = new Queve();
		assertEquals(0, myQueve.getSize());
		// Step 2. Create the expected value variable
		// Step 3. Obtain the actual value
		myQueve.Enqueve("18609698", "Jairo Delgado", "3254777");
		Person newperson = myQueve.getLast().getDato();
		// Step 4. Compare the expected versus actual values

		assertEquals(1, myQueve.getSize());

		assertEquals("18609698", newperson.getDocument());
		assertEquals("Jairo Delgado", newperson.getName());
		assertEquals("3254777", newperson.getPhone());

		myQueve.Enqueve("1089100774", "Santigo Delgado Bedoya", "3408990");
		Person newperson1 = myQueve.getLast().getDato();
		// Step 4. Compare the expected versus actual values

		assertEquals(2, myQueve.getSize());
		assertEquals("1089100774", newperson1.getDocument());
		assertEquals("Santigo Delgado Bedoya", newperson1.getName());
		assertEquals("3408990", newperson1.getPhone());

	}

	@Test
	void testDequeve() {
		// Step 1. instantiate the tested class using the constructor method
		Queve myQueve = new Queve();
		assertEquals(0, myQueve.getSize());
		// Step 2. Create the expected value variable
		// Step 3. Obtain the actual value
		myQueve.Enqueve("18609698", "Jairo Delgado", "3254777");
		Person newperson = myQueve.getLast().getDato();
		// Step 4. Compare the expected versus actual values

		assertEquals(1, myQueve.getSize());

		assertEquals("18609698", newperson.getDocument());
		assertEquals("Jairo Delgado", newperson.getName());
		assertEquals("3254777", newperson.getPhone());

		myQueve.Enqueve("1089100774", "Santigo Delgado Bedoya", "3408990");
		Person newperson1 = myQueve.getLast().getDato();
		// Step 4. Compare the expected versus actual values

		assertEquals(2, myQueve.getSize());
		assertEquals("1089100774", newperson1.getDocument());
		assertEquals("Santigo Delgado Bedoya", newperson1.getName());
		assertEquals("3408990", newperson1.getPhone());

		myQueve.Dequeve();
		assertEquals(1, myQueve.getSize());

	}

	@Test
	void testListDequeve() {
		// Step 1. instantiate the tested class using the constructor method
		Queve myQueve = new Queve();
		assertEquals(0, myQueve.getSize());
		// Step 2. Create the expected value variable
		// Step 3. Obtain the actual value
		myQueve.Enqueve("18609698", "Jairo Delgado", "3254777");
		Person newperson = myQueve.getLast().getDato();
		// Step 4. Compare the expected versus actual values

		assertEquals(1, myQueve.getSize());

		assertEquals("18609698", newperson.getDocument());
		assertEquals("Jairo Delgado", newperson.getName());
		assertEquals("3254777", newperson.getPhone());

		myQueve.Enqueve("1089100774", "Santigo Delgado Bedoya", "3408990");
		Person newperson1 = myQueve.getLast().getDato();
		// Step 4. Compare the expected versus actual values

		assertEquals(2, myQueve.getSize());
		assertEquals("1089100774", newperson1.getDocument());
		assertEquals("Santigo Delgado Bedoya", newperson1.getName());
		assertEquals("3408990", newperson1.getPhone());

		myQueve.ListQueve();

	}
}
