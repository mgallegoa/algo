package com.co.manuel.algorithms.challenges;

/*
 * This challenge is to reverse an integer. Taking care of max int value.
 *
 * Input: 1234
 * Output: 4321
 *
 * Input: -1234
 * Output: -4321
 *
 * */
public class ReverseIntegerNumber {

  public long reverseIntegerNumber(int number) {
    boolean isNegative = number < 0;
    if (isNegative) {
      number = number * -1;
    }
    long reverse = 0;
    int lastDigit = 0;
    while (number > 0) {
      lastDigit = number % 10;
      reverse = reverse * 10 + lastDigit;
      number = number / 10;
    }

    return (isNegative) ? -1 * reverse : reverse;
  }

  public static void main(String[] args) {
    System.out.println("Reverse integer number -->");
    ReverseIntegerNumber reverse = new ReverseIntegerNumber();
    int number = -1234;
    System.out
        .println("From number * " + number + " *, the result of reverse is * " + reverse.reverseIntegerNumber(number));
  }
}
