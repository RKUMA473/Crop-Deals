package com.SpingBootProject.Admin.Service.Controller;


import com.SpingBootProject.Admin.Service.Model.FarmerUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import javax.xml.catalog.Catalog;


@RestController
public class AdminController{

    @RequestMapping(value = "/admin")
    public String sayHello()
    {
        return "Hello Spring Boot Project from Admin";
    }
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @RequestMapping
    public FarmerUser getCatalog(@PathVariable int farmerId){
        FarmerUser farmerDetails = restTemplate.getForObject("http://8081/farmer/"+farmerId)
    }
    }








