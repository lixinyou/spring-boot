package com.java.spring.boot.example;

import com.java.spring.boot.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
//@ComponentScan
@SpringBootApplication
public class Example {

  @Autowired
  private ExampleService exampleService;

  @RequestMapping("/")
  String home() {
    exampleService.exampleService();
    return "Hello World!";
  }

  public static void main(String[] args) throws Exception {
    //彻底禁止重启
//    System.setProperty("spring.devtools.restart.enabled", "false");
    SpringApplication.run(Example.class, args);
  }
}