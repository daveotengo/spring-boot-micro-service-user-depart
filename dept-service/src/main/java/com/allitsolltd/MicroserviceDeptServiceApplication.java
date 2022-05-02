package com.allitsolltd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceDeptServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDeptServiceApplication.class, args);
	}

}
