package com.scm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartContactManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartContactManagerApplication.class, args);
	}

}
// npx tailwindcss -i ./src/main/resources/static/css/input.css -o ./src/main/resources/static/css/output.css --watch