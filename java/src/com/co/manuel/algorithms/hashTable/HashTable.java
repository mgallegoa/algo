package com.co.manuel.algorithms.hashTable;

/**
 * Complexity of O(1)
 * Internal representation of a HashTable:
 * 1. Store each key using Modulo % (value % 10).
 * 2. Using the Collision Resolution technique called chaining, with an array of
 * HashNode[] (similar to LinkedList). Use Trees for Java 8+
 * 3. Every index of the HashTable is called a bucket.
 * 4. The number of buckets are the length of the HashTable, also called
 * capacity.
 * 5. capacity != size, the size is the buckets used. So, if the HashTable only
 * have 3 buckets used, length=3.
 * 6. Each bucket have a HashNode with the head and subsequent are chains.
 *
 * The HashTable is an array from 0 to 9,
 *
 */
public class HashTable {

  private HashNode[] buckets;
  private int numOfBuckets;
  private int size;

  public HashTable() {
    this(10);
  }

  public HashTable(int capacity) {
    this.numOfBuckets = capacity;
    this.buckets = new HashNode[capacity];
    this.size = 0;
  }

  private class HashNode {
    private Integer key; // Can be generic type
    private String value; // Can be generic type
    private HashNode next;

    public HashNode(Integer key, String value) {
      this.key = key;
      this.value = value;
    }
  }

  public int size() {
    return this.size;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  /*
   * Using Separate Chaining technique.
   */
  public void put(Integer key, String value) {

  }

  public String get(Integer key) {
    return "";
  }

  public String remove(Integer key) {
    return "";
  }

  public static void main(String[] args) {
    System.out.println("Implementation an internal representation of a HashTable, this is O(1)-->");
    HashTable ht = new HashTable();
    System.out.println("size: " + ht.size());
  }

}
