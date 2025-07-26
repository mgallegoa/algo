package com.co.manuel.patterns.structural.compose;

/*
 * Composite is a structural design pattern also know how Object tree pattern.
 *
 * Compose objects into tree structures (ComposeFolder) and 
 * then work with these structures as if they were individual objects (ComposeFile).
 */
public class Compose {

  public static void main(String[] args) {
    System.out.println("Compose or Object Tree pattern -->");
    ComposeFileSystemItem file1 = new ComposeFile("Resume.pdf");
    ComposeFileSystemItem file2 = new ComposeFile("Patterns.txt");

    ComposeFolder folder1 = new ComposeFolder("Docoments");
    folder1.add(file1);
    folder1.add(file2);

    ComposeFolder folder2 = new ComposeFolder("Projects");
    folder2.add(new ComposeFile("Main.java"));
    folder2.add(folder1);

    folder2.display("   ");

  }
}
