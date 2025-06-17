package com.co.manuel.algorithms.priorityQueueBinaryTree;

/*
 * Max Priority Queue (Max Heap) is a binary tree in which each node value is >= than the values of its children.
 *
 * Insert or swim a new value in maxPQ
*/
public class MaxPQ {

  private Integer[] heap;
  private int n; // size of the heap

  public MaxPQ(int capacity) {
    heap = new Integer[capacity + 1];
    n = 0;
  }

  public boolean isEmpty() {
    return n == 0;
  }

  public int size() {
    return n;
  }

  public void insert(int x) {
    if (n == heap.length - 1) {
      resize(2 * heap.length);
    }
    n++;
    heap[n] = x;
    swim(n);
  }

  private void resize(int capacity) {
    Integer[] temp = new Integer[capacity];
    for (int i = 0; i < heap.length; i++) {
      temp[i] = heap[i];
    }
    heap = temp;
  }

  private void swim(int k) {
    while (k > 1 && heap[k / 2] < heap[k]) {
      int temp = heap[k];
      heap[k] = heap[k / 2];
      heap[k / 2] = temp;
      k = k / 2; // To continue shifting up
    }
  }

  public void printMaxHeap() {
    for (int i = 1; i <= n; i++) {
      System.out.print(heap[i] + " ");
    }
  }

  public static void main(String[] args) {
    MaxPQ mpq = new MaxPQ(3);
    System.out.println(mpq.size());
    System.out.println(mpq.isEmpty());
    mpq.insert(4);
    mpq.insert(5);
    mpq.insert(2);
    mpq.insert(6);
    mpq.insert(1);
    mpq.insert(3);
    System.out.println(mpq.size());
    mpq.printMaxHeap();
  }

}
