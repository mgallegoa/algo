package com.co.manuel.patterns.creation;

public final class SingletonThreadSafe {

  // volatile to double check lock
  private static volatile SingletonThreadSafe instance;

  public String value;

  private SingletonThreadSafe(String value) {
    this.value = value;
  }

  public static SingletonThreadSafe getInstance(String value) {
    /*
     * Approach is called double-check locking (DCL). Prevent race condition between
     * multiple threads.
     */
    var result = instance;
    if (result != null) {
      return result;
    }
    synchronized (SingletonThreadSafe.class) {
      if (instance == null) {
        instance = new SingletonThreadSafe(value);
      }
      return instance;
    }

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
      SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getInstance("Foo");
      System.out.println(singletonThreadSafe.value);
    }

  }

  static class ThreadBar implements Runnable {

    @Override
    public void run() {
      SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getInstance("Barr");
      System.out.println(singletonThreadSafe.value);
    }

  }

}
