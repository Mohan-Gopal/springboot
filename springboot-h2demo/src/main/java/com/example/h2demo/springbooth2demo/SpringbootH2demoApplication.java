package com.example.h2demo.springbooth2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootH2demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootH2demoApplication.class, args);
	}

}

@RestController
@RequestMapping("/ticket")
class DatabaseController {	
	@GetMapping("/healthcheck")
	public String healthcheck() {
		return "App is running!!!";
	}	
}
