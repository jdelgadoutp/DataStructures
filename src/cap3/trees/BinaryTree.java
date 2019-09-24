package cap3.trees;

public class BinaryTree {

	private BinaryNode root;

	public BinaryNode getRoot() {
		return root;
	}

	public void setRoot(BinaryNode root) {
		this.root = root;
	}

	public void InsertarNodoB(int content) {
		BinaryNode newNodeB = new BinaryNode(content);
		InsertB(newNodeB, this.root);
	}

	public void InsertB(BinaryNode newNodeB, BinaryNode rootactual) {

		if (rootactual == null || rootactual.getContent() == newNodeB.getContent()) {
			rootactual = newNodeB;
			if (this.root == null) {
				this.root = rootactual;
			}
		} else {
			if (newNodeB.getContent() < rootactual.getContent()) {
				this.InsertB(newNodeB, rootactual.getLeft());
				if (rootactual.getLeft() == null) {
					rootactual.setLeft(newNodeB);
				} else {
					this.InsertB(newNodeB, rootactual.getLeft());
				}

			} else {
				InsertB(newNodeB, rootactual.getRight());
				if (rootactual.getRight() == null) {
					rootactual.setRight(newNodeB);
				} else {
					this.InsertB(newNodeB, rootactual.getRight());
				}
			}
		}

	}

	public int SearchB(int nodeB, BinaryNode rootactual) {

		int conten = 0;

		if (nodeB == rootactual.getContent()) {
			conten = rootactual.getContent();
		} else {
			if (nodeB < rootactual.getContent()) {
				if (rootactual.getLeft() != null) {
					conten = conten + this.SearchB(nodeB, rootactual.getLeft());
				} else if (rootactual.getRight() != null) {
					conten = conten + this.SearchB(nodeB, rootactual.getRight());
				}
			} else {
				if (rootactual.getRight() != null) {
					conten = conten + this.SearchB(nodeB, rootactual.getRight());
				} else if (rootactual.getLeft() != null) {
					conten = conten + this.SearchB(nodeB, rootactual.getLeft());

				}
			}

		}

		return conten;
	}

	public void DeleteB(int nodeB, BinaryNode rootactual) {
		BinaryNode cursor = new BinaryNode(0);

		if (nodeB == rootactual.getContent()) {
			if (rootactual.getLeft() == null && rootactual.getRight() == null) {
				// System.out.println("Borrar hoja");
				if (nodeB < this.root.getContent()) {
					this.root.setLeft(null);
				} else {
					this.root.setRight(null);
				}
			} else if (nodeB == this.root.getContent()) {
				// System.out.println("Borrar raiz");
				if (this.root.getRight() != null) {
					this.root.getRight().setLeft(this.root.getLeft());
					this.root = this.root.getRight();
				}
			} else {
				// System.out.println("Borrar rama");
				if (rootactual.getRight() != null) {
					cursor = rootactual.getRight();
				} else {
					cursor = rootactual.getLeft();
				}
				// rootactual = cursor;
				if (rootactual.getContent() < this.root.getContent()) {
					this.root.setLeft(cursor);
				} else {
					this.root.setRight(cursor);
				}

			}
		} else {

			if (nodeB < rootactual.getContent()) {
				if (rootactual.getLeft() != null) {
					this.DeleteB(nodeB, rootactual.getLeft());
				} else if (rootactual.getRight() != null) {
					this.DeleteB(nodeB, rootactual.getRight());
				}
			} else {
				if (rootactual.getRight() != null) {
					this.DeleteB(nodeB, rootactual.getRight());
				} else if (rootactual.getLeft() != null) {
					this.DeleteB(nodeB, rootactual.getLeft());

				}
			}
		}
	}


	public void ShowTreeB(BinaryNode rootactual) {

		if (this.root == null) {
			return;
		}

		if (this.root.getContent() == rootactual.getContent()) {
			System.out.println("--------- Show BinaryTree ----------\n");

			System.out.println("                " + rootactual.getContent());
			System.out.println("               / \\ ");

			System.out.print("              " + rootactual.getLeft().getContent());
			System.out.print("   " + rootactual.getRight().getContent() + "\n");
			System.out.println("               \\   \\");
		}

		if (rootactual.getLeft() != null) {
			System.out.print("                " + rootactual.getLeft().getRight().getContent());
			this.ShowTreeB(rootactual.getLeft());
		}

		if (rootactual.getRight().getRight() != null) {
			System.out.print("   " + rootactual.getRight().getRight().getContent());
			this.ShowTreeB(rootactual.getRight());
		}

	}

}
