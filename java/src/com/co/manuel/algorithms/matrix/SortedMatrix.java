package com.co.manuel.algorithms.matrix;

/**
 * This demonstrate how to search a value in an order Matrix with O(n) Linear
 * complexity
 */
public class SortedMatrix {

  /*
   * @param matrix: Ordered matrix values.
   * 
   * @param x: value to search.
   * 
   * Print the found position in the matrix.
   *
   */
  public void search(int[][] matrix, int x) {
    int i = 0;
    int n = matrix[0].length;
    int j = n - 1;
    while (i < n && j >= 0) {
      if (matrix[i][j] == x) {
        System.out.println(x + " found in the position: " + i + ", " + j);
        return;
      }
      if (matrix[i][j] > x) {
        j--;
      } else {
        i++;
      }
    }
    System.out.println(x + " Not found.");
  }

  public static void main(String[] args) {
    System.out.println("Found a number in a ordered Matrix.");
    SortedMatrix fom = new SortedMatrix();
    int[] row1 = { 10, 20, 30, 40 };
    int[] row2 = { 15, 25, 35, 45 };
    int[] row3 = { 27, 29, 37, 48 };
    int[] row4 = { 32, 33, 39, 51 };
    int[][] matrix = { row1, row2, row3, row4 };
    fom.search(matrix, 33);
    fom.search(matrix, 34);

  }

}
