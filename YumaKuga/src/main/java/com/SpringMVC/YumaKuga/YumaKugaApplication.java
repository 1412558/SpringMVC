package com.SpringMVC.YumaKuga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//https://start.spring.io/
@SpringBootApplication
@RestController
public class YumaKugaApplication {
public static void main(String[] args) {
                SpringApplication.run(YumaKugaApplication.class, args);
        }
@GetMapping("/")
        public String hello() {
                return "Hello Spring Boot!";
        }
}