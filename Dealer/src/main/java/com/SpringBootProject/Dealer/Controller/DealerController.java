package com.SpringBootProject.Dealer.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DealerController {

    @RequestMapping(value = "/dealer")
    public String sayHello()
    {
        return "Hello Spring Boot Project from Dealer";
    }
}

