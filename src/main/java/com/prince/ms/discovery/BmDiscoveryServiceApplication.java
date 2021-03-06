package com.prince.ms.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BmDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmDiscoveryServiceApplication.class, args);
	}

}
