package com.example.vehicleinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class VehicleInfoServiceApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
           return  new RestTemplate();
	}

    @Bean
	public WebClient.Builder getWebClient(){
		   WebClient.Builder builder = WebClient.builder();
		   return  builder;
	}

	public static void main(String[] args) {
		SpringApplication.run(VehicleInfoServiceApplication.class, args);
	}

}
