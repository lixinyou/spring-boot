package com.java.spring.boot.example.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BootConfiguration {

//  @Bean
//  public HttpMessageConverters customConverters() {
//    HttpMessageConverter<?> additional = new StringHttpMessageConverter();
//    HttpMessageConverter<?> another = new FastJsonHttpMessageConverter();
//    return new HttpMessageConverters(additional, another);
//  }

  @Bean
  @ConfigurationProperties("spring.datasource.druid")
  public DataSource dataSourceTwo(){
    return DruidDataSourceBuilder.create().build();
  }
}
