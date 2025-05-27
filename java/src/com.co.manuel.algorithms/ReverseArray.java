package com.co.manuel.algorithms;

import com.co.manuel.algorithms.Utils;

public class ReverseArray {

  public int[] reverseArray(int[] array) {
    int countEven = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        countEven++;
      }

    }
    int[] result = new int[countEven];
    int index = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        result[index] = array[i];
        index++;
      }
    }
    return result;

  }

  public static void main(String[] arr) {
    System.out.println("Reverse Array Algorithm: ");
    ReverseArray re = new ReverseArray();
    int[] array = { 8, 1, 6, 3, 6, 7, 2 };
    System.out.println("Initial array: ");
    Utils.printArray(array);
    int[] newArray = re.reverseArray(array);
    System.out.println("Final array: ");
    Utils.printArray(newArray);

  }
}
