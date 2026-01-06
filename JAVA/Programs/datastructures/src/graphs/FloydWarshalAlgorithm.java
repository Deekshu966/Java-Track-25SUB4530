package graphs;

public class FloydWarshalAlgorithm {
	
	static final int INF = 99999;
	
	// Step-1 initialize distane matrix

	public void floydWarshal(int[][] graph, int V) {
		int[][] dist = new int[V+1][V+1];

		// Initialize the distance matrix
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				dist[i][j] = graph[i][j];
			}
		}

		// Step-2 update the distance matrix
		for (int k = 0; k < V; k++) {
			for (int i = 0; i < V; i++) {
				for (int j = 0; j < V; j++) {
					if (dist[i][k] + dist[k][j] < dist[i][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}

		// Print the shortest distance matrix
		printSolution(dist, V);
		
	}
	
	public void printSolution(int[][] dist, int V) {
		System.out.println("The shortest distance matrix is:");
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				if (dist[i][j] == INF) {
					System.out.print("INF ");
				} else {
					System.out.print(dist[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

}
