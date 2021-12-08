package com.SpringBootProject.Crop.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CropController {

    @RequestMapping(value = "/crop")
    public String sayHello()
    {
        return "Hello Spring Boot Project from Crop";
    }
}
