package com.co.manuel.algorithms.graphs;

/*
 * Representation of a UN-Directional Graph.
 *
 * The graph have vertices (nodes) and Edges (connectors).
 * This graph indicate the relation for both vertices.
 *
 * (0)-----(1)
 * |        |
 * |        |
 * (3)-----(2)
 *
 **/
public class UndirectionGraph {

  private int V; // number of vertices of Graph.
  private int E; // Number of Edges in the Graph.
  private int[][] adjacentMatrix;

  public UndirectionGraph(int nodes) {
    this.V = nodes;
    this.E = 0;
    this.adjacentMatrix = new int[nodes][nodes];
  }

  public void addEdge(int u, int v) {
    this.adjacentMatrix[u][v] = 1;
    this.adjacentMatrix[v][u] = 1;
    this.E++;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(V + " vertices, " + this.E + " edges " + "\n");
    for (int i = 0; i < this.V; i++) {
      sb.append(i + ": ");
      for (int j = 0; j < adjacentMatrix[i].length; j++) {
        sb.append(this.adjacentMatrix[i][j] + " ");

      }
      sb.append("\n");
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    UndirectionGraph ug = new UndirectionGraph(4);
    ug.addEdge(0, 1);
    ug.addEdge(1, 2);
    ug.addEdge(2, 3);
    ug.addEdge(3, 0);
    System.out.println(ug);
  }

}
