package com.co.manuel.patterns.structural.adapter;

public class SquarePegAdapter extends RoundPeg {

  private SquarePeg squarePeg;

  public SquarePegAdapter(SquarePeg squarePeg) {
    super(squarePeg.getWith());
    this.squarePeg = squarePeg;
  }

  @Override
  public double getRadious() {
    return Math.sqrt(Math.pow(this.squarePeg.getWith() / 2, 2) * 2);
  }

}
