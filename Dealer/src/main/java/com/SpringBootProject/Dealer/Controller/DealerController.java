package com.SpringBootProject.Dealer.Controller;

import com.SpringBootProject.Dealer.Model.DealerUser;
import com.SpringBootProject.Dealer.Repository.DealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/dealer")
public class DealerController<Dealer> {

    @Autowired
    private DealerRepository repository;

    @Autowired(required = true)

   //check the Hello World Program
    @RequestMapping(value = "/hello")
    public String sayHello()
    {
        return "Hello Spring Boot Project from Dealer";
    }

    @PostMapping("/addDealer")
    public String saveDealer(@RequestBody DealerUser dealer)
    {
        repository.save(dealer);
        return  "Add dealer with id:" + dealer.getDealerId();
    }

    @GetMapping("/findAllDealer")
    public List<DealerUser> getDealer()
    {
        return repository.findAll();
    }

    @GetMapping("/findOneDealer/{id}")
    public DealerUser getDealer(@PathVariable int id)
    {
        return repository.findById(id).get();

    }

    @DeleteMapping("/delete/{id}")
    public String deleteDealer(@PathVariable int id)
    {
        repository.deleteById(id);
        return "Farmer deleted with id :"+id;
    }
}

