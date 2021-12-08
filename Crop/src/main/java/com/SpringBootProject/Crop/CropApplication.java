package com.SpringBootProject.Crop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CropApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropApplication.class, args);
	}

}
