package graphs;

import java.util.*;

//Class to represent an edge
class Edge implements Comparable<Edge> {
 int src, dest, weight;

 Edge(int src, int dest, int weight) {
     this.src = src;
     this.dest = dest;
     this.weight = weight;
 }

 // Sort edges by weight
 @Override
 public int compareTo(Edge other) {
     return this.weight - other.weight;
 }
}

//Disjoint Set (Union-Find) class
class DisjointSet {
 int[] parent, rank;

 DisjointSet(int n) {
     parent = new int[n];
     rank = new int[n];

     // Initialize each vertex as its own parent
     for (int i = 0; i < n; i++) {
         parent[i] = i;
         rank[i] = 0;
     }
 }

 // Find with path compression
 int find(int x) {
     if (parent[x] != x) {
         parent[x] = find(parent[x]);
     }
     return parent[x];
 }

 // Union by rank
 void union(int x, int y) {
     int rootX = find(x);
     int rootY = find(y);

     if (rootX != rootY) {
         if (rank[rootX] < rank[rootY]) {
             parent[rootX] = rootY;
         } else if (rank[rootX] > rank[rootY]) {
             parent[rootY] = rootX;
         } else {
             parent[rootY] = rootX;
             rank[rootX]++;
         }
     }
 }
}

public class KruskalMST {

 static void kruskalMST(int vertices, List<Edge> edges) {
     // Sort edges by weight
     Collections.sort(edges);

     DisjointSet ds = new DisjointSet(vertices);
     List<Edge> mst = new ArrayList<>();

     for (Edge edge : edges) {
         int u = edge.src;
         int v = edge.dest;

         // Check if including this edge forms a cycle
         if (ds.find(u) != ds.find(v)) {
             mst.add(edge);
             ds.union(u, v);
         }
     }

     // Print MST
     int totalWeight = 0;
     System.out.println("Edges in the Minimum Spanning Tree:");
     for (Edge e : mst) {
         System.out.println(e.src + " - " + e.dest + " : " + e.weight);
         totalWeight += e.weight;
     }
     System.out.println("Total weight of MST: " + totalWeight);
 }

 public static void main(String[] args) {
     int vertices = 4;

     List<Edge> edges = new ArrayList<>();
     edges.add(new Edge(0, 1, 10));
     edges.add(new Edge(0, 2, 6));
     edges.add(new Edge(0, 3, 5));
     edges.add(new Edge(1, 3, 15));
     edges.add(new Edge(2, 3, 4));

     kruskalMST(vertices, edges);
 }
}
