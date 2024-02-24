package com.alurafood.alurafoodserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AluraFoodServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AluraFoodServiceRegistryApplication.class, args);
	}

}
