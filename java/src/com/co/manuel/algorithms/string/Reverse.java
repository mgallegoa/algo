package com.co.manuel.algorithms.string;

import java.util.Stack;

public class Reverse {

  public String reverse(String initial) {
    String reverse = "";
    for (int i = 0; i < initial.length(); i++) {
      reverse = initial.charAt(i) + reverse;
    }

    return reverse;
  }

  public String reverseStack(String initial) {
    char[] chars = initial.toCharArray();
    Stack<Character> reverseStack = new Stack<>();
    for (char character : chars) {
      reverseStack.push(character);
    }

    for (int i = 0; i < initial.length(); i++) {
      chars[i] = reverseStack.pop();
    }
    return new String(chars);
  }

  public static void main(String[] args) {
    String initial = "ABCD";
    System.out.println("Before reverse = " + initial);
    System.out.println("After reverse= " + new Reverse().reverse(initial));
    System.out.println("After reverse using Stack = " + new Reverse().reverseStack(initial));
  }

}
