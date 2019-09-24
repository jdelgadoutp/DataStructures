package cap3.trees;

public class AvlTree {

	private AvlNode root;

	int treeAvlHigh;

	public AvlNode getRoot() {
		return root;
	}

	public void setRoot(AvlNode root) {
		this.root = root;
		this.root.setRight(null);
		this.root.setLeft(null);
		this.root.setFather(null);
	}

	public void AddNode(int content) {
		AvlNode newNodeAvl = new AvlNode(content);

		InsetAvl(this.root, newNodeAvl);
	}

	public void InsetAvl(AvlNode rootactual, AvlNode newNodeAvl) {

		if (this.root == null) {
			this.root = newNodeAvl;
		} else {
			if (newNodeAvl.getData() < rootactual.getData()) {
				if (rootactual.getLeft() == null) {
					rootactual.setLeft(newNodeAvl);
					rootactual.getLeft().setFather(rootactual);
					this.Balance(this.root);

				} else {
					InsetAvl(rootactual.getLeft(), newNodeAvl);
				}
			} else {
				if (rootactual.getRight() == null) {
					rootactual.setRight(newNodeAvl);
					rootactual.getRight().setFather(rootactual);
					this.Balance(this.root);

				} else {
					InsetAvl(rootactual.getRight(), newNodeAvl);
				}
			}
		}
	}

	public int HighNode(AvlNode rootactual) {

		treeAvlHigh = 0;

		TreeAvlHigh(rootactual, 1);

		return treeAvlHigh;
	}

	private void TreeAvlHigh(AvlNode rootactual, int lvl) {

		if (rootactual != null) {

			TreeAvlHigh(rootactual.getRight(), lvl + 1);

			if (lvl > treeAvlHigh) {

				treeAvlHigh = lvl;
			}

			TreeAvlHigh(rootactual.getRight(), lvl + 1);
		}
	}

	public void Balance(AvlNode rootactual) {

		if (rootactual == null)
			return;

		Balance(rootactual.getLeft());
		Balance(rootactual.getRight());
		this.FactorE(rootactual);

	}

	private void FactorE(AvlNode rootactual) {

		int hR = this.HighNode(rootactual.getRight());
		int hL = this.HighNode(rootactual.getLeft());

		rootactual.setBalancefactor(hL, hR);

		if ((rootactual.getBalancefactor() == 2) || (rootactual.getBalancefactor() == -2)) {
			this.BalanceNode(rootactual);
		} else
			return;

	}

	private void BalanceNode(AvlNode rootactual) {

		BalanceNodes(this.root);

		if (rootactual.getBalancefactor() == 2) {
			if (rootactual.getLeft().getBalancefactor() == 1) {
				this.RotateRight(rootactual);
			} else if (rootactual.getLeft().getBalancefactor() == -1) {
				this.RotateLeftRight(rootactual);
			}
		} else if (rootactual.getBalancefactor() == -2) {
			if (rootactual.getRight().getBalancefactor() == -1) {
				this.RotateLeft(rootactual);
			} else if (rootactual.getRight().getBalancefactor() == 1) {
				RotateRightLeft(rootactual);
			}
		}

	}

	private void RotateRight(AvlNode rootactual) {

		System.out.println("Rotate Right");

		if (rootactual == this.root) {

			AvlNode rotate = rootactual;
			AvlNode node1 = rootactual.getLeft();
			AvlNode node2 = node1.getLeft();

			if (node1.getRight() != null) {

				AvlNode node3 = node1.getRight();

				this.setRoot(node1);
				this.root.setLeft(node2);
				node2.setFather(this.root);
				this.root.setRight(rotate);
				rotate.setFather(this.root);
				rotate.setLeft(node3);
				node3.setFather(rotate);

			} else {

				this.setRoot(node1);
				this.root.setLeft(node2);
				node2.setFather(this.root);
				this.root.setRight(rotate);
				rotate.setFather(this.root);
				rotate.setLeft(null);
			}

		} else {

			AvlNode rotate = rootactual;
			AvlNode node1 = rootactual.getLeft();

			if (node1.getRight() != null) {
				AvlNode node3 = node1.getRight();

				rotate.getFather().setLeft(node1);
				node1.setFather(rotate.getFather());
				node1.setRight(rotate);
				rotate.setFather(this.root);
				rotate.setLeft(node3);
				node3.setFather(rotate);

			} else {

				if (rotate == rotate.getFather().getLeft()) {
					rotate.getFather().setLeft(node1);
					node1.setRight(rotate);
					node1.setFather(rotate.getFather());
					rotate.setFather(node1);
					rotate.setLeft(null);
				} else {
					rotate.getFather().setRight(node1);
					node1.setRight(rotate);
					node1.setFather(rotate.getFather());
					rotate.setFather(node1);
					rotate.setLeft(null);
				}
			}

		}
	}

	private void RotateLeft(AvlNode rootactual) {

		if (rootactual == this.root) {

			AvlNode rotate = rootactual;
			AvlNode node1 = rootactual.getRight();
			AvlNode node2 = node1.getRight();

			if (node1.getLeft() != null) {

				AvlNode node3 = node1.getLeft();

				this.setRoot(node1);
				this.root.setRight(node2);
				node2.setFather(this.root);
				this.root.setLeft(rotate);
				rotate.setFather(this.root);
				rotate.setRight(node3);
				node3.setFather(rotate);

			} else {

				this.setRoot(node1);
				this.root.setRight(node2);
				node2.setFather(this.root);
				this.root.setLeft(rotate);
				rotate.setFather(this.root);
				rotate.setRight(null);
			}

		} else {

			AvlNode rotate = rootactual;
			AvlNode node1 = rootactual.getRight();

			if (node1.getLeft() != null) {
				AvlNode node3 = node1.getLeft();

				rotate.getFather().setRight(node1);
				node1.setFather(rotate.getFather());
				node1.setLeft(rotate);
				rotate.setFather(this.root);
				rotate.setRight(node3);
				node3.setFather(rotate);

			} else {

				rotate.getFather().setRight(node1);
				node1.setLeft(rotate);
				node1.setFather(rotate.getFather());
				rotate.setFather(node1);
				rotate.setRight(null);
			}

		}
	}

