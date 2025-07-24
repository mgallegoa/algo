package com.co.manuel.patterns.structural;

/*
 * Intent: Simplify operations with complex systems.
 * Facade: A wrapper class that hide complexity.
 * Use when: APIs are confused, verbose or involve many steps.
 */
public class Facade {

  static class Amplifier {
    void on() {
      System.out.println("Amplifier ON");
    }

    void setVolume(int level) {
      System.out.println("Setting volume to " + level);
    }
  }

  static class DVDPlayer {
    void on() {
      System.out.println("DVD Player ON");
    }

    void play(String movie) {
      System.out.println("Playing movie: " + movie);
    }
  }

  static class Projector {
    void on() {
      System.out.println("Projector ON");
    }

    void wideScreenMode() {
      System.out.println("Setting widescreen mode");
    }
  }

  static class HomeTheaterFacade {
    private Amplifier amp;
    private DVDPlayer dvd;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, Projector projector) {
      this.amp = amp;
      this.dvd = dvd;
      this.projector = projector;
    }

    public void watchMovie(String movie) {
      System.out.println("Get ready to watch a movie...");
      amp.on();
      amp.setVolume(5);
      projector.on();
      projector.wideScreenMode();
      dvd.on();
      dvd.play(movie);
    }
  }

  public static void main(String[] args) {
    System.out.println("Structural patther Facade to set watch a move -->");
    System.out.println("Without Facade -->");
    Amplifier amp = new Amplifier();
    amp.on();
    amp.setVolume(5);

    DVDPlayer dvd = new DVDPlayer();
    dvd.on();
    dvd.play("The Matrix");

    Projector projector = new Projector();
    projector.on();
    projector.wideScreenMode();

    System.out.println("");
    System.out.println("With Facade -->");
    HomeTheaterFacade hFacade = new HomeTheaterFacade(amp, dvd, projector);
    hFacade.watchMovie("Terminator 3");
  }

}
