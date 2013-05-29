package com.google.devrel.samples.helloendpoints;

public class Greeting {

  public String message;

  public Greeting() {};

  public Greeting(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
