package com.java.spring.boot.example.bean;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ExampleBean {

//  @Value(value = "${name}")
  private List<String> commandLineArgs;


  //用于取系统量
//  @Value(value = "${spring.application.json}")
//  private String json;

  @Autowired
  public ExampleBean(ApplicationArguments args) {
    List<String> argsList = args.getNonOptionArgs();
    System.out.println("使用ApplicationArguments输出args");
    for (String str : argsList) {
      System.out.println(str);
    }
  }

  public void printCommandLineArgs() {
    System.out.println("使用@Value输出args");
    for (String str : commandLineArgs) {
      System.out.println(str);
    }

//    System.out.println("输出系统变量" + json);
  }

}
