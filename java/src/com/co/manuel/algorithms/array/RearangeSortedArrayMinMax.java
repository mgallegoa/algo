package com.co.manuel.algorithms.array;

import java.util.Arrays;

/**
 * This exercise is to rearange a sorted array in form max, min, 2max, 2min,
 * 3max, 3min....
 * Using space complexity O(1).
 */
public class RearangeSortedArrayMinMax {

  public void rearangeSortedArrayMinMax(int[] arr) {
    // Arrays.sort(arr); // Dual-pivot quicksort for primitives
    int maxIdx = arr.length - 1;
    int minIdx = 0;
    int maxElem = arr[maxIdx] + 1;
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        arr[i] = arr[i] + (arr[maxIdx] % maxElem) * maxElem;
        maxIdx--;
      } else {
        arr[i] = arr[i] + (arr[minIdx] % maxElem) * maxElem;
        minIdx++;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] / maxElem;
    }

  }

  public static void main(String[] args) {
    RearangeSortedArrayMinMax rsamm = new RearangeSortedArrayMinMax();
    int[] sortedArr = new int[] { 2, 3, 5, 6, 8, 9 };
    Utils.printArray(sortedArr);
    System.out.println("Rearange sorted array using O(1) space complexity -->");
    rsamm.rearangeSortedArrayMinMax(sortedArr);
    System.out.println(Arrays.toString(sortedArr));
  }
}
