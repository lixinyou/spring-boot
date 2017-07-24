package com.java.spring.boot.example.service;

import org.springframework.stereotype.Service;

@Service(value = "exampleService")
public class ExampleService {

  public void exampleService() {
    System.out.println("example service...");
    System.out.println("test spring-boot-devtools");
    System.out.println("test IDEA spring-boot-devtools");
    System.out.println("test mvn plugins spring-boot-devtools");
  }

}
