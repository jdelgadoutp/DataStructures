package cap2.lists;

public class Stack {

	private StackNode top;
	private int size;

	public StackNode getTop() {
		return top;
	}

	public void setTop(StackNode top) {
		this.top = top;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void AddStack(int id, String name, String user) {
		StackNode newNode = new StackNode(id, name, user);
		if (this.top == null) {
			this.top = newNode;
		} else {
			newNode.setNext(this.top);
			this.top = newNode;

		}
		this.size = this.size + 1;
	}

	public void RemoveStack() {
		StackNode aux = this.top.getNext();
		this.top = null;
		this.top = aux;
		this.size = this.size - 1;
	}

	public void ListStack() {
		StackNode nodeTemp = this.top;
		System.out.println("-------------- Print Stack -------------------");
		while (nodeTemp!=null) {
			System.out.println("[" + nodeTemp.getDato().getId() + "," + nodeTemp.getDato().getName() + "," + nodeTemp.getDato().getUser() + "]");
			nodeTemp=nodeTemp.getNext();
		}
	}
}
