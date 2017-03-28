package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoClientApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello World!";
	}

	@Bean
	CurrentTimeEndpoint currentTimeEndpoint() {
		return new CurrentTimeEndpoint();
	}

	@Bean
	SocketHealthIndicator socketHealthIndicator() {
		SocketHealthIndicator indicator = new SocketHealthIndicator();
		indicator.setHost("localhost");
		indicator.setPort(8080);
		return indicator;
	}
}
