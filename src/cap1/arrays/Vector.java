package cap1.arrays;

public class Vector {
	// Step 1. Create attributes
	private int size;
	private int[] elements;

	// Step 1.1. Create Constructor
	public Vector(int newSize) {
		System.out.println("Creating vector with size=" + newSize);
		this.size = newSize;
		this.elements = new int[newSize];
	}

	// Step 2. Create methods
	// Step 2.1. Generate encapsulation methods
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int[] getElements() {
		return elements;
	}

	public void setElements(int[] elements) {
		this.elements = elements;
	}

	// Step 2.2. Create CRUD methods
	public int[] insertElement(int element, int position) {
		this.elements[position] = element;
		return this.elements;
	}

	public int searchElementByPosition(int position) {
		return this.elements[position];
	}
	
	public int searchElementByValue(int element) {
		int result = -1;
		// Recorrer el vector buscando el elemento a eliminar
		for (int i = 0; i < elements.length; i++) {
			// Si el elemento es encontrado reemplazarlo por 0
			if (elements[i] == element) {
				result = i;
			}
		}
		return result;
	}

	public int[] updateElement(int newElement, int position) {
		this.elements[position] = newElement;
		return this.elements;
	}

	public int[] deleteElement(int element) {

		// Recorrer el vector buscando el elemento a eliminar
		for (int i = 0; i < elements.length; i++) {
			// Si el elemento es encontrado reemplazarlo por 0
			if (elements[i] == element) {
				elements[i] = 0;
			}
		}
		return this.elements;
	}
}
