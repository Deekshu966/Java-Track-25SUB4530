package graphs;

public class GraphExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		graph.addEdge("A", "B");
		graph.addEdge("A", "C");
		graph.addEdge("B", "D");
		graph.addEdge("C", "D");
		graph.addEdge("D", "E");		
		graph.display();
		graph.bfs("A");
		System.out.println();
		graph.dfs("A");
		
		System.out.println("Removing edge A-B");
		graph.removeEdge("A", "B");
		graph.display();
		
		System.out.println("Removing vertex A");
		graph.removeVertex("A");
		graph.display();
		
	}

}
