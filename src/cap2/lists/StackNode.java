package cap2.lists;

import utils.Proces;

public class StackNode {

	private Proces dato;
	private StackNode top;
	private StackNode next;

	public StackNode(int id, String name, String user) {
		this.dato = new Proces(id, name, user);
	}

	public Proces getDato() {
		return dato;
	}

	public void setDato(Proces dato) {
		this.dato = dato;
	}

	public StackNode getTop() {
		return top;
	}

	public void setTop(StackNode top) {
		this.top = top;
	}

	public StackNode getNext() {
		return next;
	}

	public void setNext(StackNode next) {
		this.next = next;
	}

}
