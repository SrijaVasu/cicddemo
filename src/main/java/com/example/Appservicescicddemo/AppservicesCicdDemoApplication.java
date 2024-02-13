package com.example.Appservicescicddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppservicesCicdDemoApplication {

	@GetMapping("/message")
	public String message() {
		return "Application successfully deployed to Azure App services using git hub actions.";
	}
	public static void main(String[] args) {
		SpringApplication.run(AppservicesCicdDemoApplication.class, args);
	}

}
