package com.edstem.assessment_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Assessment01Application {

	public static void main(String[] args) {
		SpringApplication.run(Assessment01Application.class, args);
	}
}

