package com.linkedin.javacodechallenges;

public class Person {
  private String firstName;
  private String lastName;
  private int age;

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public void setFirstName(String input) {
    this.firstName = input;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setLastName(String input) {
    this.lastName = input;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setAge(int input) {
    if (input < this.age) {
      System.out.println("You can't go backwards in age");
    } else {
      this.age = input;
    }
  }

  public int getAge() {
    return this.age;
  }

  public void introduction() {
    System.out.print("My name is " + getFirstName() + " " + getLastName() + " and I am " + getAge() + " years old.");
  }

}
