package com.SpringBootProject.Farmer.Controller;

import com.SpringBootProject.Farmer.Model.CropDetails;
import com.SpringBootProject.Farmer.Model.FarmerUser;
import com.SpringBootProject.Farmer.Repository.FarmerRepository;
import com.SpringBootProject.Farmer.Service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "/farmer")
public class FarmerController<Farmer> {
    @Autowired
    FarmerService fs;

    @Autowired
    private FarmerRepository repository;

    //Check the Hello World Program
    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "Hello Spring Boot Project from Farmer";
    }

    @GetMapping("/findAllFarmer")
    public List<FarmerUser> getFarmer() {
        return repository.findAll();
    }
//    @GetMapping("/getFarmer")
//    public ResponseEntity<List<FarmerUser>> getAll() {
//        return new ResponseEntity<>(getFarmer(), HttpStatus.OK);
//    }

    @PostMapping("/addFarmer")
    public String addFarmer(@RequestBody FarmerUser farmer) {
        repository.save(farmer);
        return "Add farmer with id:" + farmer.getFarmerId();
    }

    @GetMapping("/findOneFarmer/{id}")
    public FarmerUser getFarmer(@PathVariable int id) {
        return repository.findById(id).get();
    }

//    @PutMapping("/updateFarmer/{id}")
//    public String UpdateFarmer(@PathVariable String farmerId, @RequestBody FarmerUser farmer) {
//        repository.postForObject
//                return "Farmer is Succesffuly Updated"
//    }

    @DeleteMapping("/delete/{id}")
    public String deleteFarmer(@PathVariable int id) {
        repository.deleteById(id);
        return "Farmer deleted with id :" + id;
    }

    // Fetching Details of Crop via Farmer Microservices
    @PostMapping("/addCrop")
    public CropDetails saveCrop(@RequestBody CropDetails cropDetails) {
        return fs.addCrop();
    }

    @GetMapping("/getAllCrop")
    public List<CropDetails> getCrops() {
        return fs.getCropList();
    }

    @PostMapping("/updateCrop")
    public String UpdateCrop(@RequestBody CropDetails cropDetails) {
        return fs.updateCrop().getCropName();}

    }













