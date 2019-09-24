package cap2.lists;

import utils.Mp3;

public class DoubleLinkedNode {

	private Mp3 dato;
	private DoubleLinkedNode next;
	private DoubleLinkedNode prev;
	
	public DoubleLinkedNode(String author, String file, String name, String trackNo) {

		this.dato = new Mp3(author, file, name, trackNo);
	}

	public Mp3 getDato() {
		return dato;
	}

	public void setDato(Mp3 dato) {
		this.dato = dato;
	}

	public DoubleLinkedNode getNext() {
		return next;
	}

	public void setNext(DoubleLinkedNode next) {
		this.next = next;
	}

	public DoubleLinkedNode getPrev() {
		return prev;
	}

	public void setPrev(DoubleLinkedNode prev) {
		this.prev = prev;
	}

}
