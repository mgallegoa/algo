package com.co.manuel.algorithms.searching;

/*
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not found, return the index where it would be if it were inserted in order.
 * The algorithm should run in O(log n) time.
 */
public class BinarySearchTargetNum {

  public int foundTarget(int[] arr, int key) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == key) {
        return mid;
      }
      if (key < arr[mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return low;

  }

  public static void main(String[] args) {
    System.out.println(
        "Return the index if the target is found. If not found, return the index where it would be if it were inserted in order.");
    BinarySearchTargetNum bst = new BinarySearchTargetNum();
    int[] arr = { 5, 8, 20, 77, 105 };
    System.out.println("result: " + bst.foundTarget(arr, 75));

  }
}
