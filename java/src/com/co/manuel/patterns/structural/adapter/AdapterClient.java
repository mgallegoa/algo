package com.co.manuel.patterns.structural.adapter;

public class AdapterClient {

  public static void main(String[] args) {
    System.out.println("Structural patterns - Adapter pattern");

    RoundHole rh = new RoundHole(5);
    RoundPeg rp = new RoundPeg(5);
    if (rh.fits(rp)) {
      System.out.println(rp.getRadious() + " fits in: " + rh.getRadious());
    } else {
      System.out.println(rp.getRadious() + " NOT fits in: " + rh.getRadious());
    }

    SquarePeg spSmall = new SquarePeg(7);
    SquarePegAdapter sPegAdapter = new SquarePegAdapter(spSmall);
    if (rh.fits(sPegAdapter)) {
      System.out.println(sPegAdapter.getRadious() + " Square fits in: " + rh.getRadious());
    } else {
      System.out.println(sPegAdapter.getRadious() + " Square NOT fits in: " + rh.getRadious());
    }

    SquarePeg spLarge = new SquarePeg(7.1);
    sPegAdapter = new SquarePegAdapter(spLarge);
    if (rh.fits(sPegAdapter)) {
      System.out.println(sPegAdapter.getRadious() + " Square fits in: " + rh.getRadious());
    } else {
      System.out.println(sPegAdapter.getRadious() + " Square NOT fits in: " + rh.getRadious());
    }

  }
}
