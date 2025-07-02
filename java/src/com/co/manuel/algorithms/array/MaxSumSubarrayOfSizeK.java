package com.co.manuel.algorithms.array;

import java.util.Arrays;

/*
 * This challenge is to find the maximum sum of sub-array window of K elements.
 * The windows move from very left of array to very right.
 * Solve using O(n) time complexity.
 *
 * Input: {2, 7, 3, 5, 8, 1} and K=3
 * Output: 16
 *
 * Explanation:
 *    window             max-sum
 * {[2, 7, 3], 5, 8, 1}   12
 * {2, [7, 3, 5], 8, 1}   15
 * {2, 7, [3, 5, 8], 1}   16
 * {2, 7, 3, [5, 8, 1]}   14
 *
 */
public class MaxSumSubarrayOfSizeK {

  public static int maxSumSubarrayOfSizeK(int[] arr, int numKWindow) {
    int maxSum = Integer.MIN_VALUE;
    int windowSum = 0;
    for (int i = 0; i < arr.length; i++) {
      windowSum = windowSum + arr[i];
      if (i < numKWindow - 1) {
        continue;
      }
      maxSum = Math.max(maxSum, windowSum);
      int index = numKWindow - 1;
      windowSum = windowSum - arr[i - index];
    }
    return maxSum;
  }

  public static void main(String[] args) {
    System.out.println("Excercise find the maximum sum of sub-array window of K elements --> ");
    int[] arr = { 2, 7, 3, 5, 8, 1 };
    int numKWindow = 3;
    System.out.println("In the array " + Arrays.toString(arr) + " and the window " + numKWindow + ", the max sum is:");
    System.out.println(MaxSumSubarrayOfSizeK.maxSumSubarrayOfSizeK(arr, numKWindow));
  }
}
