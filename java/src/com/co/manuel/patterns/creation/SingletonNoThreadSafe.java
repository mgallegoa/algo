package com.co.manuel.patterns.creation;

public final class SingletonNoThreadSafe {

  // volatile to double check lock
  private static volatile SingletonNoThreadSafe instance;

  public String value;

  private SingletonNoThreadSafe(String value) {
    // Next code is to simulate a delay in the creation.
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    this.value = value;
  }

  public static SingletonNoThreadSafe getInstance(String value) {

    if (instance == null) {
      instance = new SingletonNoThreadSafe(value);
    }
    return instance;

  }

  public static void main(String[] args) {
    System.out.println("Singleton pattern with thread safe to avoid race condition -->");
    Thread threadFoo = new Thread(new ThreadFoo());
    Thread threadBar = new Thread(new ThreadBar());
    System.out.println("If is the same message, it is multi-thread safe:");
    threadFoo.start();
    threadBar.start();

  }

  static class ThreadFoo implements Runnable {

    @Override
    public void run() {
      SingletonNoThreadSafe singletonThreadSafe = SingletonNoThreadSafe.getInstance("Foo");
      System.out.println(singletonThreadSafe.value);
    }

  }

  static class ThreadBar implements Runnable {

    @Override
    public void run() {
      SingletonNoThreadSafe singletonThreadSafe = SingletonNoThreadSafe.getInstance("Barr");
      System.out.println(singletonThreadSafe.value);
    }

  }

}
