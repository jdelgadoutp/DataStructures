package cap2.lists;

import utils.Person;

public class QueveNode {

	private Person dato;
	private QueveNode first;
	private QueveNode last;
	private QueveNode next;

	public QueveNode(String document, String name, String phone) {
		this.dato = new Person(document, name, phone);
	}

	public QueveNode getNext() {
		return next;
	}

	public void setNext(QueveNode next) {
		this.next = next;
	}

	public Person getDato() {
		return dato;
	}

	public void setDato(Person dato) {
		this.dato = dato;
	}

	public QueveNode getFirst() {
		return first;
	}

	public void setFirst(QueveNode first) {
		this.first = first;
	}

	public QueveNode getLast() {
		return last;
	}

	public void setLast(QueveNode last) {
		this.last = last;
	}

}
