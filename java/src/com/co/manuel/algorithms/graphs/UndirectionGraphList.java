package com.co.manuel.algorithms.graphs;

import java.util.LinkedList;

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

  public static void main(String[] args) {
    UndirectionGraphList ugl = new UndirectionGraphList(4);
    ugl.addEdge(0, 1);
    ugl.addEdge(1, 2);
    ugl.addEdge(2, 3);
    ugl.addEdge(3, 0);
    System.out.println(ugl);
  }
}
