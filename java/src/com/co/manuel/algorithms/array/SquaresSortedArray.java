package com.co.manuel.algorithms.array;

/**
 * Solve using O(n) time complexity:
 * Given an integer array sorted in ascending order,
 * return an array of the squares of each number, sorted in ascending order.
 *
 * Input: [-4,-1,0,3,10] --> [16,1,0,9,100] -->
 * Output: [0,1,9,16,100]
 * 
 **/
public class SquaresSortedArray {

  public int[] squaresSortedArray(int[] sortedArr) {
    int[] result = new int[sortedArr.length];
    int i = 0;
    int j = sortedArr.length - 1;
    for (int k = sortedArr.length - 1; k >= 0; k--) {
      if (Math.abs(sortedArr[i]) > Math.abs(sortedArr[j])) {
        result[k] = sortedArr[i] * sortedArr[i];
        i++;
      } else {
        result[k] = sortedArr[j] * sortedArr[j];
        j--;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    SquaresSortedArray sa = new SquaresSortedArray();
    int[] sortedArr = new int[] { -4, -1, 0, 3, 10 };
    Utils.printArray(sortedArr);
    System.out.println("Square and sort the array using O(n) time complexity -->");
    int[] sortedArrSquare = sa.squaresSortedArray(sortedArr);
    Utils.printArray(sortedArrSquare);
  }
}
