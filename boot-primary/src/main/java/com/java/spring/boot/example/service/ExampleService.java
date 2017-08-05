package com.java.spring.boot.example.service;

import com.java.spring.boot.example.bean.ExampleBean;
import com.java.spring.boot.example.bean.ExampleRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "exampleService")
public class ExampleService {

  @Autowired
  private ExampleBean exampleBean;

  @Autowired
  private ExampleRandom exampleRandom;

  public void printRandom() {
    exampleRandom.printRandom();
  }

  public void printCommandLineArgs() {
    exampleBean.printCommandLineArgs();
  }

}
