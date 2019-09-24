package cap1.arrays;

public class Matrix {
	// Step 1. Create attributes
	private int sizerow;
	private int sizecolumn;
	private int[][] elements;

	// Step 1.1. Create Constructor

	public Matrix(int newsizerow, int newsizecolumn) {
		this.sizerow = newsizerow;
		this.sizecolumn = newsizecolumn;
		this.elements = new int[newsizerow][newsizecolumn];
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods

	public int getSizerow() {
		return sizerow;
	}

	public void setSizerow(int sizerow) {
		this.sizerow = sizerow;
	}

	public int getSizerowcolumn() {
		return sizecolumn;
	}

	public void setSizerowcolumn(int sizerowcolumn) {
		this.sizecolumn = sizerowcolumn;
	}

	public int[][] getElements() {
		return elements;
	}

	public void setElements(int[][] elements) {
		this.elements = elements;
	}

	// Step 2.2. Create CRUD methods

	public int[][] InsertElement(int element, int row, int column) {
		this.elements[row][column] = element;
		return this.elements;
	}

	public int[][] UpdateElement(int element, int newelement) {
		for (int i = 0; i < elements.length; i++) {
			for (int k = 0; k < elements[i].length; k++) {
				if (this.elements[i][k] == element)
					this.elements[i][k] = newelement;
				;
			}

		}
		return this.elements;
	}

	public int[][] DeleteElement(int element) {
		for (int i = 0; i < elements.length; i++) {
			for (int k = 0; k < elements[i].length; k++) {
				if (this.elements[i][k] == element)
					this.elements[i][k] = 0;
				;
			}

		}
		return this.elements;
	}

	public int SearchElement(int element) {
		int intbuscado = 0;
		for (int i = 0; i < elements.length; i++) {
			for (int k = 0; k < elements[i].length; k++) {
				if (this.elements[i][k] == element) {
					System.out.println("--- SearchElement()---- Elemento encontrado: " + this.elements[i][k]
							+ " --- Posición: " + i + "," + k);
					intbuscado = this.elements[i][k];
				}

			}

		}
		return intbuscado;
	}

	public void ListElements() {
		System.out.println("-----List Array-------");
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[i].length; j++) {
				System.out.print(this.elements[i][j] + ",");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
