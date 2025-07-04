package com.co.manuel.algorithms.sorting;

import com.co.manuel.algorithms.array.Utils;

/*
 * It is a divide and conquer algorithm.
 *  
 */
public class MergeSort {

  public void mergeSort(int[] arr, int[] temp, int low, int high) {
    if (low < high) {
      int mid = low + (high - low) / 2;
      mergeSort(arr, temp, low, mid);
      mergeSort(arr, temp, mid + 1, high);

      merge(arr, temp, low, mid, high);
    }
  }

  public void merge(int[] arr, int[] temp, int low, int mid, int high) {
    for (int i = low; i <= high; i++) {
      temp[i] = arr[i];
    }
    int i = low;// Traverse left sorted array
    int j = mid + 1;// Traverse left sorted array
    int k = low;

    while (i < mid && j <= high) {
      if (temp[i] <= temp[j]) {
        arr[k] = temp[i];
        i++;
      } else {
        arr[k] = temp[j];
        j++;
      }
      k++;
    }

    while (i <= mid) {
      arr[k] = temp[i];
      k++;
      i++;
    }
  }

  public static void main(String[] args) {

    MergeSort ms = new MergeSort();
    int[] arr = new int[] { 9, 5, 2, 4, 3 };
    Utils.printArray(arr);
    System.out.println("Merge sort algorithm, using temp array -->");
    ms.mergeSort(arr, new int[arr.length], 0, arr.length - 1);
    Utils.printArray(arr);
  }

}
