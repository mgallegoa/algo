package com.co.manuel.patterns.structural.compose;

import java.util.ArrayList;
import java.util.List;

public class ComposeFolder implements ComposeFileSystemItem {

  private String name;
  private List<ComposeFileSystemItem> children = new ArrayList<>();

  public ComposeFolder(String name) {
    this.name = name;
  }

  public void add(ComposeFileSystemItem item) {
    children.add(item);
  }

  @Override
  public void display(String indent) {
    System.out.println("📁 Folder: " + name);
    for (ComposeFileSystemItem composeFileSystemItem : children) {
      composeFileSystemItem.display(indent + "");
    }
  }

}
