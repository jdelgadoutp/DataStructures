package cap2.lists;

import utils.Person;

public class Queve {

	private QueveNode first;
	private QueveNode last;
	private int size;

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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void Enqueve(String document, String name, String phone) {

		QueveNode newNode = new QueveNode(document, name, phone);

		if (this.first == null) {
			this.last = newNode;
			this.first = newNode;
		} else {
			this.last.setNext(newNode);
			this.last = newNode;
		}
		this.size = this.size + 1;
	}

	public void Dequeve() {
		QueveNode nodeTemp = this.first;
		QueveNode aux = nodeTemp.getNext();
		nodeTemp.setDato(null);
		this.first = aux;
		this.size = this.size - 1;
		if (this.size == 1) {
			this.last = this.first;
		}
	}

	public void ListQueve() {
		QueveNode nodeTemp = this.first;
		System.out.println("-------------- Print Queve -------------------");
		while (nodeTemp != null) {
			System.out.println("[" + nodeTemp.getDato().getDocument() + "," + nodeTemp.getDato().getName() + ","
					+ nodeTemp.getDato().getDocument() + "]");
			nodeTemp = nodeTemp.getNext();
		}
	}
}
