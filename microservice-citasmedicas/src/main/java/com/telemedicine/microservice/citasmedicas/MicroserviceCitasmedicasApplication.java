package com.telemedicine.microservice.citasmedicas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient // Habilita el cliente de descubrimiento
@SpringBootApplication
public class MicroserviceCitasmedicasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCitasmedicasApplication.class, args);
	}

}
