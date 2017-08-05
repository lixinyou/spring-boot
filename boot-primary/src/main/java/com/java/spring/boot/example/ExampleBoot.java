package com.java.spring.boot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
//@ComponentScan
@SpringBootApplication
@ServletComponentScan
public class ExampleBoot {

  public static void main(String[] args) throws Exception {
    //彻底禁止重启
//    System.setProperty("spring.devtools.restart.enabled", "false");
    SpringApplication.run(ExampleBoot.class, args);
  }
}