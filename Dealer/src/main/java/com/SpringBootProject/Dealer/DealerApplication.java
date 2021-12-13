package com.SpringBootProject.Dealer;

import com.SpringBootProject.Dealer.Model.DealerUser;
import com.SpringBootProject.Dealer.Repository.DealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class DealerApplication  implements CommandLineRunner {
    @Autowired
	private DealerRepository dr;

	public static void main(String[] args)
	{
		SpringApplication.run(DealerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (dr.findAll().isEmpty()) {
			dr.save(new DealerUser(1, "A", "Annie", "annie@gmail.com", 12345));
		}
	}
	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
