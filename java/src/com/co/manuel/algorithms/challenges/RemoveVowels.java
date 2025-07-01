package com.co.manuel.algorithms.challenges;

import java.util.Set;

/**
 * From an String remove the vowels and return the new string without vowels.
 * Vowels: a, e, i, o, u
 */
public class RemoveVowels {

  public String removeVowels(String input) {
    StringBuilder sb = new StringBuilder();
    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
    char[] characters = input.toCharArray();
    for (char c : characters) {
      if (!vowels.contains(c)) {
        sb.append(c);
      }
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println("Remove vowels from string -->");
    RemoveVowels removeVowels = new RemoveVowels();
    String input = "manueldmanuel";
    System.out
        .println("From string * " + input + " *, the result of remove vowels is * " + removeVowels.removeVowels(input));
  }

}
