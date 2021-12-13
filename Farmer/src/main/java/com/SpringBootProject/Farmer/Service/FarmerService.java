package com.SpringBootProject.Farmer.Service;

import com.SpringBootProject.Farmer.Model.CropDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class FarmerService {

    @Autowired
    RestTemplate restTemplate;

    public CropDetails addCrop(){
        restTemplate.postForObject("http://localhost:9001/crop/addCrop",addCrop(),CropDetails.class);
        return addCrop();
    }

    public List<CropDetails> getCropList() {
        CropDetails[] cd = restTemplate.getForObject("http://localhost:9001/crop/findAllCrop", CropDetails[].class);
        return Arrays.asList(cd);
    }

    public CropDetails updateCrop(){
        CropDetails uC=restTemplate.getForObject("http://localhost:9001/crop/update/" +updateCrop(),CropDetails.class);
        return updateCrop();
    }
}
