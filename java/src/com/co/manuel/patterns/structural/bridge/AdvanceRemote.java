package com.co.manuel.patterns.structural.bridge;

public class AdvanceRemote extends BasicRemote {

  public AdvanceRemote(Device device) {
    super(device);
  }

  public void mute() {
    System.out.println("Mute the device.");

  }

}
