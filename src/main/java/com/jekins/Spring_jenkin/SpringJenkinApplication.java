package com.jekins.Spring_jenkin;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringJenkinApplication.class);
	@PostConstruct
	public void init() {
		logger.info("Application execution started...");
	}

	public static void main(String[] args) {
		logger.info("Application is up and running...");
		logger.info("logger is working fine...");
		SpringApplication.run(SpringJenkinApplication.class, args);
	}

}
