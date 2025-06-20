package com.co.manuel.algorithms.sorting;

import com.co.manuel.algorithms.array.Utils;

public class QuickSort {

  public void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int p = partition(arr, low, high);
      quickSort(arr, low, p - 1);
      quickSort(arr, p + 1, high);
    }
  }

  public int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low;
    int j = low;
    while (i <= high) {
      if (arr[i] <= pivot) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
      }
      i++;
    }
    return j - 1;
  }

  public static void main(String[] args) {
    QuickSort qs = new QuickSort();
    int[] unsortedArr = new int[] { 5, 1, 2, 9, 10 };
    Utils.printArray(unsortedArr);
    System.out.println("Sort the array using the Quick Sort algorithm -->");
    qs.quickSort(unsortedArr, 0, unsortedArr.length - 1);
    int[] sortedArr = unsortedArr;
    Utils.printArray(sortedArr);
  }

}
