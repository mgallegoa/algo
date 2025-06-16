package com.co.manuel.algorithms.trees;

/*
 * This class contain the Binary Search Tree implementation:
 *
 * Note: To allow duplicate use AVL/Red-Black multi set tree (create new attribute count)
 *
 * 1. printInOrderTree to print the Binary Search Tree in-Order traversal.
 * 2. Insert to insert a value in a Binary Search Tree.
 * 3. Search a key in a Binary Search Tree.
 * 4. Validate if BST is valid: 1) If go left min equal and max change to parent. 2) If go right min change to parent and max equal.
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

  public void printInOrderTree(TreeNode root) {
    if (root == null) {
      return;
    }
    printInOrderTree(root.left);
    System.out.print(root.data + " ");
    printInOrderTree(root.rigth);
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

  public TreeNode search(TreeNode root, int key) {
    if (root == null || root.data == key) {
      return root;
    }
    if (key < root.data) {
      return search(root.left, key);
    } else {
      return search(root.rigth, key);
    }
  }

  public boolean validate(TreeNode root, long min, long max) {
    if (root == null) {
      return true;
    }
    if (root.data <= min || root.data >= max) {
      return false;
    }
    boolean left = validate(root.left, min, root.data);
    if (left) {
      boolean right = validate(root.rigth, root.data, max);
      return right;
    }
    return false;

  }

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(5);
    bst.insert(3);
    bst.insert(7);
    bst.insert(1);
    System.out.println("Print the creation of Binary Search Tree");
    bst.printInOrderTree(bst.root);
    System.out.println("");
    TreeNode result = bst.search(bst.root, 17);
    System.out.println("Print the node with the value: " + (result == null ? "Not found" : result.data));
    System.out.println("Validate if it is a correct Binary Search Tree: "
        + bst.validate(bst.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
  }

}
