package com.co.manuel.patterns.creation;

public class PayCreditCard implements Pay {

  @Override
  public void doPayment() {
    System.out.println("This is the pay with Credit Card");
  }

}
