package com.co.manuel.patterns.behavior.strategy;

public class ContextStrategy {

  private PayStrategy paymentStrategy;

  public void setPaymentStrategy(PayStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void doPayment(double amount) {
    if (paymentStrategy == null) {
      throw new IllegalStateException("Pay strategy not set, first set the strategy before do the payment");
    }
    // System.out.println("" + paymentStrategy.);
    paymentStrategy.execute(amount);

  }

}
