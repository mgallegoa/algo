package com.co.manuel.patterns.creation;

public class PayBitcoin implements Pay {

  @Override
  public void doPayment() {
    System.out.println("This is the pay with Bit Coin");
  }

}
