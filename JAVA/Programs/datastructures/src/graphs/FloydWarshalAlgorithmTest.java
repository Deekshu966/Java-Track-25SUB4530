package graphs;

public class FloydWarshalAlgorithmTest {
	static final int INF = 99999;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 5;
		int[][] graph = {
				{0,   4,  2, INF,INF},
                {4, 0,   1, 5,INF},
                {2, 1, 0,   8, 10},
                {INF, 5, 8, 0,2},
                {INF,INF,10,2,0}
        };
		
	    FloydWarshalAlgorithm fwa = new FloydWarshalAlgorithm();
	    fwa.floydWarshal(graph, V);

	}


}