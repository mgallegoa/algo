package com.co.manuel.patterns.structural.bridge;

public class Tv implements Device {

  private boolean on;

  @Override
  public void disable() {
    this.on = false;
  }

  @Override
  public void enable() {
    this.on = true;
  }

  @Override
  public boolean isEnable() {
    return this.on;
  }

  @Override
  public void printStatus() {
    System.out.println("----------------------");
    System.out.println("I'm a TV");
    System.out.println("Tv on: " + this.on);
    System.out.println("----------------------");
  }

}
