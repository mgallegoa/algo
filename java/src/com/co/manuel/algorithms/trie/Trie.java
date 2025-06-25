package com.co.manuel.algorithms.trie;

/*
 * From the word reTRIEval. The main propose is retrieve store information very fast.
 *
 * A Trie whit 4 words: 1. dog 2. dug 3. hat 4. home
 *              root ()
 *             /         \
 *        (d)             (h)
 *       /   \          /    \
 *    (o)   (u)       (a)   (o)
 *     |     |         |     |
 *    (g)   (g)       (t)   (m)
 *                           |
 *                          (e)
 *
 */
public class Trie {
  private TrieNode root;

  public Trie() {
    this.root = new TrieNode();
  }

  private class TrieNode {
    private TrieNode[] children;
    private boolean isWord;

    public TrieNode() {
      this.children = new TrieNode[26]; // To store English word from a to z
      this.isWord = false;
    }
  }

  public void insert(String word) {
    if (word == null || word.isEmpty()) {
      throw new IllegalArgumentException("Invalid word to insert.");
    }
    word = word.toLowerCase();
    TrieNode current = this.root;
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      int index = c - 'a'; // This trick to extract the index position of a letter.
      if (current.children[index] == null) {
        TrieNode node = new TrieNode();
        current.children[index] = node;
        current = node;

      } else {
        current = current.children[index];
      }
    }
    current.isWord = true;

  }

  public boolean search(String word) {
    if (word == null || word.isEmpty()) {
      throw new IllegalArgumentException("Invalid word to search.");
    }
    TrieNode current = this.root;
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      int index = c - 'a';
      if (current.children[index] == null) {
        return false;
      }
      current = current.children[index];
    }
    if (!current.isWord) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Trie trie = new Trie();
    trie.insert("cat");
    trie.insert("cap");
    trie.insert("son");
    trie.insert("so");
    System.out.println("Finished inserting");
    String worl = "sol";
    System.out.println("Search if the word exist: " + worl + " -> " + trie.search(worl));
    worl = "so";
    System.out.println("Search if the word exist: " + worl + " -> " + trie.search(worl));
    worl = "lim";
    System.out.println("Search if the word exist: " + worl + " -> " + trie.search(worl));
    worl = "cap";
    System.out.println("Search if the word exist: " + worl + " -> " + trie.search(worl));

  }

}
