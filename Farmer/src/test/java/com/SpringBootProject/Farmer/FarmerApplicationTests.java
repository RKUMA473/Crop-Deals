package com.SpringBootProject.Farmer;

import com.SpringBootProject.Farmer.Model.FarmerUser;
import com.SpringBootProject.Farmer.Repository.FarmerRepository;
import com.SpringBootProject.Farmer.Service.FarmerService;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import javax.annotation.security.RunAs;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;

@SpringBootTest
class FarmerApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private FarmerService service;

	@MockBean
	private FarmerRepository repository;

	public void getFarmerUser(){
		when(repository.findAll()).thenReturn(Stream
		.of(new FarmerUser(1,"A","Annie","Annie@gmail",8123)).collect(Collectors.toList()));
		assert (service.getCropList().equals(2));

	}
}
