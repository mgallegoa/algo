package com.co.manuel.algorithms.string;

import java.util.Objects;

/*
 * This class is to show the implementations for good HashCode and Equals
 *
 * 1. If equal() return true, the hashCode() method have to return true.
 * 2. If hashCode() return true, the equal() method could not return true.
 *
 */
public class HashCodeEqualsMethods {

  public static class UserDto {
    private String name;
    private String email;

    public UserDto(String name, String email) {
      this.name = name;
      this.email = email;
    }

    @Override
    public int hashCode() {
      int result = name == null ? 0 : name.hashCode();
      result = 31 * result + (email == null ? 0 : email.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (obj == this) {
        return true;
      }
      if (obj == null || obj.getClass() != this.getClass()) {
        return false;
      }
      UserDto that = (UserDto) obj;
      return Objects.equals(this.name, that.name) && Objects.equals(this.email,
          that.email);
    }

    @Override
    public String toString() {
      return this.name + ", email: " + this.email;
    }

  }

  public static void main(String[] args) {
    System.out.println("The hashCode() and equals() methods -->");
    UserDto userDto1 = new UserDto("manuel", "manuel@example.com");
    System.out.println(userDto1.toString() + " hashCode = " + userDto1.hashCode());
    UserDto userDto2 = new UserDto("manuel", "manuel@example.com");
    System.out.println(userDto2.toString() + " hashCode = " + userDto2.hashCode());
    System.out.println("The objects are iquals? " + userDto1.equals(userDto2));
  }

}
