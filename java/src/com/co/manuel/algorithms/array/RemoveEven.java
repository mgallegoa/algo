package com.co.manuel.algorithms.array;

import com.co.manuel.algorithms.array.Utils;

public class RemoveEven {

  public int[] removeEven(int[] array) {
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
    System.out.println("Remove Even Algorithm: ");
    RemoveEven re = new RemoveEven();
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println("Initial array: ");
    Utils.printArray(array);
    int[] newArray = re.removeEven(array);
    System.out.println("Final array: ");
    Utils.printArray(newArray);

  }
}
