package com.co.manuel.algorithms.sorting;

import com.co.manuel.algorithms.array.Utils;

/**
 * Selection Sort is only used when swapping element have a high cost.
 *
 * This algorithm is inefficient in general. The number of pass is n - 1
 *
 * This work: repeatedly finding the minimum in an unsorted array and shift to
 * sorted part array:
 * 1. From unsorted part we pick the minimum element and shift to the last part
 * of the sorted array.
 * 2. It is repeated till unsorted array is not empty.
 */
public class SelectionSort {

  public int[] selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
    return arr;
  }

  public static void main(String[] args) {
    SelectionSort ss = new SelectionSort();
    int[] unsortedArr = new int[] { 5, 1, 2, 9, 10 };
    Utils.printArray(unsortedArr);
    System.out.println("Sort the array using the Selection Sort algorithm -->");
    int[] sortedArr = ss.selectionSort(unsortedArr);
    Utils.printArray(sortedArr);
  }

}
