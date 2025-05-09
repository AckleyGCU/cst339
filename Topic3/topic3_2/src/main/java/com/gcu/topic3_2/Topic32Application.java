package com.gcu.topic3_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.gcu"})
public class Topic32Application {

	public static void main(String[] args) {
		SpringApplication.run(Topic32Application.class, args);
	}

}
