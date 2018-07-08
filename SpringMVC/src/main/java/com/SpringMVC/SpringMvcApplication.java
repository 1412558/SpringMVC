package com.SpringMVC;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringMvcApplication {
	Logger logger = LoggerFactory.getLogger(this.getClass());


	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}

}
