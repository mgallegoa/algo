package com.co.manuel.algorithms.challenges;

import java.util.HashMap;
import java.util.Map;

/**
 * This challenge is to find the first non-repeated character in an string.
 * Return the index.
 *
 * Input: "manueldmanuel"
 * Output: 6 --> The first non-repeated character is d in the index 6
 */
public class FirstNonRepeatingCharacter {

  public int firstNonRepeatingCharacter(String input) {
    Map<Character, Integer> mapChar = new HashMap<>();
    char[] charsInput = input.toCharArray();
    for (char c : charsInput) {
      mapChar.put(c, mapChar.getOrDefault(c, 0) + 1);
    }

    for (int i = 0; i < charsInput.length; i++) {
      char c = charsInput[i];
      if (mapChar.get(c) == 1) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println("Find the first non-repeated character -->");
    FirstNonRepeatingCharacter nonRepeat = new FirstNonRepeatingCharacter();
    String input = "manueldmanuel";
    System.out.println("In string * " + input + " *, the first non-repeated character is in the index "
        + nonRepeat.firstNonRepeatingCharacter(input));

  }

}
