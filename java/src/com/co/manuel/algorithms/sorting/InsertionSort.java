package com.co.manuel.algorithms.sorting;

import com.co.manuel.algorithms.array.Utils;

/**
 * It is like organize the carts in the hand, inserting an element in the right
 * order.
 *
 * To do that:
 * 1. Divide the array in two parts, sorted part and unsorted part.
 * 2. Then shift every element from unsorted part to the sorted part.
 */
public class InsertionSort {

  public int[] insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > temp) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = temp;
    }
    return arr;
  }

  public static void main(String[] args) {
    InsertionSort is = new InsertionSort();
    int[] unsortedArr = new int[] { 5, 1, 2, 9, 10 };
    Utils.printArray(unsortedArr);
    System.out.println("Sort the array using the Insertion Sort algorithm -->");
    int[] sortedArr = is.insertionSort(unsortedArr);
    Utils.printArray(sortedArr);
  }

}
