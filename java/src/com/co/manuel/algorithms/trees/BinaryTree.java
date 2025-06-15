package com.co.manuel.algorithms.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
  private TreeNode root;

  private class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    private TreeNode(int data) {
      this.data = data;
    }
  }

  public void createBinaryTree() {
    TreeNode first = new TreeNode(9);
    TreeNode second = new TreeNode(2);
    TreeNode third = new TreeNode(3);
    TreeNode fourth = new TreeNode(4);

    this.root = first;
    first.left = second;
    first.right = third;

    second.left = fourth;

    System.out.println("       9");
    System.out.println("      /  \\ ");
    System.out.println("     2     3");
    System.out.println("    /       ");
    System.out.println("   4      ");

  }

  public void preOrderRecursive(TreeNode root) {
    if (root == null) {
      return;
    }

    System.out.print(root.data + " ");
    preOrderRecursive(root.left);
    preOrderRecursive(root.right);
  }

  public void preOrderIperative(TreeNode root) {
    if (root == null) {
      return;
    }

    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode temp = stack.pop();
      System.out.print(temp.data + " ");
      if (temp.right != null) {
        stack.push(temp.right);
      }
      if (temp.left != null) {
        stack.push(temp.left);
      }
    }

  }

  public void inOrderRecursive(TreeNode root) {
    if (root == null) {
      return;
    }

    inOrderRecursive(root.left);
    System.out.print(root.data + " ");
    inOrderRecursive(root.right);
  }

  public void inOrderIperative(TreeNode root) {
    if (root == null) {
      return;
    }

    Stack<TreeNode> stack = new Stack<>();
    TreeNode temp = root;
    while (!stack.isEmpty() || temp != null) {
      if (temp != null) {
        stack.push(temp);
        temp = temp.left;
      } else {
        temp = stack.pop();
        System.out.print(temp.data + " ");
        temp = temp.right;
      }

    }

  }

  public void postOrderRecursive(TreeNode root) {
    if (root == null) {
      return;
    }

    postOrderRecursive(root.left);
    postOrderRecursive(root.right);
    System.out.print(root.data + " ");
  }

  public void postOrderIperative(TreeNode root) {
    if (root == null) {
      return;
    }

    TreeNode current = root;
    Stack<TreeNode> stack = new Stack<>();
    while (!stack.isEmpty() || current != null) {
      if (current != null) {
        stack.push(current);
        current = current.left;
      } else {
        TreeNode temp = stack.peek().right;
        if (temp == null) {
          temp = stack.pop();
          System.out.print(temp.data + " ");
          while (!stack.isEmpty() && temp == stack.peek().right) {
            temp = stack.pop();
            System.out.print(temp.data + " ");
          }
        } else {
          current = temp;

        }
      }

    }

  }

  public void levelOrderIperative(TreeNode root) {
    if (root == null) {
      return;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      TreeNode temp = queue.poll();
      System.out.print(temp.data + " ");
      if (temp.left != null) {
        queue.offer(temp.left);
      }
      if (temp.right != null) {
        queue.offer(temp.right);
      }
    }

  }

  public static void main(String[] args) {
    BinaryTree bt = new BinaryTree();
    bt.createBinaryTree();
    System.out.println("Print in recursive pre-Order: ");
    bt.preOrderRecursive(bt.root);
    System.out.println("");
    System.out.println("Now print in Imperative pre-Order: ");
    bt.preOrderIperative(bt.root);
    System.out.println("");
    System.out.println("Print in recursive in-Order: ");
    bt.inOrderRecursive(bt.root);
    System.out.println("");
    System.out.println("Now print in Imperative in-Order: ");
    bt.inOrderIperative(bt.root);
    System.out.println("");
    System.out.println("Print in recursive post-Order: ");
    bt.postOrderRecursive(bt.root);
    System.out.println("");
    System.out.println("Now print in Imperative post-Order: ");
    bt.postOrderIperative(bt.root);
    System.out.println("");
    System.out.println("Print in Imperative level-Order: ");
    bt.levelOrderIperative(bt.root);
  }
}
