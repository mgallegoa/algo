package com.co.manuel.algorithms.array;

/**
 * This exercise is to merge two ordered array and the result is an array in
 * order too.
 */
public class MergeTwoOrderArray {

  public int[] mergeTwoOrderArray(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];
    int i = 0, j = 0;
    for (int k = 0; k < result.length; k++) {
      if (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
          result[k] = arr1[i];
          i++;
        } else {
          result[k] = arr2[j];
          j++;
        }
      } else if (i < arr1.length) {
        result[k] = arr1[i];
        i++;
      } else {
        result[k] = arr2[j];
        j++;
      }

    }
    return result;
  }

  public static void main(String[] args) {
    MergeTwoOrderArray mArrays = new MergeTwoOrderArray();
    int[] arr1 = { 1, 3, 8, 15 };
    int[] arr2 = { 2, 5, 7, 20, 21 };
    Utils.printArray(arr1);
    Utils.printArray(arr2);
    System.out.println("Merge tow sorted arrays exercise -->");
    int[] result = mArrays.mergeTwoOrderArray(arr1, arr2);
    Utils.printArray(result);
  }
}
