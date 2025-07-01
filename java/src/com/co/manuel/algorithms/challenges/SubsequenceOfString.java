package com.co.manuel.algorithms.challenges;

/**
 * This challenge is to determine if a string is a sub-sequence of a string.
 *
 * A sub-sequence is a new string formed from the original string deleting some
 * or no characters without changing the order of remaining characters.
 *
 * Input: "ace" is a sub-sequence of "abcde"
 * Input: "aec" is NOT a sub-sequence of "abcde"
 *
 */
public class SubsequenceOfString {

  public boolean isSubsequenceOfString(String sequence, String subSequence) {
    char[] charSequence = sequence.toCharArray();
    char[] charSubSequence = subSequence.toCharArray();
    int indexSubSequence = 0;
    for (int i = 0; i < charSequence.length; i++) {
      if (charSubSequence[indexSubSequence] == charSequence[i]) {
        indexSubSequence++;
      }
      if (indexSubSequence == subSequence.length()) {
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    SubsequenceOfString subSequenceOfString = new SubsequenceOfString();
    System.out.println("Determine if a string is a subsequence of other string -->");
    String sequence = "abcde";
    String subSequence = "aec";
    System.out.println("Is sub-sequence " + subSequence + ", from sequence " + sequence + "? "
        + subSequenceOfString.isSubsequenceOfString(sequence, subSequence));
  }

}
