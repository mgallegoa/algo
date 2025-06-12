package com.co.manuel.algorithms.list;

import java.util.Stack;

public class ValidParentheses {

  public boolean validParentheses(String stringToValidate) {

    Stack<Character> stack = new Stack<Character>();
    for (char c : stringToValidate.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
          return false;
        } else {
          char previousChar = stack.peek();
          if (previousChar == '(' && c == ')'
              || previousChar == '{' && c == '}'
              || previousChar == '[' && c == ']') {
            stack.pop();
          } else {
            return false;
          }
        }
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    ValidParentheses vp = new ValidParentheses();
    String validate1 = ")[]";
    System.out.println(validate1 + " " + vp.validParentheses(validate1));
    String validate2 = "()[]{]}";
    System.out.println(validate2 + " " + vp.validParentheses(validate2));
    String validate3 = "{[]}";
    System.out.println(validate3 + " " + vp.validParentheses(validate3));
  }
}
