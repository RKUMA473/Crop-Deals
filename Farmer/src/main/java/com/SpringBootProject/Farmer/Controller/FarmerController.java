package com.SpringBootProject.Farmer.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarmerController {
    @RequestMapping(value = "/farmer")
    public String sayHello()
    {
        return "Hello Spring Boot Project from Farmer";
    }
    }

