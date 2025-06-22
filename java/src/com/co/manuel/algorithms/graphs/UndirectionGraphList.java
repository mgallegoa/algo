package com.co.manuel.algorithms.graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This is a UN Direction Graph using LinkedList.
 *
 * The method traversalBFS used the Breadth First Search (BFS) algorithm to
 * traversal the Graph.
 *
 */
public class UndirectionGraphList {

  private LinkedList<Integer>[] adj;
  private int V; // number of vertices
  private int E; // number of edge

  public UndirectionGraphList(int nodes) {
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
    E++;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(V + " vertices, " + E + " edges " + " \n");
    for (int v = 0; v < this.V; v++) {
      sb.append(v + ": ");
      for (int w : this.adj[v]) {
        sb.append(w + " ");
      }
      sb.append(" \n");
    }
    return sb.toString();
  }

  public void traversalBFS(int start) {
    boolean[] visited = new boolean[this.V];

    Queue<Integer> q = new LinkedList<>();
    visited[start] = true;
    q.offer(start);

    while (!q.isEmpty()) {
      int u = q.poll();
      System.out.print(u + " ");
      for (int v : this.adj[u]) {
        if (!visited[v]) {
          visited[v] = true;
          q.offer(v);
        }
      }
    }
  }

  public static void main(String[] args) {
    UndirectionGraphList ugl = new UndirectionGraphList(5);
    ugl.addEdge(0, 1);
    ugl.addEdge(1, 2);
    ugl.addEdge(2, 3);
    ugl.addEdge(3, 0);
    ugl.addEdge(2, 4);
    System.out.println(ugl);
    System.out.println("Traverse the UN Directional Graph using Breadth First Search BFS algorithm:");
    ugl.traversalBFS(0);
  }
}
