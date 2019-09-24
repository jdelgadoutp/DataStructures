package cap4.graphs;

import javax.lang.model.element.QualifiedNameable;

public class Graph {

	private Vertex[] vertices;
	private int[][] adjacencyMatrix;
	private int counter;
	private int cunterviewed;
	private int[] viewed;
	private int minimalcost;
	
	public int getMinimalcost() {
		return minimalcost;
	}

	public void setMinimalcost(int minimalcost) {
		this.minimalcost = minimalcost;
	}

	public int getCunterviewed() {
		return cunterviewed;
	}

	public void setCunterviewed(int cunterviewed) {
		this.cunterviewed = cunterviewed;
	}

	public int[] getViewed() {
		return viewed;
	}

	public void setViewed(int[] viewed) {
		this.viewed = viewed;
	}

	public Vertex[] getVertices() {
		return vertices;
	}

	public void setVertices(Vertex[] vertices) {
		this.vertices = vertices;
	}

	public int[][] getAdjacencyMatrix() {
		return adjacencyMatrix;
	}

	public void setAdjacencyMatrix(int[][] adjacencyMatrix) {
		this.adjacencyMatrix = adjacencyMatrix;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public Graph(int cantidadVertices) {

		this.vertices = new Vertex[cantidadVertices];
		this.adjacencyMatrix = new int[cantidadVertices][cantidadVertices];
		this.counter = 0;
		this.cunterviewed = 0;
		this.minimalcost = 0;
		this.viewed = new int[cantidadVertices];

		for (int i = 0; i < this.adjacencyMatrix.length; i++) {
			for (int k = 0; k < this.adjacencyMatrix[i].length; k++) {
				this.adjacencyMatrix[i][k] = 0;
			}

		}

		for (int i = 0; i < this.viewed.length; i++) {
			this.viewed[i] = -1;
		}

	}

	public void InsertGraph(String data) {
		Vertex newVertex = new Vertex(data);
		this.vertices[counter] = newVertex;
		this.viewed[counter] = 0;
		this.counter = counter + 1;
	}

	public boolean SearchGraph(String data) {

		boolean result = false;

		for (int i = 0; i < this.vertices.length; i++) {
			if (this.getVertices()[i] != null) {
				if (this.getVertices()[i].getData().equals(data)) {
					result = true;
				}
			}
		}

		return result;

	}

	public void DeleteGraph(String data) {

		int index = -1;

		// Delete data

		for (int i = 0; i < this.vertices.length; i++) {
			if (this.getVertices()[i] != null) {
				if (this.getVertices()[i].getData().equals(data)) {
					this.getVertices()[i] = null;
					this.getViewed()[i] = 1;
					index = i;
				}
			}
		}

		// Delete Arch

		if (index != -1) {
			for (int i = 0; i < this.adjacencyMatrix.length; i++) {
				this.adjacencyMatrix[index][i] = 0;
				this.adjacencyMatrix[i][index] = 0;
			}
		}

	}

	public void ListGraph() {

		System.out.println("List Grahp");

		System.out.print("Graph={");
		for (int i = 0; i < this.vertices.length; i++) {
			if (this.getVertices()[i] != null) {
				System.out.print(this.getVertices()[i].getData() + ",");
			}
		}
		System.out.println("}");

	}

	public void InsertArch(int x, int y, int arc) {

		adjacencyMatrix[x][y] = arc;

	}

	public void UpdateGraph(String olddata, String newdata) {

		for (int i = 0; i < this.vertices.length; i++) {
			if (this.getVertices()[i] != null) {
				if (this.getVertices()[i].getData().equals(olddata)) {
					this.getVertices()[i].setData(newdata);
				}
			}
		}
	}

	public void Vewed(int vertex) {
		if (vertex != -1) {
			if (this.getViewed()[vertex] > -1 && this.getViewed()[vertex] < 1 && this.cunterviewed < this.counter - 1) {
				this.getViewed()[vertex] = 1;
				this.cunterviewed = this.cunterviewed + 1;
				Vewed(MinimalCost(vertex));
			}
		}
	}

	public int MinimalCost(int vertex) {

		int cost = 0;
		int costaux = 0;
		int index = -1;
		int index2 = -1;

		for (int i = 0; i < this.vertices.length; i++) {
			if (this.getVertices()[i] != null) {
				if (this.getAdjacencyMatrix()[vertex][i + 1] < this.getAdjacencyMatrix()[vertex][i]) {
					if (this.getAdjacencyMatrix()[vertex][i] > -1) {
						if (this.getAdjacencyMatrix()[vertex][i] > 0) {
							cost = this.getAdjacencyMatrix()[vertex][i];
							if (cost < costaux) {
								cost = this.getAdjacencyMatrix()[vertex][i];
								index = i;
								costaux = cost;
								index2 = index;
							}
							if (costaux == 0) {
								costaux = cost;
								index2 = index;
							}
							if (cost > costaux) {
								cost = costaux;
								index = index2;
							}
						}
					}
					this.getAdjacencyMatrix()[vertex][i] = -1;
				}

			}
		}

		this.minimalcost = this.minimalcost + cost;
		return index;

	}
}
