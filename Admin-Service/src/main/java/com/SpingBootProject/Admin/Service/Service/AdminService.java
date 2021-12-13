package com.SpingBootProject.Admin.Service.Service;

import com.SpingBootProject.Admin.Service.Model.DealerUser;
import com.SpingBootProject.Admin.Service.Model.FarmerUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class AdminService {

    private RestTemplate restTemplate;

    @Autowired
    public AdminService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

    public String saveFarmer(FarmerUser farmerUser){
        HttpEntity<FarmerUser> entity=new HttpEntity<>(farmerUser);
        return  restTemplate.exchange("http://localhost:8081/farmer/addFarmer", HttpMethod.POST,entity, String.class).getBody();
    }

    public List<FarmerUser> getFarmer(){
        return  restTemplate.exchange("http://localhost:8081/farmer/findAllFarmer",HttpMethod.GET,null,List.class).getBody();
    }

          public String saveDealer(DealerUser dealerUser){
          HttpEntity<DealerUser> entity=new HttpEntity<>(dealerUser);
          return  restTemplate.exchange("http://localhost:8082/dealer/addDealer", HttpMethod.POST,entity, String.class).getBody();
      }

    public List<DealerUser> getDealer(){
        return  restTemplate.exchange("http://localhost:8082/dealer/findAllDealer",HttpMethod.GET,null,List.class).getBody();
    }
  }
