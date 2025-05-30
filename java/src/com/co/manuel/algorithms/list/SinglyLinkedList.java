package com.co.manuel.algorithms.list;

public class SinglyLinkedList {

  private ListNode head;

  private static class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
      this.next = null;

    }
  }

  public void display() {
    ListNode current = head;
    while (current != null) {
      System.out.print(current.data + " ->");
      current = current.next;
    }
    System.out.println("null");

  }

  public void insertFirst(int value) {
    ListNode newNode = new ListNode(value);
    newNode.next = head;
    head = newNode;
  }

  public void insertPosition(int value, int position) {

  }

  public void insertLast(int value) {
    ListNode newNode = new ListNode(value);
    if (head == null) {
      head = newNode;
      return;
    }
    ListNode current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newNode;

  }

  public int length() {
    int count = 0;
    ListNode current = head;
    while (current != null) {
      count++;
      current = current.next;
    }
    return count;
  }

  public static void main(String[] args) {
    SinglyLinkedList sll = new SinglyLinkedList();
    sll.head = new ListNode(10);
    ListNode second = new ListNode(2);
    ListNode third = new ListNode(8);
    ListNode fourth = new ListNode(11);

    sll.head.next = second;
    second.next = third;
    third.next = fourth;

    sll.display();
    System.out.println("The leng of list " + sll.length());
  }

}
