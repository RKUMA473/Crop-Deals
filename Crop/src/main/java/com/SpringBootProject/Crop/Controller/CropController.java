package com.SpringBootProject.Crop.Controller;

import com.SpringBootProject.Crop.Models.CropDetails;
import com.SpringBootProject.Crop.Repository.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/crop")
public class CropController<Crop> {

    @Autowired
    private CropRepository repository;

    //check the Hello World Program
    @RequestMapping(value = "/hello")
    public String sayHello()
    {
        return "Hello Spring Boot Project from Crop";
    }

    @PostMapping("/addCrop")
    public String saveCrop(@RequestBody CropDetails crop)
    {
        repository.save(crop);
        return "Add Crop with id:" + crop.getCropId();
    }

    @GetMapping("/findAllCrop")
    public List<CropDetails> getCrop()
    {
        return repository.findAll();
    }

    @GetMapping("/findOneCrop/{id}")
    public CropDetails getCrop(@PathVariable int id)
    {
       return repository.findById(id).get();
    }


    @DeleteMapping("/delete/{id}")
    public String deleteCrop(@PathVariable int id)
    {
        repository.deleteById(id);
        return "Crop deleted with id :" +id;
    }

    @RequestMapping("/updateCrop")
    public CropDetails updateCrop(@RequestBody CropDetails cropDetails){
       CropDetails cd= repository.findById(cropDetails.getCropId()).get();
        cd.setCropName(cropDetails.getCropName());
        cd.setCropPrice(cropDetails.getCropPrice());
        cd.setCropQuantity(cropDetails.getCropQuantity());
        return repository.save(cd);

    }



    }


