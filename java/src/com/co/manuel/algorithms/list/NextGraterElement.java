package com.co.manuel.algorithms.list;

import java.util.Arrays;
import java.util.Stack;

/*
 * Given array integers. For each element in the array, find the next grater element in that array.
 * The next element is the first element towards right, which is greater than the current element.
 *
 * Example
 * Input : arr = {4,7,3,4,8,1}
 * Output : arr = {7,8,4,8,-1,-1}
 *
 * */
public class NextGraterElement {

  public int[] nextGraterElement(int[] arr) {

    int[] result = new int[arr.length];
    Stack<Integer> stack = new Stack<Integer>();

    for (int i = arr.length - 1; i >= 0; i--) {
      if (!stack.isEmpty()) {
        while (!stack.isEmpty() && stack.peek() <= arr[i]) {
          stack.pop();
        }
      }
      if (stack.isEmpty()) {
        result[i] = -1;
      } else {
        result[i] = stack.peek();
      }
      stack.push(arr[i]);
    }

    return result;

  }

  public static void main(String[] args) {
    NextGraterElement nge = new NextGraterElement();
    int[] arr = { 4, 7, 3, 4, 8, 1 };
    int[] result = nge.nextGraterElement(arr);
    Arrays.stream(arr).forEach(number -> System.out.print(number + ", "));
    System.out.println("");
    Arrays.stream(result).forEach(number -> System.out.print(number + ", "));
  }

}
