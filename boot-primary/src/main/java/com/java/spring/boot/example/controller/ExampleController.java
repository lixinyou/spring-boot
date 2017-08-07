package com.java.spring.boot.example.controller;

import com.java.spring.boot.example.service.DataService;
import com.java.spring.boot.example.service.ExampleService;
import com.java.spring.boot.example.viewmodel.Person;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

  @Autowired
  private ExampleService exampleService;

  @Autowired
  private DataService dataService;

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

  @RequestMapping(value = "/persistSession")
  String sessionPersistence(HttpServletRequest request) {
    HttpSession session = request.getSession();
    return session.getId();
  }

  @RequestMapping(value = "/addPerson")
  @ResponseBody
  String addPerson() {
    Person person = new Person();
    person.setName("lxy");
    person.setAge(18);
    dataService.addPerson(person);
    return "ok";
  }

  @RequestMapping(value = "/getAllPerson")
  @ResponseBody
  List<Person> getAllPerson() {
    return dataService.getAllPerson();
  }

}
