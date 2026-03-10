package com.co.manuel.patterns.structural.adapter;

public class RoundHole {

  private double radious;

  public RoundHole(double radious) {
    this.radious = radious;
  }

  public double getRadious() {
    return this.radious;
  }

  public boolean fits(RoundPeg roundPeg) {
    return this.radious >= roundPeg.getRadious();
  }
}
