package com.java.spring.boot.example.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExampleRandom {


  @Value(value = "${my.number}")
  private int randomInt;

  @Value(value = "${my.bigNumber}")
  private long randomLong;

  @Value(value = "${my.secret}")
  private String random;


  public void printRandom() {
    System.out.println("my.number:" + randomInt);
    System.out.println("my.bigNumber:" + randomLong);
    System.out.println("my.secret:" + random);
  }
}
