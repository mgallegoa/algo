package com.co.manuel.algorithms.string;

public class PalindromeString {

  public static boolean isPalindromeString(String word) {
    char[] charString = word.toCharArray();
    int start = 0;
    int end = word.length() - 1;
    while (start < end) {
      if (charString[start] != charString[end]) {
        return false;
      }
      start++;
      end--;
    }
    return true;

  }

  public static void main(String[] args) {
    System.out.println("Determine Palindrome String");
    String word = "maamam";
    System.out.println("The word (" + word + ") is palindrome? " + isPalindromeString(word));

  }

}
