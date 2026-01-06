package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class DjkstrasAlgorithm {
	
	static class Edge{

		int dest;
		int weight;

		public Edge(int dest, int weight) {
			this.dest = dest;
			this.weight = weight;
		}
	}
	
	private int vertices;
	private List<List<Edge>> adjacencyList;
	
	public DjkstrasAlgorithm(int vertices) {
		this.vertices = vertices;
		adjacencyList = new java.util.ArrayList<>();
		for (int i = 0; i < vertices; i++) {
			adjacencyList.add(new ArrayList<>());
		}
	}
	
	// Add edge
	public void addEdge(int src, int dest, int weight) {
		adjacencyList.get(src).add(new Edge(dest, weight));
		adjacencyList.get(dest).add(new Edge(src, weight)); // For undirected graph
	}
	
	public void dijkstras(int start) {
		int[] distances = new int[vertices];
		Arrays.fill(distances, Integer.MAX_VALUE);
		distances[start] = 0;
		
		PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
		pq.add(new int[] {start, 0});
		
		boolean[] visited = new boolean[vertices];
		
		while (!pq.isEmpty()) {
			int[] current = pq.poll();
			int currentVertex = current[0];

			if (visited[currentVertex])
				continue;
			visited[currentVertex] = true;

			for (Edge edge : adjacencyList.get(currentVertex)) {
				if (!visited[edge.dest]) {
					int newDist = distances[currentVertex] + edge.weight;
					if (newDist < distances[edge.dest]) {
						distances[edge.dest] = newDist;
						pq.add(new int[] { edge.dest, newDist });
					}
				}
			}
		}
		printShortestPaths(distances, start);
		
	}
	
	public void printShortestPaths(int[] distances, int source) {
		System.out.println("Shortest paths from vertex " + source + ":");
		for (int i = 0; i < distances.length; i++) {
			System.out.println("To vertex " + i + " - Distance: " + distances[i]);
		}
	}

}
