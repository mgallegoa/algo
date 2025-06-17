package com.co.manuel.algorithms.priorityQueueBinaryTree;

/*
 * Max Priority Queue (Max Heap) is a binary tree in which each node value is >= than the values of its children.
 *
 * 1. Insert or swim or shift-up a new value in maxPQ (Bottom-up Reheapify)
 * 2. Delete or sink or shift-down a value in maxPQ (Bottom-down Reheapify)
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

  protected void resize(int capacity) {
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

  public int deleteMax() {
    int max = heap[1];
    swap(1, n);
    n--;
    sink(1);
    heap[n + 1] = null;
    if (n > 0 && (n == (heap.length - 1) / 4)) {
      resize(heap.length / 2);
    }
    return max;
  }

  public void swap(int a, int b) {
    int temp = heap[a];
    heap[a] = heap[b];
    heap[b] = temp;
  }

  public void sink(int k) {
    while (2 * k <= n) {
      int j = 2 * k;
      if (j < n && heap[j] < heap[j + 1]) {
        j++;
      }
      if (heap[k] >= heap[j]) {
        break;
      }
      swap(k, j);
      k = j;
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
    System.out.println("The size of the array is: " + mpq.size());
    System.out.println("The result of the insert or swim or shift-up data is: ");
    mpq.printMaxHeap();
    System.out.println("");
    System.out.println("");
    System.out
        .println("Call to delete or sink or shift-down a max value in maxPQ, the max value was: " + mpq.deleteMax());
    System.out.println("The result of the delete or sink or shift-down a max value in maxPQ data is: ");
    mpq.printMaxHeap();
  }

}
