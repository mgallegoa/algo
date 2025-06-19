package com.co.manuel.algorithms.sorting;

import com.co.manuel.algorithms.array.Utils;

/**
 * This exercise is to sort an array of 0s, 1s and 2s in ascending order.
 *
 * To do this, use tree pointers j, i and k.
 * 1. When 0 found, swap i with j pointer.
 * 2. When 2 found, swap i with k pointer.
 * 3. When 1 found, just increase the i pointer.
 */
public class DutchNationalFlagProblem {

  public void dutchNationalFlagProblem(int[] arr) {
    int j = 0, i = 0, k = arr.length - 1;
    while (i <= k) {
      if (arr[i] == 0) {
        swap(arr, i, j);
        j++;
        i++;
      } else if (arr[i] == 1) {
        i++;
      } else if (arr[i] == 2) {
        swap(arr, i, k);
        k--;
      }
    }
  }

  public void swap(int[] arr, int from, int to) {
    int temp = arr[to];
    arr[to] = arr[from];
    arr[from] = temp;
  }

  public static void main(String[] args) {
    DutchNationalFlagProblem dnfp = new DutchNationalFlagProblem();
    int[] arr = new int[] { 2, 1, 0, 1, 0, 2, 1, 0, 2 };
    Utils.printArray(arr);
    System.out.println("Sort algorithm, Dutch National Flag problem -->");
    dnfp.dutchNationalFlagProblem(arr);
    Utils.printArray(arr);
  }
}
