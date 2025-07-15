package com.co.manuel.apiJava.observer;

import java.util.Observable;

public class NokiaPriceObservable extends Observable {

  private int price;

  public NokiaPriceObservable(int price) {
    this.price = price;
  }

  public int getPrice() {
    return this.price;
  }

  public void serPrice(int newPrice) {
    if (price != newPrice) {
      System.out.println("Price changed from " + price + " to " + newPrice);
      price = newPrice;

      setChanged();

      notifyObservers();

    }
  }

}
