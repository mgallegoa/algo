package com.co.manuel.patterns.creation;

import java.util.Objects;

/*
 * Using the Builder Pattern to create the UserDTO object.
 */
public class UserDTO {

  private final String firstName;
  private final String lastName;
  private final String email;
  private final String phone;
  private final String birthDay;
  private final String gender;

  public UserDTO(Builder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.email = builder.email;
    this.phone = builder.phone;
    this.birthDay = builder.birthDay;
    this.gender = builder.gender;
  }

  public static class Builder {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String birthDay;
    private String gender;

    public UserDTO.Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public UserDTO.Builder lastName(String lastName) {
      // Example of validation
      Objects.requireNonNull(lastName);
      this.lastName = lastName;
      return this;
    }

    public UserDTO.Builder email(String email) {
      this.email = email;
      return this;
    }

    public UserDTO.Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    public UserDTO.Builder birthDay(String birthDay) {
      this.birthDay = birthDay;
      return this;
    }

    public UserDTO.Builder gender(String gender) {
      this.gender = gender;
      return this;
    }

    public UserDTO build() {
      if (this.firstName == null) {
        this.firstName("ExampleNameNotNull");
      }
      if (this.gender == null) {
        this.gender("Male");
      }
      return new UserDTO(this);
    }
  }

  @Override
  public String toString() {
    return this.firstName + " " + this.lastName + " " + this.email + " " + this.phone + " " + this.birthDay + " "
        + this.gender;
  }
}
