package com.java.spring.boot.example.controller;

import com.java.spring.boot.example.service.ExampleService;
import com.java.spring.boot.example.viewmodel.Person;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

  @Autowired
  private ExampleService exampleService;

  @RequestMapping("/random")
  String random() {
    exampleService.printRandom();
    return "Hello World!";
  }

  @RequestMapping("/cmdLineArgs")
  String cmdLineArgs() {
    exampleService.printRandom();
    return "Hello World!";
  }

  @RequestMapping(value = "/findPerson")
  @ResponseBody
  Person findPerson() {
    Person person = new Person();
    return person;
  }

  @RequestMapping(value = "/crossOrigin")
  @ResponseBody
  @CrossOrigin
  Map<String, Object> crossOriginRsShare() {
    Map<String, Object> shareData = new HashMap<>();
    shareData.put("shareData", "shareData");
    return shareData;
  }

}
