package com.co.manuel.algorithms.trees;

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
  }

  public void preOrderRecursive(TreeNode root) {
    if (root == null) {
      return;
    }

    System.out.println(root.data + " ");
    preOrderRecursive(root.left);
    preOrderRecursive(root.right);
  }

  public static void main(String[] args) {
    BinaryTree bt = new BinaryTree();
    bt.createBinaryTree();
    bt.preOrderRecursive(bt.root);
  }
}
