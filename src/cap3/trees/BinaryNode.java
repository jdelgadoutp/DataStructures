package cap3.trees;

public class BinaryNode {

	private int content;
	private BinaryNode left;
	private BinaryNode right;

	public BinaryNode(int content) {
		this.content = content;
	}

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}

	public BinaryNode getLeft() {
		return left;
	}

	public void setLeft(BinaryNode left) {
		this.left = left;
	}

	public BinaryNode getRight() {
		return right;
	}

	public void setRight(BinaryNode right) {
		this.right = right;
	}

}
