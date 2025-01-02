package com.java.smart.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GhCicdActionsApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome java cicd!";
	}

	public static void main(String[] args) {
		SpringApplication.run(GhCicdActionsApplication.class, args);
	}

}