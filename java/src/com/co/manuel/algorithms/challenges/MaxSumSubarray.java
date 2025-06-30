package com.co.manuel.algorithms.challenges;

/**
 * This challenge is to find the maximum sum of a sub array.
 *
 * Example:
 * Input: { 4, 3, -2 , 6, -12, 7, -1, 6 } --> {7, -1, 6}
 * Output: 12
 *
 */
public class MaxSumSubarray {

  public int maxSubArraySum(int[] arr) {
    int maxSoFar = arr[0];
    int currentMax = arr[0];
    for (int i = 1; i < arr.length; i++) {

      currentMax = Math.max(currentMax + arr[i], arr[i]);

      if (maxSoFar < currentMax) {
        maxSoFar = currentMax;
      }
    }
    return maxSoFar;
  }

  public static void main(String[] args) {

    MaxSumSubarray ms = new MaxSumSubarray();
    int[] arr = { 4, 3, -2, 6, -12, 7, -1, 6 };
    System.out.println("Challenge : find the maximum sum of a sub array: " + ms.maxSubArraySum(arr));
  }

}
