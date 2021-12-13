package com.SpringBootProject.Farmer.Repository;


import com.SpringBootProject.Farmer.Model.FarmerUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FarmerRepository extends MongoRepository<FarmerUser,Integer> {
    List<FarmerUser> findById(String id);
}
