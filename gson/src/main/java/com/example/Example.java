package com.example;

import com.google.gson.Gson;

public final class Example {
  public static void main(String[] args) {
    Person p = new Person("Alice", 30);
    Gson gson = new Gson();
    String json = gson.toJson(p);
    System.out.println("as JSON: " + json);
    Person p2 = gson.fromJson(json, Person.class);
    System.out.println("back to object: " + p2);
  }

  // nested so we don’t have two top‐level classes
  private static class Person {
    private final String name;
    private final int age;
    Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
    @Override
    public String toString() {
      return name + " (" + age + ")";
    }
  }
}
