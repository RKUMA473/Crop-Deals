package com.SpringBootProject.Farmer.Controller;

import com.SpringBootProject.Farmer.Model.FarmerUser;
import com.SpringBootProject.Farmer.Repository.FarmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class FarmerController<Farmer> {

    @Autowired
    private FarmerRepository repository;

    @Autowired(required = true)
    //Check the Hello World Program
    @RequestMapping(value = "/farmer")
    public String sayHello() {
        return "Hello Spring Boot Project from Farmer";
    }

//    RestTemplate restTemplate = new RestTemplate();


    @PostMapping("/addFarmer")
    public String saveFarmer(@RequestBody FarmerUser farmer)
    {
        repository.save(farmer);
        return  "Add farmer with id:" + farmer.getFarmerId();
    }

    @GetMapping("/findAllFarmer")
    public List<FarmerUser> getFarmer()
    {
        return repository.findAll();
    }

    @GetMapping("/findAllFarmer/{id}")
    public String getFarmer(@PathVariable int farmerId)
    {
        repository.findById(farmerId).get();
        return "Find farmer with id:" +farmerId;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteFarmer(@PathVariable int farmerId)
    {
        repository.deleteById(farmerId);
        return "Farmer deleted with id :"+farmerId;
    }
}




