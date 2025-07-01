package com.co.manuel.algorithms.challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find the pair position of numbers that they add
 * up to specific target.
 *
 * Input: {2, 11, 5, 10, 7, 8}, target = 9
 * Output: {0, 4} --> Because 2 + 7 = 9
 */
public class TwoSumEqualInputNumber {

  public int[] twoSumEqualInputNumber(int[] arr, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> numbers = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (numbers.containsKey(target - arr[i])) {
        result[0] = numbers.get(target - arr[i]);
        result[1] = i;
        return result;
      } else {
        numbers.put(arr[i], i);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    TwoSumEqualInputNumber tNumber = new TwoSumEqualInputNumber();
    int[] arr = { 2, 11, 5, 10, 7, 8 };
    int target = 9;
    System.out
        .println("Given an array of integers, find the pair position of numbers that they add up to specific target.");
    System.out.println("Array -->" + Arrays.toString(arr));
    System.out.println("Target = 9");
    int[] result = tNumber.twoSumEqualInputNumber(arr, target);
    System.out.println("Output --> " + Arrays.toString(result));

  }

}
