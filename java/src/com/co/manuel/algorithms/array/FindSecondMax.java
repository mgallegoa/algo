package com.co.manuel.algorithms.array;

import com.co.manuel.algorithms.array.Utils;

public class FindSecondMax {

  public static int findSeconfMax(int[] array) {
    int maxValue = Integer.MIN_VALUE;
    int secValue = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > maxValue) {
        secValue = maxValue;
        maxValue = array[i];
      } else if (array[i] > secValue && array[i] != maxValue) {
        secValue = array[i];
      }
    }
    return secValue;

  }

  public static void main(String[] args) {
    System.out.println("Find the second max number in array");
    int[] array = { 3, 5, 9, 15, 9, 11 };
    Utils.printArray(array);
    System.out.println("The second max value is:" + findSeconfMax(array));

  }

}
