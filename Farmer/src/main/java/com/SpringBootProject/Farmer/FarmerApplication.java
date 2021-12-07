package com.SpringBootProject.Farmer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FarmerApplication {
  //ravi
	public static void main(String[] args)
	{
		SpringApplication.run(FarmerApplication.class, args);
	}
}
