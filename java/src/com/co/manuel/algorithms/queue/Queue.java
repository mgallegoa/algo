package com.co.manuel.algorithms.queue;

import java.util.NoSuchElementException;

/*
 * Implement Queue methods, FILO
 */
public class Queue {

  private ListNode first;
  private ListNode rear;
  private int length;

  private class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
    }
  }

  public int lenght() {
    return this.length;
  }

  public boolean isEmpty() {
    return this.length == 0;
  }

  public void print() {
    if (first == null) {
      return;
    }
    ListNode temp = first;
    while (temp != null) {
      System.out.print(temp.data + " --> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void enQueue(int data) {
    ListNode newNode = new ListNode(data);
    if (first == null) {
      first = newNode;
    } else {
      rear.next = newNode;
    }
    rear = newNode;
    length++;
  }

  public int deQueue() {
    if (isEmpty()) {
      throw new NoSuchElementException("Empty queue");

    }
    int data = first.data;
    first = first.next;
    if (first == null) {
      this.rear = first;
    }
    length--;
    return data;
  }

  public static void main(String[] args) {
    Queue qe = new Queue();
    qe.enQueue(10);
    qe.enQueue(15);
    qe.enQueue(20);
    qe.print();
    qe.deQueue();
    qe.print();
    qe.deQueue();
    qe.print();
    qe.deQueue();
    qe.print();
  }

}
