package com.java.spring.boot.example;

import javax.jms.Queue;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.boot.system.EmbeddedServerPortFileWriter;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
//@ComponentScan
@SpringBootApplication
@ServletComponentScan
@EnableJms
public class ExampleBoot {


  public static void main(String[] args) throws Exception {
    //彻底禁止重启
//    System.setProperty("spring.devtools.restart.enabled", "false");
    SpringApplication app = new SpringApplication(ExampleBoot.class);
//    app.addListeners(new ApplicationPidFileWriter());
//    app.addListeners(new EmbeddedServerPortFileWriter());
    app.run(ExampleBoot.class, args);
  }

  @Bean
  public Queue queue() {
    return new ActiveMQQueue("sample.queue");
  }
}