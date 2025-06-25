package com.co.manuel.algorithms.dynamicProgramming;

/*
 * Dynamic Programming:
 * 1. It is mainly an optimization over Recursion.
 * 2. Dynamic Programming = Recursion + Memorization
 *
 * Overlapping Sub problems: if solution of the problem is obtain by solving same sub problems multiple times.
 *
 * Bottom Up Approach: Smaller sub-problem first and use the solution to solve the biggest problem (Tabulation method).
 * Top Down Approach: 
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

  public int fibonacciBottomUpTabulatoion(int n) {
    int[] table = new int[n + 1];
    table[0] = 0;
    table[1] = 1;
    for (int i = 2; i <= n; i++) {
      table[i] = table[i - 1] + table[i - 2];
    }
    return table[n];
  }

  public static void main(String[] args) {
    DynamicProgramming dp = new DynamicProgramming();
    int n = 6;
    System.out.println("Fibonacci number, using recursion: " + dp.fibonacciRecursion(n));
    System.out.println("Fibonacci number, using dynamic programing (Bottom up): " + dp.fibonacciBottomUpTabulatoion(n));
  }
}
