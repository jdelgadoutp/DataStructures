package cap2.lists;

import utils.Mp3;

public class LinkedList {

	// Step 1. Create attributes

	private Node head;
	private Node tail;
	private int size;


	// Step 1.1. Create Constructor
	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	// Step 2.2. Create CRUD methods

	public void add(String author, String file, String name, String trackNo) {

		// Step 1. create the new node
		Node newNode = new Node(author, file, name, trackNo);
		// If the head is null
		if (this.head == null) {
			// The new node is the head
			this.head = newNode;
			this.tail = newNode;
		} else {
			// The tail's next is newNode
			this.tail.setNext(newNode);
			// The new node is the tail
			this.tail = newNode;
		}
		this.size = this.size + 1;
	}

	public Mp3 searchByName(String name) {
		// Instanciamos el dato de respuesta
		Mp3 result = null;
		// Creamos un nodo temporal para recorrer los demas nodos
		Node tmp = this.head;
		// Mientras el siguiente del temporal no sea null
		while (tmp != null) {
			// Compare el dato del temporal con el dato de entrada
			if (tmp.getDato().getName().equals(name)) {
				// Si lo encuentra la respuesta es el dato encontrado
				result = tmp.getDato();
			}
			tmp = tmp.getNext();
		}
		return result;
	}

	public Mp3 getAt(int pos) {
		// Instanciamos el dato de respuesta
		Mp3 result = null;
		// Creamos un nodo temporal para recorrer los nodos
		Node tmp = this.head;
		// Creating the position indicator
		int posTmp = 0;
		// While we are not in the input position
		while (posTmp <= pos) {
			// Storing the current value in tmp object
			result = tmp.getDato();
			// Incrementing the pos
			posTmp = posTmp + 1;
			// Incrementing tmp
			tmp = tmp.getNext();
		}
		// When the while finish tmp is located in the correct node.
		return result;
	}

	public Mp3 DeleteAt(int pos) {

		Mp3 result = null;
		Node tmp = this.head;
		int posTmp = 0;

		while (posTmp <= pos) {
			result = tmp.getDato();
			if (posTmp == pos) {
				tmp.setDato(null);
				result = null;
			}
			posTmp = posTmp + 1;
			tmp = tmp.getNext();
		}

		return result;

	}

}
