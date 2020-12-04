package com.example.temperatureservice.controller;

import com.example.temperatureservice.model.Temperature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
// @EnableCircuitBreaker
@RestController
public class TemperatureServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperatureServiceApplication.class, args);
	}

	@GetMapping("/currentTemp")
	public Temperature getTemperature(){
		return new Temperature(42);
	}

}
