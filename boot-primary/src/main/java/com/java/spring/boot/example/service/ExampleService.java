package com.java.spring.boot.example.service;

import org.springframework.stereotype.Service;

@Service(value = "exampleService")
public class ExampleService {

  public void exampleService() {
    System.out.println("example service...");
  }

}
