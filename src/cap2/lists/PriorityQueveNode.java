package cap2.lists;

import java.util.Date;

import utils.WorkPrint;

public class PriorityQueveNode {

	private PriorityQueveNode first;
	private PriorityQueveNode last;
	private PriorityQueveNode next;
	private WorkPrint document;

	public PriorityQueveNode(String name, String state, String proprietor, String port, int pages, float size,
			String send) {

		this.document = new WorkPrint(name, state, proprietor, port, pages, size, send);
	}

	public PriorityQueveNode getNext() {
		return next;
	}

	public void setNext(PriorityQueveNode next) {
		this.next = next;
	}

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

	public WorkPrint getDocument() {
		return document;
	}

	public void setDocument(WorkPrint document) {
		this.document = document;
	}

}
