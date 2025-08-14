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
    private TreeNode right;

    public TreeNode(int data) {
      this.data = data;
    }
  }

  public void printInOrderTree(TreeNode root) {
    if (root == null) {
      return;
    }
    System.out.print("root: ");
    printInOrderTree(root.left);
    System.out.print(root.data + " ");
    printInOrderTree(root.right);
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
      root.right = insert(root.right, value);
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
      return search(root.right, key);
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
      boolean right = validate(root.right, root.data, max);
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

    //// Second example, see the file BinarySearchTree.txt
    System.out.println("Insert in BinaryTree int, see file BinarySearchTree.txt");
    BinarySearchTree binarySearchTree = new BinarySearchTree();
    binarySearchTree.insert(5);
    binarySearchTree.insert(3);
    binarySearchTree.insert(6);
    binarySearchTree.insert(7);
    binarySearchTree.insert(8);
    binarySearchTree.insert(2);
    binarySearchTree.insert(1);

    binarySearchTree.insert(10);
    binarySearchTree.insert(11);
    binarySearchTree.insert(12);
    binarySearchTree.insert(13);
    binarySearchTree.insert(14);
    binarySearchTree.insert(15);
    binarySearchTree.insert(9);

    binarySearchTree.printInOrderTree(binarySearchTree.root);
    System.out.println("");

    TreeNode first = binarySearchTree.new TreeNode(1);
    TreeNode second = binarySearchTree.new TreeNode(2);
    TreeNode three = binarySearchTree.new TreeNode(3);
    TreeNode five = binarySearchTree.new TreeNode(5);
    TreeNode six = binarySearchTree.new TreeNode(6);
    TreeNode seven = binarySearchTree.new TreeNode(7);
    TreeNode eight = binarySearchTree.new TreeNode(8);

    TreeNode ten = binarySearchTree.new TreeNode(10);
    TreeNode eleven = binarySearchTree.new TreeNode(11);
    TreeNode twelve = binarySearchTree.new TreeNode(12);
    TreeNode thirteen = binarySearchTree.new TreeNode(13);
    TreeNode fourteen = binarySearchTree.new TreeNode(14);
    TreeNode fifteen = binarySearchTree.new TreeNode(15);
    TreeNode nine = binarySearchTree.new TreeNode(9);

    // five.left = three;
    // five.right = six;
    // three.left = first;
    // first.left = second;
    // six.right = seven;
    // seven.right = eight;
    // binarySearchTree.printInOrder(five);

    five.left = three;
    five.right = six;
    three.left = second;
    second.left = first;
    six.right = seven;
    seven.right = eight;
    eight.right = ten;
    ten.right = eleven;
    ten.left = nine;
    eleven.right = twelve;
    twelve.right = thirteen;
    thirteen.right = fourteen;
    fourteen.right = fifteen;
    binarySearchTree.printInOrderTree(five);

  }

}
