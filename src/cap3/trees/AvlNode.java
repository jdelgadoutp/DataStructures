package cap3.trees;

public class AvlNode {

	private int data;
	private AvlNode left;
	private AvlNode right;
	private AvlNode father;
	private int balancefactor;

	public AvlNode(int data) {
		this.data = data;
		this.balancefactor = 0;
		this.left = null;
		this.right = null;
	}

	public int getBalancefactor() {
		return balancefactor;
	}

	public void setBalancefactor(int hI, int hD) {
		this.balancefactor = (hI - hD);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public AvlNode getLeft() {
		return left;
	}

	public void setLeft(AvlNode left) {
		this.left = left;
	}

	public AvlNode getRight() {
		return right;
	}

	public void setRight(AvlNode right) {
		this.right = right;
	}

	public AvlNode getFather() {
		return father;
	}

	public void setFather(AvlNode father) {
		this.father = father;
	}

}
