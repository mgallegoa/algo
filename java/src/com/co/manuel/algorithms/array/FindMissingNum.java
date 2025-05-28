package com.co.manuel.algorithms.array;

import com.co.manuel.algorithms.array.Utils;

public class FindMissingNum {

  public static int findMissingNum(int[] array) {
    int n = array.length + 1;
    int sum = n * (n + 1) / 2;
    for (int num : array) {
      sum = sum - num;
    }
    return sum;

  }

  public static void main(String[] args) {
    System.out.println("Find the missing number in array");
    int[] array = { 3, 5, 9, 2, 4, 1, 8, 7 };
    Utils.printArray(array);
    System.out.println("The missing nuber is is:" + findMissingNum(array));

  }

}
