package com.co.manuel.algorithms.trees;

/*
 * This class contain the Binary Search Tree implementation:
 * 1. Insert
 * 
 */
public class BinarySearchTree {

  private TreeNode root;

  private class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode rigth;

    public TreeNode(int data) {
      this.data = data;
    }
  }

  public void insert(int value) {
    this.root = insert(root, value);
  }

  public TreeNode insert(TreeNode root, int value) {
    if (root == null) {
      root = new TreeNode(value);
      return root;
    }
    if (value < root.data) {
      root.left = insert(root.left, value);
    } else {
      root.rigth = insert(root.rigth, value);
    }
    return root;
  }

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(5);
    bst.insert(3);
    bst.insert(7);
    bst.insert(1);
  }

}
