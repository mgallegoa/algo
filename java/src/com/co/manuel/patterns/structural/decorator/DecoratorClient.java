package com.co.manuel.patterns.structural.decorator;

public class DecoratorClient {
  public static void main(String[] args) {

    System.out.println("Structural patterns - Decorator pattern");

    String fileName = "/home/manuel/tmp/decoratorPattern.txt";
    String data = "Name,Salary\nManuel,9000\nJhon,500";

    DataSourceDecorator encoded = new CompressDecorator(new EncryptDecorator(new FileDataSource(fileName)));
    encoded.write(data);

    DataSource plainText = new FileDataSource(fileName);
    System.out.println("----- Input ---------------");
    System.out.println(data);
    System.out.println("----- Encoded ---------------");
    System.out.println(plainText.read());
    System.out.println("----- Decoded ---------------");
    System.out.println(encoded.read());

  }

}
