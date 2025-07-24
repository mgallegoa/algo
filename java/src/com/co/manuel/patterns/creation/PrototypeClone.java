package com.co.manuel.patterns.creation;

/*
 * Example of Prototype or Clone pattern.
 *
 * The class Car implements java.lang.Clonable to indicate the implementation of clone() method.
 */
public class PrototypeClone {

  public static class Car implements Cloneable {

    private String color;
    private int maxVelocity;

    public int getMaxVelocity() {
      return maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
      this.maxVelocity = maxVelocity;
    }

    public String getColor() {
      return color;
    }

    public void setColor(String color) {
      this.color = color;
    }

    @Override
    public int hashCode() {
      int result = this.color == null ? 0 : this.color.hashCode();
      result = 31 * result + this.maxVelocity;
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || obj.getClass() != this.getClass()) {
        return false;
      }
      Car car = (Car) obj;
      return this.color.equals(car.color) && this.maxVelocity == car.maxVelocity;
    }

    @Override
    protected Car clone() {
      Car car = new Car();
      car.setColor(this.color);
      car.setMaxVelocity(this.maxVelocity);
      return car;
    }

    @Override
    public String toString() {
      return "Color: " + this.color + " and velocity: " + this.maxVelocity;
    }

  }

  public static void main(String[] args) {
    System.out.println("Prototype or Clone pattern -->");

    Car car1 = new Car();
    car1.setColor("Blue");
    car1.setMaxVelocity(300);
    Car car2 = car1.clone();
    car2.setColor("Red");
    System.out.println(car1);
    System.out.println(car2);
  }
}
