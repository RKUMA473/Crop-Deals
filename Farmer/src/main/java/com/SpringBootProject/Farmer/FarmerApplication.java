package com.SpringBootProject.Farmer;

import com.SpringBootProject.Farmer.Model.FarmerUser;
import com.SpringBootProject.Farmer.Repository.FarmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableEurekaClient
public class FarmerApplication implements CommandLineRunner {
    @Autowired
    private FarmerRepository fr;

    public static void main(String[] args)
    {
        SpringApplication.run(FarmerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (fr.findAll().isEmpty()) {
            fr.save(new FarmerUser(1, "S", "simran", "raj@gmail.com", 54645));
        }
    }

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}


