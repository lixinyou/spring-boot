package com.java.spring.boot.example.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;

@Configuration
public class BootConfiguration {

//  @Bean
//  public HttpMessageConverters customConverters() {
//    HttpMessageConverter<?> additional = new StringHttpMessageConverter();
//    HttpMessageConverter<?> another = new FastJsonHttpMessageConverter();
//    return new HttpMessageConverters(additional, another);
//  }
}
