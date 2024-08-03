package com.telemedicina.microservice.personas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient // Con esto le decimos al proyecto que se vamos a ser clientes de ´Eureka´
@SpringBootApplication
public class MicroservicePersonasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicePersonasApplication.class, args);
	}

}
