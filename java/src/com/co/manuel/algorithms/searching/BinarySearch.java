package com.co.manuel.algorithms.searching;

public class BinarySearch {

  public int binarySearch(int[] arr, int key) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int midle = (high + low) / 2;
      if (arr[midle] == key) {
        return midle;
      }
      if (key < arr[midle]) {
        high = midle - 1;
      } else {
        low = midle + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    BinarySearch bs = new BinarySearch();
    int[] arr = { 1, 10, 20, 47, 59, 65, 75, 88, 99 };
    int result = bs.binarySearch(arr, 75);
    System.out.println("Binary search result, index found : " + result);

  }
}
