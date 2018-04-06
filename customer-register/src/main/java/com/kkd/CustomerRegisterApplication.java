package com.kkd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CustomerRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRegisterApplication.class, args);
	}
}
