package com.co.manuel.algorithms.array;

import java.util.Arrays;

/*
 * This challenge is to remove from an array, all the occurrences of a given number. The order of the elements may be changed.
 * Return the numbers of elements that are not equals to the given number.
 *
 * Input: {3,2,2,3} and val = 3
 * Output: 2 and array should be {2,2,_,_}
 *
 * Input: {0,1,2,2,3,0,4,2} and val = 2
 * Output: 5 and array should be {0,1,4,0,3,_,_,_}
 *
 */
public class RemoveNumber {

  public static int removeNumber(int[] input, int numToRemove) {
    int i = 0;
    for (int j = 0; j < input.length; j++) {
      if (input[j] != numToRemove) {
        input[i] = input[j];
        i++;
      }
    }

    for (int j = i; j < input.length; j++) {
      input[j] = -1;
    }

    return i;
  }

  public static void main(String[] args) {
    System.out.println("Exercise remove number from array -->");
    int[] input = { 3, 2, 2, 3 };
    int numToRemove = 3;
    int numOfNotEquals = RemoveNumber.removeNumber(input, numToRemove);
    System.out.println(
        "From the array " + Arrays.toString(input) + ", the number of not equals elements are: " + numOfNotEquals);
    numToRemove = 2;
    int[] input2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
    numOfNotEquals = RemoveNumber.removeNumber(input2, numToRemove);
    System.out.println(
        "From the array " + Arrays.toString(input2) + ", the number of not equals elements are: " + numOfNotEquals);

  }
}
