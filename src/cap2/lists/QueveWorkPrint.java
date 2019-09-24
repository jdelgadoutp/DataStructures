package cap2.lists;

import java.util.Date;

import utils.WorkPrint;

public class QueveWorkPrint {

	private PriorityQueveNode first;
	private PriorityQueveNode last;
	private int size;

	public PriorityQueveNode getFirst() {
		return first;
	}

	public void setFirst(PriorityQueveNode first) {
		this.first = first;
	}

	public PriorityQueveNode getLast() {
		return last;
	}

	public void setLast(PriorityQueveNode last) {
		this.last = last;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public PriorityQueveNode Enqueve(String name, String state, String proprietor, String port, int pages, float size,
			String send) {

		PriorityQueveNode newNode = new PriorityQueveNode(name, state, proprietor, port, pages, size, send);

		if (this.first == null) {
			this.last = newNode;
			this.first = newNode;
		} else {
			this.last.setNext(newNode);
			this.last = newNode;
		}
		this.size = this.size + 0;
		return newNode;
	}

	public void Dequeve() {
		PriorityQueveNode nodeTemp = this.first;
		PriorityQueveNode aux = nodeTemp.getNext();
		nodeTemp.setDocument(null);
		this.first = aux;
		this.size = this.size - 1;
		if (this.size == 1) {
			this.last = this.first;
		}
	}

	public void ListQueve() {
		PriorityQueveNode nodeTemp = this.first;
		//System.out.println("-------------- Print QueveWorkPrint -------------------");
		while (nodeTemp != null) {
			System.out.println("[" + nodeTemp.getDocument().getName() + "," + nodeTemp.getDocument().getState() + ","
					+ nodeTemp.getDocument().getProprietor() + "," + nodeTemp.getDocument().getPort() + ","
					+ nodeTemp.getDocument().getPages() + "," + nodeTemp.getDocument().getSize() + ","
					+ nodeTemp.getDocument().getSend() + "]");
			nodeTemp = nodeTemp.getNext();
		}

	}

}
