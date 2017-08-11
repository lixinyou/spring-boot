package com.java.spring.boot.example.service;

import com.java.spring.boot.example.dao.PersonRowMapper;
import com.java.spring.boot.example.viewmodel.Person;
import java.util.List;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DataService implements InitializingBean {

  @Autowired
  private JdbcTemplate template;

  @Autowired
  private BufferCounterService counterService;

  private String CREATE_TABLE_PERSON = "CREATE TABLE PERSON(NAME VARCHAR(25), ADDRESS VARCHAR(25), AGE INTEGER)";

  public void addPerson(Person person) {
    counterService.increment("service.dataService.invoked");
    template.update("INSERT INTO PERSON (NAME, AGE) VALUES (?, ?)", person.getName(), person.getAge());
  }

  public List<Person> getAllPerson() {
    return template.query("SELECT * FROM PERSON", new PersonRowMapper());
  }

  @Override
  public void afterPropertiesSet() throws Exception {
//    template.execute(CREATE_TABLE_PERSON);
  }
}
