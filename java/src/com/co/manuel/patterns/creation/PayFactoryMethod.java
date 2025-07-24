package com.co.manuel.patterns.creation;

import java.util.HashMap;
import java.util.Map;

public class PayFactoryMethod {

  public enum PayType {
    CREDIT_CARD,
    BITCOIN
  }

  private final static Map<PayType, Pay> payments = new HashMap<>() {
    {
      put(PayType.CREDIT_CARD, new PayCreditCard());
      put(PayType.BITCOIN, new PayBitcoin());
    }
  };

  /*
   * This is the Factory Method.
   *
   * The variation if for the parameter used but it could be done with an
   * interface.
   */
  public Pay getPay(PayType payType) {
    return payments.get(payType);
  }

  public static void main(String[] args) {
    System.out.println("FactoryMethod pattern -->");
    PayFactoryMethod factoryMethod = new PayFactoryMethod();
    Pay pay = factoryMethod.getPay(PayType.BITCOIN);
    pay.doPayment();

    Pay pay2 = factoryMethod.getPay(PayType.CREDIT_CARD);
    pay2.doPayment();
  }
}
