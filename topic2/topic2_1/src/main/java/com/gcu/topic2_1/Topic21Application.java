package com.gcu.topic2_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.gcu"})
public class Topic21Application {

	public static void main(String[] args) {
		SpringApplication.run(Topic21Application.class, args);
	}

}
