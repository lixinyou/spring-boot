package com.java.spring.boot.example.bean;

import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerBean implements ApplicationRunner {

  @Override
  public void run(ApplicationArguments args) throws Exception {
    List<String> argsList = args.getNonOptionArgs();
    System.out.println("使用ApplicationRunner输出args");
    for (String str : argsList) {
      System.out.println(str);
    }
  }
}
