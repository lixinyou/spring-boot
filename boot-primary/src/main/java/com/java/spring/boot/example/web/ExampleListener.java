package com.java.spring.boot.example.web;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class ExampleListener implements HttpSessionListener {

  @Override
  public void sessionCreated(HttpSessionEvent se) {

  }

  @Override
  public void sessionDestroyed(HttpSessionEvent se) {

  }
}
