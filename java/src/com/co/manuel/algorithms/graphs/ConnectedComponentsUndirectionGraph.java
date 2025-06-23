package com.co.manuel.algorithms.graphs;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Implementation of algorithm for Connected Components (Vertices) in an UN
 * Direction Graph.
 *
 * Considerations:
 * 1. Use the recursive approach for the DFS Depth First Search.
 * 2. Using LinkedList to connect nodes.
 * 3. This use two int arrays: One to store visited and other to store connected
 * components (Vertices)
 * 4. The Vertices are integer numbers in order
 * 
 */
public class ConnectedComponentsUndirectionGraph {
  private LinkedList<Integer>[] adj;
  private int V; // Number of Vertices
  private int E; // Number of Edges
  private int[] connectedIds;

  public ConnectedComponentsUndirectionGraph(int nodes) {
    this.V = nodes;
    this.E = 0;
    @SuppressWarnings("unchecked")
    LinkedList<Integer>[] temp = (LinkedList<Integer>[]) new LinkedList[nodes];
    this.adj = temp;
    for (int v = 0; v < this.V; v++) {
      this.adj[v] = new LinkedList<>();
    }
  }

  public void addEdge(int u, int v) {
    adj[u].add(v);
    adj[v].add(u);
    this.E++;
  }

  public void connectedComponentsDFS() {
    boolean[] visited = new boolean[this.V];
    int[] compId = new int[this.V];
    int count = 0;
    for (int v = 0; v < this.V; v++) {
      if (!visited[v]) {
        recursiveDFS(v, visited, compId, count);
        count++;
      }

    }
    this.connectedIds = compId;
  }

  public void recursiveDFS(int v, boolean[] visited, int[] compId, int count) {
    visited[v] = true;
    compId[v] = count;
    for (int w : this.adj[v]) {
      if (!visited[w]) {
        recursiveDFS(w, visited, compId, count);
      }
    }
  }

  public int[] getConnectedIds() {
    return this.connectedIds;
  }

  public static void main(String[] args) {
    ConnectedComponentsUndirectionGraph cc = new ConnectedComponentsUndirectionGraph(5);
    cc.addEdge(0, 1);
    cc.addEdge(0, 3);
    cc.addEdge(2, 4);
    System.out.println(
        "Find the connected components of a UN Directional Graph using Depth First Search BFS algorithm:");
    System.out.println(Arrays.toString(cc.adj));
    cc.connectedComponentsDFS();
    System.out.println("");
    System.out.println("The next array is result of the connecteds ids -->");
    System.out.println(Arrays.toString(cc.getConnectedIds()));
  }
}
