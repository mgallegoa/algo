package com.co.manuel.algorithms.sorting;

import com.co.manuel.algorithms.array.Utils;

public class BubbleSort {

  public int[] bubleSort(int[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
      boolean swaped = false;
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swaped = true;
        }
      }
      if (!swaped) {
        break;
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 5, 1, 2, 9, 10 };
    BubbleSort bs = new BubbleSort();
    Utils.printArray(arr);
    System.out.println("Sort the array using the Bubble Sort algorithm -->");
    int[] arrSorted = bs.bubleSort(arr);
    Utils.printArray(arrSorted);
  }

}
