package graphs;

import java.util.ArrayList;
import java.util.List;
public class KruskalMST {
class Edge implements Comparable<Edge>{
	int src,dest,weight;
	Edge(int src, int dest, int weight) {
		this.src=src;
		this.dest=dest;
		this.weight=weight;
	}

	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return this.weight - o.weight;
	}
	
}

class DisjointSet {
	int[] parent, rank;

	DisjointSet(int n) {
		parent = new int[n];
		rank = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			rank[i] = 0;
		}
	}
	// find with path Comparsisions
	int find(int u) {
		if (parent[u] != u) {
			parent[u] = find(parent[u]);
		}
		return parent[u];
	}
	
	// Union by Rank
	void union(int u, int v) {
		int rootU = find(u);
		int rootV = find(v);
		if (rootU != rootV) {
			if (rank[rootU] > rank[rootV]) {
				parent[rootV] = rootU;
			} else if (rank[rootU] < rank[rootV]) {
				parent[rootU] = rootV;
			} else {
				parent[rootV] = rootU;
				rank[rootU]++;
			}
		}
	}
}
class MSTGraph{
	int vertices;
	List<Edge> edges;

	MSTGraph(int vertices) {
		this.vertices = vertices;
		this.edges = new ArrayList<>();
	}

	public void addEdge(int src, int dest, int weight) {
		edges.add(new Edge(src, dest, weight));
	}
	
	void kruskalMST() {
		edges.sort(null);
		DisjointSet ds = new DisjointSet(vertices);
		List<Edge> mst = new java.util.ArrayList<>();
		int totalWeight = 0;

		for (Edge edge : edges) {
			int u = edge.src;
			int v = edge.dest;
			if (ds.find(u) != ds.find(v)) {
				ds.union(u, v);
				mst.add(edge);
				totalWeight += edge.weight;
			}
		}
		// print MST
		System.out.println("Edges in the Minimum Spanning Tree:");
		for (Edge edge : mst) {
			System.out.println(edge.src + " -- " + edge.dest + " == " + edge.weight);
		}
		System.out.println("Total weight of MST: " + totalWeight);
	}
}


}
