package com.co.manuel.patterns.creation;

public class BuilderPattern {

  public static void main(String[] args) {

    UserDTO userDTO = new UserDTO.Builder()
        .firstName("Manuel")
        .lastName("Arias")
        .build();

    System.out.println("Builder pattern -->" + userDTO);

  }
}
