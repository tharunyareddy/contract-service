package com.easyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EsEurekaRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsEurekaRegistryApplication.class, args);
	}

}
