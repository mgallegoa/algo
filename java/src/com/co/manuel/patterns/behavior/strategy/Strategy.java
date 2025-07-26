package com.co.manuel.patterns.behavior.strategy;

/*
 * Strategy is a behavioral design pattern that turns a set of behaviors into objects 
 * and makes them interchangeable inside original context object.
 *
 */
public class Strategy {

  public static void main(String[] args) {

    System.out.println("Strategy pattern -->");

    ContextStrategy contextStrategy = new ContextStrategy();

    contextStrategy.setPaymentStrategy(new PayCreditCard());
    contextStrategy.doPayment(500);

    contextStrategy.setPaymentStrategy(new PayPal());
    contextStrategy.doPayment(200);

  }

}
