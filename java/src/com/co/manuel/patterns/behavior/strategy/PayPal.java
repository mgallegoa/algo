package com.co.manuel.patterns.behavior.strategy;

public class PayPal implements PayStrategy {

  @Override
  public void execute(double amount) {
    System.out.println("PayPal strategy, execute method. Amount = " + amount);
  }

}
