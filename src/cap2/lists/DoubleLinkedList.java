package cap2.lists;

public class DoubleLinkedList {

	private DoubleLinkedNode head;
	private DoubleLinkedNode tail;
	private DoubleLinkedNode cursor;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public DoubleLinkedNode getHead() {
		return head;
	}

	public void setHead(DoubleLinkedNode head) {
		this.head = head;
	}

	public DoubleLinkedNode getTail() {
		return tail;
	}

	public void setTail(DoubleLinkedNode tail) {
		this.tail = tail;
	}

	public DoubleLinkedNode getCursor() {
		return cursor;
	}

	public void setCursor(DoubleLinkedNode cursor) {
		this.cursor = cursor;
	}

	public void add(String author, String file, String name, String trackNo) {

		DoubleLinkedNode newNode = new DoubleLinkedNode(author, file, name, trackNo);
		DoubleLinkedNode nodeTemp = new DoubleLinkedNode(author, file, name, trackNo);

		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			if (Integer.parseInt(newNode.getDato().getTrackNo()) < Integer.parseInt(this.head.getDato().getTrackNo())) {
				System.out.println("Insert to head");
				this.head.setPrev(newNode);
				this.head.setNext(newNode);
				newNode.setPrev(this.head);
				this.head = newNode;
			}
			if (Integer.parseInt(newNode.getDato().getTrackNo()) > Integer.parseInt(this.tail.getDato().getTrackNo())) {
				System.out.println("Insert to Tail");
				this.tail.setNext(newNode);
				newNode.setPrev(this.tail);
				this.tail = newNode;
			}
			if (Integer.parseInt(newNode.getDato().getTrackNo()) > Integer.parseInt(this.head.getDato().getTrackNo())
					&& Integer.parseInt(newNode.getDato().getTrackNo()) < Integer
							.parseInt(this.tail.getDato().getTrackNo())) {
				System.out.println("insert to half");
				nodeTemp = this.head;
				this.cursor = nodeTemp;
				while (this.cursor != null) {
					
					if (Integer.parseInt(newNode.getDato().getTrackNo()) > Integer
							.parseInt(nodeTemp.getDato().getTrackNo())
							&& Integer.parseInt(newNode.getDato().getTrackNo()) < Integer
									.parseInt(nodeTemp.getNext().getDato().getTrackNo())) {
						newNode.setPrev(nodeTemp);
						newNode.setNext(nodeTemp.getNext());
						nodeTemp.setNext(newNode);
					    nodeTemp.setPrev(newNode);
					    
					}
					this.cursor = this.cursor.getNext();
				}
			}

		}
		this.cursor = newNode;
		this.size = this.size + 1;
	}

	public void list() {
		this.cursor = this.head;
		System.out.println("------- Imprimento la lista doble -------");
		while (this.cursor != null) {
			System.out.println("TrackNo : " + this.cursor.getDato().getTrackNo() + ", Name : " + this.cursor.getDato().getName() + ", Author : " + this.cursor.getDato().getAuthor());
			this.cursor = this.cursor.getNext();
		}
	}

	public boolean DeleteTrackNo(String trackNo) {
		System.out.println("----- Borrando lista doble ------");
		boolean result = false;
		DoubleLinkedNode nodeTemp = this.head;
		while (nodeTemp != null) {
			if (Integer.parseInt(nodeTemp.getDato().getTrackNo()) == Integer.parseInt(trackNo)) {
				if (nodeTemp == this.head) {
					this.head = nodeTemp.getNext();
					this.head.setPrev(null);
					nodeTemp.setDato(null);
					result = true;
					size = size - 1;
				}
				if (nodeTemp == this.tail) {
					this.tail = nodeTemp.getPrev();
					this.tail.setNext(null);
					nodeTemp.setDato(null);
					result = true;
					size = size - 1;
				}
				if (nodeTemp != this.head && nodeTemp != this.tail) {
					nodeTemp.getPrev().setNext(nodeTemp.getNext());
					nodeTemp.getNext().setPrev(nodeTemp.getPrev());
					nodeTemp.setDato(null);
					result = true;
					size = size - 1;
				}
			}

			nodeTemp = nodeTemp.getNext();
		}
		return result;
	}
}
