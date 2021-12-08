package com.SpringBootProject.Farmer.Controller;

import com.SpringBootProject.Farmer.Model.FarmerUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
public class FarmerController<FarmerRepository> {
    @RequestMapping(value = "/farmer")
    public String sayHello()
    {
        return "Hello Spring Boot Project from Farmer";
    }

    @Autowired(required=true)
    RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private FarmerRepository repository;

    @GetMapping("/findAllFarmer")
    public List<FarmerUser> getFarmer() {
        return repository.findAll();

    }

    @PostMapping("/addFarmer")
    public String saveFarmer(@RequestBody FarmerUser farmer) {
        repository.save(farmer);
        return "Added farmer "+ farmer.getId();
    }


    @GetMapping("/findAllFarmer/{id}")
    public Optional<FarmerUser> getFarmer(@PathVariable int id) {
        return repository.findById(id);
    }


    @PutMapping("/updateFarmer/{id}")
    public String putFarmer(@RequestBody FarmerUser farmer) {
        repository.save(farmer);
        return "farmer updated with id:"+farmer.getId();
    }



    @DeleteMapping("/delete/{id}")
    public String deleteFarmer(@PathVariable int id) {
        repository.deleteById(id);
        return "farmer deleted with id :"+id;
    }
}



