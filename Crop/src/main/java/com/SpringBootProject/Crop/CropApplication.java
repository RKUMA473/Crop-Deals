package com.SpringBootProject.Crop;


import com.SpringBootProject.Crop.Models.CropDetails;
import com.SpringBootProject.Crop.Repository.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CropApplication implements CommandLineRunner {
	@Autowired
	private CropRepository cr;

	public static void main(String[] args)
	{
		SpringApplication.run(CropApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	if(cr.findAll().isEmpty()){
		cr.save(new CropDetails(1,"Rice",100.0,1000.0));
	}
	}
}
