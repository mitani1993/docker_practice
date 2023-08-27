package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotatin.RequestMapping;
import org.springframework.web.bind.annotatin.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @RequestMapping("/")
  public String hello() {
    return "Hello Spring Boot on Docker"
  }
}
