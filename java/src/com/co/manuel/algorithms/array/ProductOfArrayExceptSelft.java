package com.co.manuel.algorithms.array;

import java.util.Arrays;

/*
 * This challenge is to return an array of result is equal to the product of all the elements of the array, except the self element (arr[i]).
 * The product fits in 32-bits integer.
 * The algorithm should run in O(n) and NOT use the division operator.
 *
 * Input: {1, 2, 3, 4}
 * Output: {24, 12, 8, 6}
 *
 * Input: {-1, 1, 0, -3, 3}
 * Output: {0, 0, 9, 0, 0}
 *
 */
public class ProductOfArrayExceptSelft {

  public static int[] productOfArrayExceptSelft(int[] arr) {
    int[] result = new int[arr.length];
    int temp = 1;
    for (int i = 0; i < result.length; i++) {
      result[i] = temp;
      temp = temp * arr[i];
    }
    temp = 1;
    for (int i = result.length - 1; i >= 0; i--) {
      result[i] = temp * result[i];
      temp = temp * arr[i];
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println("Exercise product of elements of array except selft from array -->");

    int[] arr = { 1, 2, 3, 4 };
    System.out.println("From the array " + Arrays.toString(arr) + " the product are: ");
    int[] result = ProductOfArrayExceptSelft.productOfArrayExceptSelft(arr);
    System.out.println(Arrays.toString(result));
  }
}
