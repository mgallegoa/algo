package com.co.manuel.algorithms.array;

import java.util.Arrays;

/*
 * This challenge is to remove from an array, all duplicated numbers in-place, each number should appear only once.
 * The relative order should be the same.
 * Return the numbers of unique elements in the array.
 *
 * Input: {1,1,2}
 * Output: 2 and array should be {1,2,_}
 *
 * Input: {0,0,2,2,2,3,3,3,6,7,7,7,8,10}
 * Output: 7 and array should be {0,2,3,6,7,8,10,_,_,_,_,_,_,_,_}
 *
 */
public class RemoveDuplicates {

  public static int removeDuplicates(int[] input) {
    int i = 1;
    for (int j = 1; j < input.length; j++) {
      if (input[j] != input[j - 1]) {
        input[i] = input[j];
        i++;
      }
    }
    for (int j = i; j < input.length; j++) {
      input[j] = -1;
    }

    return i;
  }

  public static int removeDuplicates2(int[] input) {
    int i = 0;
    for (int j = 0; j < input.length; j++) {
      if (input[i] != input[j]) {
        i++;
        input[i] = input[j];
      }
    }

    if (i < input.length) {
      i++;
      input[i] = input[input.length - 1];

    }

    for (int j = i; j < input.length; j++) {
      input[j] = -1;
    }

    return i;
  }

  public static void main(String[] args) {
    System.out.println("Exercise remove duplicates from array -->");
    int[] input = { 1, 1, 2 };
    int numOfNotEquals = RemoveDuplicates.removeDuplicates(input);
    System.out.println(
        "From the array " + Arrays.toString(input) + ", the total of unique elements are: " + numOfNotEquals);
    int[] input2 = { 0, 0, 2, 2, 2, 3, 3, 3, 6, 7, 7, 7, 8, 10 };
    numOfNotEquals = RemoveDuplicates.removeDuplicates(input2);
    System.out.println(
        "From the array " + Arrays.toString(input2) + ", the total of unique elements are: " + numOfNotEquals);
    int[] input3 = { 0, 1, 2, 3, 3, 3, 3 };
    numOfNotEquals = RemoveDuplicates.removeDuplicates(input3);
    System.out.println(
        "From the array " + Arrays.toString(input3) + ", the total of unique elements are: " + numOfNotEquals);

  }
}
