package com.java.spring.boot.example.dao;

import com.java.spring.boot.example.viewmodel.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PersonRowMapper implements RowMapper<Person> {

  @Override
  public Person mapRow(ResultSet resultSet, int i) throws SQLException {
    Person person = new Person();
    person.setName(resultSet.getString("NAME"));
    person.setAddress(resultSet.getString("ADDRESS"));
    person.setAge(resultSet.getInt("AGE"));
    return person;
  }
}
