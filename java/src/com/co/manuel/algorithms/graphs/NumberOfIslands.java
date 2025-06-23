package com.co.manuel.algorithms.graphs;

/*
 * This exercise is to find the number of islands in a matrix.
 *
 * Use the connected Components algorithm in an UN-direction graph.
 *
 * Given an m x n 2D binary grid, which represents a map of '1's (land) and '0's (water), return the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 *
 * Input:
 * 0  | 1 | 1 | 0 | 0 |
 * 1  | 1 | 0 | 0 | 0 |
 * 2  | 0 | 0 | 1 | 0 |
 * 3  | 0 | 0 | 0 | 1 |
 *
 * Output: 3
 *
 */
public class NumberOfIslands {

  public int numberOfIslands(char[][] grid) {
    int numberOfIslands = 0;
    int m = grid.length;
    int n = grid[0].length;
    boolean[][] visited = new boolean[m][n];
    for (int row = 0; row < m; row++) {
      for (int col = 0; col < n; col++) {
        if (!visited[row][col] && grid[row][col] == '1') {
          dfs(grid, row, col, visited);
          numberOfIslands++;
        }

      }

    }
    return numberOfIslands;
  }

  public void dfs(char[][] grid, int row, int col, boolean[][] visited) {
    if (row < 0 || col < 0 ||
        row >= grid.length || col >= grid[0].length ||
        visited[row][col] || grid[row][col] == '0') {
      return;
    }
    visited[row][col] = true;
    dfs(grid, row, col - 1, visited); // go left
    dfs(grid, row - 1, col, visited); // go up
    dfs(grid, row, col + 1, visited); // go right
    dfs(grid, row + 1, col, visited); // go down
  }

  public static void main(String[] args) {

    NumberOfIslands nOfIslands = new NumberOfIslands();
    char[][] grid = {
        { '1', '1', '0', '0' },
        { '1', '0', '0', '0' },
        { '0', '0', '1', '0' },
        { '0', '0', '0', '1' },
    };
    int totalNumIslands = nOfIslands.numberOfIslands(grid);
    System.out.println("The number of Islands are: " + totalNumIslands);

  }

}
