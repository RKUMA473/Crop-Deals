package com.SpingBootProject.Admin.Service.Controller;

import com.SpingBootProject.Admin.Service.Model.DealerUser;
import com.SpingBootProject.Admin.Service.Model.FarmerUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private RestTemplate restTemplate;

   //Check the Hello World Program
    @RequestMapping(value = "/hello")
    public String sayHello()
    {
        return "Hello Spring Boot Project from Admin";
    }

    //Fetch the details of Farmer
    @GetMapping(value="/findAllFarmer")
    public List<FarmerUser> AllFarmerDetails(){
        return Arrays.asList(restTemplate.getForObject("http://localhost:9001/farmer/findAllFarmer",FarmerUser[].class));
    }
    @GetMapping(value = "/findOneFarmer/{id}")
    public FarmerUser farmerDetails(@PathVariable int id){
        FarmerUser farmerDetails=restTemplate.getForObject("http://localhost:9001/farmer/findOneFarmer/"+id, FarmerUser.class);
        return farmerDetails;
    }

    @PutMapping("/updateFarmer/{id}")
    public String UpdateFarmer(@PathVariable String farmerId, @RequestBody FarmerUser farmer) {
        return restTemplate.postForObject("http://localhost:9001/farmer/updateFarmer" + farmerId, farmer,String.class);
    }

    @DeleteMapping("/delete/{id}")
    public  String farmer(@PathVariable int id){
        restTemplate.delete("http://localhost:9001/farmer/delete/"+id);
        return "Farmer is Successfully Deleted :" +id;
    }

    // Fetch the details of Dealer
    @GetMapping(value="/findAllDealer")
    public List<DealerUser> AllDealerDetails(){
        return Arrays.asList(restTemplate.getForObject("http://localhost:9001/dealer/findAllDealer",DealerUser[].class));
    }
    @GetMapping(value = "/findOneDealer/{id}")
    public DealerUser dealerDetails(@PathVariable int id){
        DealerUser dealerDetails=restTemplate.getForObject("http://localhost:9001/dealer/findOneDealer/"+id, DealerUser.class);
        return dealerDetails;
    }
    @PostMapping(value="/addDealer")
    public DealerUser dealerUser(@RequestBody DealerUser dealerUser){
        DealerUser saveDealer=restTemplate.getForObject("http://localhost:9001/dealer/addDealer",DealerUser.class);
        return saveDealer;
    }
    @DeleteMapping("/delete/{id}")
    public  String deleteDealerId(@PathVariable int id){
       restTemplate.getForObject("http://localhost:9001/dealer/delete/"+id,DealerUser.class);
        return "Dealer is Successfully Deleted :" +id;
    }
}