	private void RotateLeftRight(AvlNode rootactual) {

		if (this.root == rootactual) {

			AvlNode rotate = rootactual;
			AvlNode node1 = rootactual.getLeft();
			AvlNode node2 = node1.getRight();

			this.root.setLeft(node2);
			node2.setFather(this.root);
			node2.setLeft(node1);
			node1.setFather(node2);
			node1.setRight(null);

			this.setRoot(node2);
			this.root.setRight(rotate);
			this.root.setLeft(node1);
			rotate.setFather(this.root);
			rotate.setLeft(null);

		} else {
			AvlNode rotate = rootactual;
			AvlNode node1 = rootactual.getLeft();
			AvlNode node2 = node1.getRight();

			rotate.setLeft(node2);
			node2.setFather(rotate);
			node2.setLeft(node1);
			node1.setFather(node2);
			node1.setRight(null);

			if (rotate == rotate.getFather().getRight()) {

				rotate.getFather().setRight(node2);
				node2.setFather(rotate.getFather());

				node2.setRight(rotate);
				rotate.setFather(node2);
				rotate.setLeft(null);
			} else {
				rotate.getFather().setRight(node2);
				node2.setFather(rotate.getFather());

				node2.setRight(rotate);
				rotate.setFather(node2);
				rotate.setLeft(null);
			}

		}
	}

	private void RotateRightLeft(AvlNode rootactual) {

		if (this.root == rootactual) {

			AvlNode rotate = rootactual;
			AvlNode node1 = rootactual.getRight();
			AvlNode node2 = node1.getLeft();

			this.root.setRight(node2);
			node2.setFather(this.root);
			node2.setRight(node1);
			node1.setFather(node2);
			node1.setLeft(null);

			this.setRoot(node2);
			this.root.setLeft(rotate);
			this.root.setRight(node1);
			rotate.setFather(this.root);
			node1.setFather(this.root);
			rotate.setRight(null);

		} else {

			AvlNode rotate = rootactual;
			AvlNode node1 = rootactual.getRight();
			AvlNode node2 = node1.getLeft();

			rotate.setRight(node2);
			node2.setFather(rotate);
			node2.setRight(node1);
			node1.setFather(node2);
			node1.setLeft(null);

			rotate.getFather().setRight(node2);
			rotate.setRight(node2.getLeft());
			node2.getLeft().setFather(rotate);
			node2.setFather(rotate.getFather());
			node2.setLeft(rotate);
			rotate.setFather(node2);
		}

	}

	private void BalanceNodes(AvlNode rootactual) {

		if (rootactual == null)
			return;

		BalanceNodes(rootactual.getLeft());
		BalanceNodes(rootactual.getRight());
		this.FactorBalanceNodes(rootactual);

	}

	private void FactorBalanceNodes(AvlNode rootactual) {

		int hR = this.HighNode(rootactual.getRight());
		int hL = this.HighNode(rootactual.getLeft());

		rootactual.setBalancefactor(hL, hR);

		return;
	}

	public void DeleteAvlTree(int nodeAvl, AvlNode rootactual) {
		AvlNode cursor = new AvlNode(0);

		if (nodeAvl == rootactual.getData()) {
			if (rootactual.getLeft() == null && rootactual.getRight() == null) {
				// System.out.println("Borrar hoja");
				if (nodeAvl < this.root.getData()) {
					this.root.setLeft(null);
				} else {
					this.root.setRight(null);
				}
			} else if (nodeAvl == this.root.getData()) {
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
				if (rootactual.getData() < this.root.getData()) {
					this.root.setLeft(cursor);
				} else {
					this.root.setRight(cursor);
				}

			}
		} else {

			if (nodeAvl < rootactual.getData()) {
				if (rootactual.getLeft() != null) {
					this.DeleteAvlTree(nodeAvl, rootactual.getLeft());
				} else if (rootactual.getRight() != null) {
					this.DeleteAvlTree(nodeAvl, rootactual.getRight());
				}
			} else {
				if (rootactual.getRight() != null) {
					this.DeleteAvlTree(nodeAvl, rootactual.getRight());
				} else if (rootactual.getLeft() != null) {
					this.DeleteAvlTree(nodeAvl, rootactual.getLeft());

				}
			}
		}
	}

	public String ListAvlOrder(AvlNode rootactual) {

		if (rootactual == null)
			return null;

		ListAvlOrder(rootactual.getLeft());
		System.out.print(rootactual.getData() + "  ");
		String b = Integer.toString(rootactual.getData()) + " ";
		ListAvlOrder(rootactual.getRight());

		return b;

	}
	
	public String ListAvlNotOrder(AvlNode rootactual) {

		if (rootactual == null)
			return null;

		System.out.print(rootactual.getData() + "  ");
		String b = Integer.toString(rootactual.getData()) + " ";
		ListAvlNotOrder(rootactual.getLeft());
		
		return b;

	}

}
