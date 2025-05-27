package com.co.manuel.algorithms;

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

  public void printArray(int[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + ",");
    }

    System.out.print("]");
  }

  public static void main(String[] arr) {
    System.out.println("Hola manuel");
    RemoveEven re = new RemoveEven();
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] newArray = re.removeEven(array);
    re.printArray(newArray);

  }
}
