package com.co.manuel.algorithms.dynamicProgramming;

/*
 * Dynamic Programming:
 * 1. It is mainly an optimization over Recursion.
 * 2. Dynamic Programming = Recursion + Memorization
 *
 * Overlapping Sub problems: if solution of the problem is obtain by solving same sub problems multiple times.
 *
 * Bottom Up Approach: Smaller sub-problem first and use the solution to solve the biggest problem (Tabulation method).
 * Top Down Approach: Each sub-problem is solved and remember and re-use (Memorization)
 */
public class DynamicProgramming {

  public int fibonacciRecursion(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    int left = fibonacciRecursion(n - 1);
    int right = fibonacciRecursion(n - 2);
    return left + right;
  }

  /*
   * Bottom Up Approach: Smaller sub-problem first and use the solution to solve
   * the biggest problem (Tabulation method).
   */
  public int fibonacciBottomUpTabulatoion(int n) {
    int[] table = new int[n + 1];
    table[0] = 0;
    table[1] = 1;
    for (int i = 2; i <= n; i++) {
      table[i] = table[i - 1] + table[i - 2];
    }
    return table[n];
  }

  /*
   * Top Down Approach: Each sub-problem is solved and remember and re-use
   * (Memorization)
   */
  public int fibonacciTopDownMemorization(int[] memo, int n) {
    if (memo[n] == 0) {
      if (n < 2) {
        memo[n] = n; // 1 and 0
      } else {
        int left = fibonacciTopDownMemorization(memo, n - 1);
        int right = fibonacciTopDownMemorization(memo, n - 2);
        memo[n] = left + right;
      }
    }

    return memo[n];
  }

  public static void main(String[] args) {
    DynamicProgramming dp = new DynamicProgramming();
    int n = 6;
    System.out.println("Fibonacci number, using recursion: " + dp.fibonacciRecursion(n));
    System.out.println(
        "Fibonacci number, using dynamic programing (Bottom up, tabulation): " + dp.fibonacciBottomUpTabulatoion(n));
    System.out.println(
        "Fibonacci number, using dynamic programing (Top Down, memorization): "
            + dp.fibonacciTopDownMemorization(new int[n + 1], n));
  }
}
