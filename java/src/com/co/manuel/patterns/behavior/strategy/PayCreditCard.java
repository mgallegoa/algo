package com.co.manuel.patterns.behavior.strategy;

public class PayCreditCard implements PayStrategy {

  @Override
  public void execute(double amount) {
    System.out.println("PayCreditCard strategy, execute method. Amount = " + amount);
  }

}
