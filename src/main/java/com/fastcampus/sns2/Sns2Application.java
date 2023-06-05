package com.fastcampus.sns2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Sns2Application {

	public static void main(String[] args) {
		SpringApplication.run(Sns2Application.class, args);
	}

}
