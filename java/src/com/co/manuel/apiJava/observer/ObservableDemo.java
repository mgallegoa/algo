package com.co.manuel.apiJava.observer;

/**
 * This is only for study Observable pattern.
 *
 * Deprecated.
 * The event model supported by Observer and Observable is quite limited, the
 * order of notifications delivered by Observable is unspecified, and state
 * changes are not in one-for-one correspondence with notifications. For a
 * richer event model, consider using the java.beans package. For reliable and
 * ordered messaging among threads, consider using one of the concurrent data
 * structures in the java.util.concurrent package. For reactive streams style
 * programming, see the Flow API.
 */
public class ObservableDemo {

  public static void main(String[] args) {
    NokiaPriceObservable nokiaPriceObservable = new NokiaPriceObservable(700);

    TomObserver tomObserver = new TomObserver();
    PeterObserver peterObserver = new PeterObserver();

    nokiaPriceObservable.addObserver(tomObserver);
    nokiaPriceObservable.addObserver(peterObserver);

    nokiaPriceObservable.serPrice(800);
  }

}
