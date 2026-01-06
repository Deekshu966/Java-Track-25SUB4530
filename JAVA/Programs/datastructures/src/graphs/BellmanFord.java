package graphs;
import java.util.*;

//Class to represent an edge (renamed)
class BFEdge {
 int src, dest, weight;

 BFEdge(int src, int dest, int weight) {
     this.src = src;
     this.dest = dest;
     this.weight = weight;
 }
}

public class BellmanFord {

 static void bellmanFord(int vertices, int edgesCount, BFEdge[] edges, int source) {
     int[] distance = new int[vertices];

     // Step 1: Initialize distances
     Arrays.fill(distance, Integer.MAX_VALUE);
     distance[source] = 0;

     // Step 2: Relax all edges V-1 times
     for (int i = 1; i <= vertices - 1; i++) {
         for (int j = 0; j < edgesCount; j++) {
             int u = edges[j].src;
             int v = edges[j].dest;
             int w = edges[j].weight;

             if (distance[u] != Integer.MAX_VALUE && distance[u] + w < distance[v]) {
                 distance[v] = distance[u] + w;
             }
         }
     }

     // Step 3: Check for negative weight cycle
     for (int j = 0; j < edgesCount; j++) {
         int u = edges[j].src;
         int v = edges[j].dest;
         int w = edges[j].weight;

         if (distance[u] != Integer.MAX_VALUE && distance[u] + w < distance[v]) {
             System.out.println("Graph contains a negative weight cycle");
             return;
         }
     }

     // Print shortest distances
     System.out.println("Vertex\tDistance from Source");
     for (int i = 0; i < vertices; i++) {
         if (distance[i] == Integer.MAX_VALUE)
             System.out.println(i + "\t\tINF");
         else
             System.out.println(i + "\t\t" + distance[i]);
     }
 }

 public static void main(String[] args) {
     int vertices = 5;
     int edgesCount = 8;

     BFEdge[] edges = new BFEdge[edgesCount];

     edges[0] = new BFEdge(0, 1, -1);
     edges[1] = new BFEdge(0, 2, 4);
     edges[2] = new BFEdge(1, 2, 3);
     edges[3] = new BFEdge(1, 3, 2);
     edges[4] = new BFEdge(1, 4, 2);
     edges[5] = new BFEdge(3, 2, 5);
     edges[6] = new BFEdge(3, 1, 1);
     edges[7] = new BFEdge(4, 3, -3);

     int source = 0;

     bellmanFord(vertices, edgesCount, edges, source);
 }
}
