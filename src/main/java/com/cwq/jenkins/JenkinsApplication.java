package com.cwq.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cwq"})
public class JenkinsApplication {
	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
