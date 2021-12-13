package com.SpringBootProject.Dealer.Repository;

import com.SpringBootProject.Dealer.Model.DealerUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DealerRepository extends MongoRepository<DealerUser, Integer> {

}
