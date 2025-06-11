package com.co.manuel.algorithms.list;

import java.util.EmptyStackException;

public class Stack {

  private ListNode top;
  private int length;

  private class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
    }
  }

  public Stack() {
    this.top = null;
    this.length = 0;
  }

  public int getLenght() {
    return this.length;
  }

  public boolean isEmpty() {
    return this.length == 0;
  }

  public void push(int data) {
    ListNode newNode = new ListNode(data);
    newNode.next = this.top;
    this.top = newNode;
    this.length++;
  }

  public ListNode pop() {
    ListNode nodeToDelete = this.top;
    this.top = this.top.next;
    this.length--;
    return nodeToDelete;
  }

  public int peek() {
    if (this.isEmpty()) {
      throw new EmptyStackException();

    }
    return this.top.data;
  }

  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(3);
    stack.push(4);
    stack.push(5);

    System.out.println(stack.peek());
    stack.pop();
    System.out.println(stack.peek());
    stack.pop();
    System.out.println(stack.peek());
    stack.pop();
  }

}
