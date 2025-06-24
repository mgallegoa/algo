package com.co.manuel.algorithms.hashTable;

/**
 * Complexity of O(1)
 * Internal representation of a HashTable:
 * 1. Store each key using Modulo % (value % 10).
 * Note: Java do --> hash & (size - 1) : Faster, example:
 * hash = 123456 and size = 16, then
 * 123456 = 0001 1110 0010 0000 0000 (20 bits)
 * (size - 1) 15 = 0000 0000 0000 0000 1111
 * Now -->
 * 0001 1110 0010 0000 0000
 * & 0000 0000 0000 0000 1111
 * ---------------------------
 * 0000 0000 0000 0000 0000
 *
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

  public int getBucketIndex(Integer key) {
    return key % numOfBuckets;
  }

  /*
   * Using Separate Chaining technique.
   */
  public void put(Integer key, String value) {
    if (key == null || value == null) {
      throw new IllegalArgumentException("key or value can't be null");
    }
    int index = getBucketIndex(key);
    HashNode head = buckets[index];
    while (head != null) {
      if (head.key.equals(key)) {
        head.value = value;
        return;
      }
      head = head.next;
    }
    size++;
    head = buckets[index];
    HashNode newNode = new HashNode(key, value);
    newNode.next = head;
    buckets[index] = newNode;
  }

  public String get(Integer key) {
    if (key == null) {
      throw new IllegalArgumentException("get key can't be null");
    }
    int index = getBucketIndex(key);
    HashNode head = buckets[index];
    while (head != null) {
      if (head.key.equals(key)) {
        return head.value;

      }
      head = head.next;
    }
    return null;
  }

  public String remove(Integer key) {
    if (key == null) {
      throw new IllegalArgumentException("remove key can't be null");
    }
    int index = getBucketIndex(key);
    HashNode head = buckets[index];
    HashNode previous = null;
    while (head != null) {
      if (head.key.equals(key)) {
        break;
      }
      previous = head;
      head = head.next;
    }
    if (head == null) {
      return null;
    }
    this.size--;
    if (previous == null) {
      buckets[index] = head.next;
    } else {
      previous.next = head.next;
    }

    return head.value;
  }

  public static void main(String[] args) {
    System.out.println("Implementation an internal representation of a HashTable, this is O(1)-->");
    HashTable ht = new HashTable();
    System.out.println("size: " + ht.size());
    ht.put(105, "Manuel");
    ht.put(21, "Fernando");
    System.out.println("size: " + ht.size());
    ht.put(105, "Arias");
    System.out.println("size (add duplicated key): " + ht.size());
    System.out.println("Test the get method: " + ht.get(105));
    System.out.println("Test the remove method: " + ht.remove(105));
    System.out.println("size (after remove key): " + ht.size());
  }

}
