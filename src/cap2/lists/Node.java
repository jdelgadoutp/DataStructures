package cap2.lists;

import utils.Mp3;

public class Node {

	// Step 1. Create attributes
	
	private Mp3 dato;
	private Node next;

	// Step 1.1. Create Constructor
	
	public Node(String author, String file, String name, String trackNo) {

		this.dato = new Mp3(author, file, name, trackNo);
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	
	public Mp3 getDato() {
		return dato;
	}

	public void setDato(Mp3 dato) {
		this.dato = dato;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	// Step 2.2. Create CRUD methods

}
