package graphs;

public class DijkstrasAlgorithmTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DjkstrasAlgorithm graph = new DjkstrasAlgorithm(6);
		graph.addEdge(1, 2, 4);
		graph.addEdge(1, 3, 2);
		graph.addEdge(2, 3, 1);
		graph.addEdge(2, 4, 5);
		graph.addEdge(3, 2, 1);
		graph.addEdge(3, 4, 8);
		graph.addEdge(3, 5, 10);
		graph.addEdge(4, 5, 2);
		graph.dijkstras(2);
	}

}
