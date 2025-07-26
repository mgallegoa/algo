package com.co.manuel.patterns.structural.compose;

public class ComposeFile implements ComposeFileSystemItem {
  private String name;

  public ComposeFile(String name) {
    this.name = name;
  }

  @Override
  public void display(String indent) {
    System.out.println(indent + "📄 File" + name); // emoji code 1F4C4
  }
}
