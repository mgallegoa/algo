package com.co.manuel.algorithms.array;

import com.co.manuel.algorithms.array.Utils;

public class MoveZerosToEnd {

  public static int[] moveZerosToEnd(int[] array) {
    int indexOfZero = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] != 0 && array[indexOfZero] == 0) {
        array[indexOfZero] = array[i];
        array[i] = 0;
      }
      if (array[indexOfZero] != 0) {
        indexOfZero++;

      }
    }
    return array;

  }

  public static void main(String[] args) {
    System.out.println("Move zeros to the end of array, maintaining the non-zeros order");
    // int[] array = { 0, 5, 0, 15, 9, 11 };
    int[] array = { 0, 5, 0, 15, 9, 11, 0, 0, 0 };
    Utils.printArray(array);
    int[] orderArr = moveZerosToEnd(array);
    System.out.println("The result is:");
    Utils.printArray(orderArr);

  }

}
