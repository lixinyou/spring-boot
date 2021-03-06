package com.java.spring.boot.example.test;

import com.java.spring.boot.example.mq.Producer;
import javax.jms.JMSException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleActiveMqTests {

  @Rule
  public OutputCapture outputCapture = new OutputCapture();

  @Autowired
  private Producer producer;

  @Test
  public void sendSimpleMessage() throws InterruptedException, JMSException {
    this.producer.send("Test message");
    Thread.sleep(1000L);
//    assertThat(this.outputCapture.toString().contains("Test message")).isTrue();
  }

}
