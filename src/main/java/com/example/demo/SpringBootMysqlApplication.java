package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.example.demo")
@EntityScan(basePackages = {"com.example.demo"})
@SpringBootApplication
public class SpringBootMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqlApplication.class, args);
	}

}
