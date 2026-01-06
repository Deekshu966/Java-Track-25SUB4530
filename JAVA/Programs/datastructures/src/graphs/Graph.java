package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Graph {
	
	Map<String,List<String>> adjacencyList ;
	
	public Graph() {
		adjacencyList = new HashMap<>();
	}
	
	// Add a vertex to the graph
	public void addVertex(String vertex) {
		adjacencyList.putIfAbsent(vertex, new ArrayList<>());
	}
	
	// Add an edge to the graph
	public void addEdge(String from, String to) {
		addVertex(from);
		addVertex(to);
		adjacencyList.get(from).add(to);
		adjacencyList.get(to).add(from); // For undirected graph
	}
	
	// Display the graph
	public void display() {
		System.out.println("Graph adjacency list:");
		for (String vertex : adjacencyList.keySet()) {
			System.out.println(vertex + " -> " + adjacencyList.get(vertex));
		}
	}
	
	// Remove an edge from the graph
	public void removeEdge(String from, String to) {
        if (adjacencyList.containsKey(from)) {
            adjacencyList.get(from).remove(to);
        }
        if (adjacencyList.containsKey(to)) {
            adjacencyList.get(to).remove(from);
        }
    }
	
	// Remove an vertex from the graph
	public void removeVertex(String vertex) {
		if(!adjacencyList.containsKey(vertex)) {
			System.out.println("Vertex not found in the graph.");
			return;
		}
		for (String v : adjacencyList.keySet()) {
			adjacencyList.get(v).remove(vertex);
		}
		adjacencyList.remove(vertex);
	}

	// Breadth First Search Traverse
	public void bfs(String start) {
		// Implementation here
		if (!adjacencyList.containsKey(start)) {
			System.out.println("Start vertex not found in the graph.");
			return;
		}
		Set<String> visited = new HashSet<>();
		Queue<String> queue = new LinkedList<>();
		visited.add(start);
		queue.add(start);
		
		System.out.print("BFS Traversal: ");
		while (!queue.isEmpty()) {
			String vertex = queue.poll();
			System.out.print(vertex + " -- ");
			for (String neighbor : adjacencyList.get(vertex)) {
				if (!visited.contains(neighbor)) {
					visited.add(neighbor);
					queue.add(neighbor);
				}
			}
		}
	}
	
	// Depth First Search Traversal
	public void dfs(String start) {
		// Implementation here
		if (!adjacencyList.containsKey(start)) {
			System.out.println("Start vertex not found in the graph.");
			return;
		}
		Set<String> visited = new HashSet<>();
		System.out.print("DFS Traversal: ");
		dfsHelper(start, visited);
	}
	
	private void dfsHelper(String vertex, Set<String> visited) {
		visited.add(vertex);
		System.out.print(vertex + " -- ");
		for (String neighbor : adjacencyList.get(vertex)) {
			if (!visited.contains(neighbor)) {
				dfsHelper(neighbor, visited);
			}
		}
	}
	

}
