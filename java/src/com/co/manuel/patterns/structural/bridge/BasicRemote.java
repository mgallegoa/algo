package com.co.manuel.patterns.structural.bridge;

public class BasicRemote implements RemoteInterface {

  private Device device;

  public BasicRemote(Device device) {
    this.device = device;
  }

  @Override
  public void power() {
    System.out.println("Toggle remote.");
    System.out.println("From " + device.isEnable() + " to " + !device.isEnable());

    if (device.isEnable()) {
      device.disable();
    } else {
      device.enable();
    }

  }

}
