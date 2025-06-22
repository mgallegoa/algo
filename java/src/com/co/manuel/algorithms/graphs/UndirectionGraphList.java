package com.co.manuel.algorithms.graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * This is a UN Direction Graph using LinkedList.
 *
 * 1. The method traversalBFS used the Breadth First Search (BFS) algorithm to
 * traversal the Graph.
 * 2. The method traversalDFS used the Depth First Search (BFS) algorithm to
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

  /*
   * Traversal using Breath First Search
   */
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

  /*
   * Traversal using Depth First Search
   */
  public void traversalDFS(int start) {
    boolean[] visited = new boolean[this.V];

    Stack<Integer> stack = new Stack<>();
    stack.push(start);

    while (!stack.isEmpty()) {
      int u = stack.pop();
      if (!visited[u]) {
        visited[u] = true;
        System.out.print(u + " ");
        for (int v : this.adj[u]) {
          if (!visited[v]) {
            stack.push(v);
          }
        }
      }
    }
  }

  /*
   * Traversal using Depth First Search, recursive
   */
  public void traversalRecursiveDFS() {
    boolean[] visited = new boolean[this.V];
    for (int v = 0; v < this.V; v++) {
      if (!visited[v]) {
        recursiveDFS(v, visited);
      }
    }
  }

  public void recursiveDFS(int v, boolean[] visited) {
    visited[v] = true;
    System.out.print(v + " ");
    for (int w : this.adj[v]) {
      if (!visited[w]) {
        recursiveDFS(w, visited);
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
    System.out.println("");
    System.out.println("Traverse the UN Directional Graph using Depth First Search DFS algorithm:");
    ugl.traversalDFS(0);
    System.out.println("");
    System.out.println("Traverse the UN Directional Graph using recursive Depth First Search DFS algorithm:");
    ugl.traversalRecursiveDFS();
  }
}
