package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap2.lists.Stack;
import utils.Proces;

class StackTest {

	@Test
	void testStack() {
		// Step 1. instantiate the tested class using the constructor method
		Stack myStack = new Stack();
		assertEquals(0, myStack.getSize());
		// Step 2. Create the expected value variable
		// Step 3. Obtain the actual value
		myStack.AddStack(1245, "iTunes", "@JairoDelgado");
		Proces newproces = myStack.getTop().getDato();
		// Step 4. Compare the expected versus actual values

		assertEquals(1, myStack.getSize());

		assertEquals(1245, newproces.getId());
		assertEquals("iTunes", newproces.getName());
		assertEquals("@JairoDelgado", newproces.getUser());

		myStack.AddStack(2345, "eclipse", "@Santiago");
		Proces newproces1 = myStack.getTop().getDato();
		// Step 4. Compare the expected versus actual values

		assertEquals(2, myStack.getSize());
		assertEquals(2345, newproces1.getId());
		assertEquals("eclipse", newproces1.getName());
		assertEquals("@Santiago", newproces1.getUser());
	}

	@Test
	void testRemoveStack() {
		// Step 1. instantiate the tested class using the constructor method
		Stack myStack = new Stack();
		assertEquals(0, myStack.getSize());
		// Step 2. Create the expected value variable
		// Step 3. Obtain the actual value
		myStack.AddStack(1245, "iTunes", "@JairoDelgado");
		Proces newproces = myStack.getTop().getDato();
		// Step 4. Compare the expected versus actual values

		assertEquals(1, myStack.getSize());

		assertEquals(1245, newproces.getId());
		assertEquals("iTunes", newproces.getName());
		assertEquals("@JairoDelgado", newproces.getUser());

		myStack.AddStack(2345, "eclipse", "@Santiago");
		Proces newproces1 = myStack.getTop().getDato();
		// Step 4. Compare the expected versus actual values

		assertEquals(2, myStack.getSize());
		assertEquals(2345, newproces1.getId());
		assertEquals("eclipse", newproces1.getName());
		assertEquals("@Santiago", newproces1.getUser());

		myStack.RemoveStack();

		Proces newproces2 = myStack.getTop().getDato();
		// Step 4. Compare the expected versus actual values

		assertEquals(1, myStack.getSize());

		assertEquals(1245, newproces2.getId());
		assertEquals("iTunes", newproces2.getName());
		assertEquals("@JairoDelgado", newproces2.getUser());

	}

	@Test
	void testListStack() {
		// Step 1. instantiate the tested class using the constructor method
		Stack myStack = new Stack();
		assertEquals(0, myStack.getSize());
		// Step 2. Create the expected value variable
		// Step 3. Obtain the actual value
		myStack.AddStack(1245, "iTunes", "@JairoDelgado");
		Proces newproces = myStack.getTop().getDato();
		// Step 4. Compare the expected versus actual values

		assertEquals(1, myStack.getSize());

		assertEquals(1245, newproces.getId());
		assertEquals("iTunes", newproces.getName());
		assertEquals("@JairoDelgado", newproces.getUser());

		myStack.AddStack(2345, "eclipse", "@Santiago");
		Proces newproces1 = myStack.getTop().getDato();
		// Step 4. Compare the expected versus actual values

		assertEquals(2, myStack.getSize());
		assertEquals(2345, newproces1.getId());
		assertEquals("eclipse", newproces1.getName());
		assertEquals("@Santiago", newproces1.getUser());

		myStack.ListStack();

	}

}
