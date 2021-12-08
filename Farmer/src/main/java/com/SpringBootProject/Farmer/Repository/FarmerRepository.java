package com.SpringBootProject.Farmer.Repository;


import com.SpringBootProject.Farmer.Model.FarmerUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FarmerRepository extends MongoRepository<FarmerUser,Integer> {


}
