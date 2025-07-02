package com.co.manuel.algorithms.array;

import java.util.Arrays;

/*
 * This challenge is to find the triplets such they add is equal to given target.
 * The triplet should be print in ascending order.
 *
 * Input: {2,4,3,7,1,8,9,0}, target = 6
 * Output: {0,2,4},{1,2,3}
 */
public class ThreeElementsSumTarget {

  public static void threeElementsSumTarget(int[] arr, int target) {
    Arrays.sort(arr);
    for (int i = 0; i < arr.length - 2; i++) {
      int j = i + 1;
      int k = arr.length - 1;
      while (j < k) {
        int sum = arr[i] + arr[j] + arr[k];
        if (sum == target) {
          System.out.print("{" + arr[i] + ", " + arr[j] + ", " + arr[k] + "}, ");
          j++;
          k--;
        } else if (sum < target) {
          j++;
        } else {
          k--;
        }
      } // End while

    } // End For

  }

  public static void main(String[] args) {
    System.out.println("Exercise three elements sum the target from array -->");
    int[] input = { 2, 4, 3, 7, 1, 8, 9, 0 };
    int target = 6;
    System.out.println(
        "From the array " + Arrays.toString(input) + " and target " + target + " the triplets are: ");
    ThreeElementsSumTarget.threeElementsSumTarget(input, target);

  }
}
