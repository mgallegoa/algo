package com.co.manuel.patterns.structural.bridge;

public class BridgeClient {

  public static void main(String[] args) {
    System.out.println("Structural patterns - Bridge pattern");

    testDevice(new Tv());
    testDevice(new Radio());

  }

  public static void testDevice(Device device) {
    System.out.println("+++++++++ Test Basic Remote ++++++++++");
    BasicRemote basicRemote = new BasicRemote(device);
    basicRemote.power();
    device.printStatus();

    System.out.println("+++++++++ Test Advance Remote ++++++++++");
    AdvanceRemote advanceRemote = new AdvanceRemote(device);
    advanceRemote.power();
    advanceRemote.mute();
    System.out.println();
  }
}
