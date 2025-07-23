package com.co.manuel.algorithms.array;

import java.util.Date;

public class CopyConstructor {
  private String name;
  private Date date;

  public CopyConstructor(String name, Date date) {
    this.name = name;
    this.date = date;
  }

  public CopyConstructor(CopyConstructor cc) {
    this.name = cc.name;
    this.date = cc.date;
  }

  public static class InnerCopyConstructor {

  }

  public static void main(String[] args) {
    System.out.println("Example of use the copy constructor to clone an object.");
    System.out.println();
    System.out.println("The primitive data have their own instance but the object the reference -->");
    CopyConstructor cp = new CopyConstructor("Manuel", new Date());
    CopyConstructor cp2 = new CopyConstructor(cp);
    System.out.println(cp.name);
    System.out.println(cp2.name);
    cp2.name = "Arias";
    cp2.date.setTime(565656);

    System.out.println();
    System.out.println("Primitives -->");
    System.out.println(cp.name);
    System.out.println(cp2.name);
    System.out.println("Objects -->");
    System.out.println(cp.date);
    System.out.println(cp2.date);
  }
}
