package com.co.manuel.apiJava.observer;

import java.util.Observable;
/**
 * Deprecated.
The event model supported by Observer and Observable is quite limited, the order of notifications delivered by Observable is unspecified, and state changes are not in one-for-one correspondence with notifications. For a richer event model, consider using the java.beans package. For reliable and ordered messaging among threads, consider using one of the concurrent data structures in the java.util.concurrent package. For reactive streams style programming, see the Flow API.
 */
import java.util.Observer;

public class PeterObserver implements Observer {

  @Override
  public void update(Observable o, Object arg) {

    NokiaPriceObservable nokiaPriceObservable = (NokiaPriceObservable) o;
    System.out.println("Peter is notify, price change to " + nokiaPriceObservable.getPrice());
  }
}
