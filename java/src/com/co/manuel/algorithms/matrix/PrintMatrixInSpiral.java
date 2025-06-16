package com.co.manuel.algorithms.matrix;

public class PrintMatrixInSpiral {

  public void printMatrixInSpiral(int[][] matrix) {
    int row = matrix.length;
    int col = matrix[0].length;
    int i, k = 0, l = 0;
    while (k < row && l < col) {
      for (i = l; i < col; i++) { // Left to Right
        System.out.print(matrix[k][i] + " ");
      }
      k++;
      for (i = k; i < row; i++) { // Top to Bottom
        System.out.print(matrix[i][col - 1] + " ");
      }
      col--;
      if (k < row) {
        for (i = col - 1; i >= l; i--) { // Right to Left
          System.out.print(matrix[row - 1][i] + " ");
        }
        row--;
      }
      if (l < col) {
        for (i = row - 1; i >= k; i--) { // Bottom to Top
          System.out.print(matrix[i][l] + " ");
        }
        l++;
      }
    }

  }

  public static void main(String[] args) {
    System.out.println("Print matrix in spiral:");
    // This matrix should be printed: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
    int[][] matrix = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };
    PrintMatrixInSpiral pms = new PrintMatrixInSpiral();
    pms.printMatrixInSpiral(matrix);
  }
}
