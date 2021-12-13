package com.SpringBootProject.Crop.Repository;

import com.SpringBootProject.Crop.Models.CropDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CropRepository extends MongoRepository<CropDetails,Integer> {

}
