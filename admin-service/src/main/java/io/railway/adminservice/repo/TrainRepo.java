package io.railway.adminservice.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import io.railway.adminservice.entity.Train;

@Repository
public interface TrainRepo extends MongoRepository<Train, Integer>{

	@Query("{from_station: ?0, to_station: ?1}")
	List<Train> findtrains(String from, String to);
	
	@Query("{train_name: /?0/}")
	List<Train> trainName(String name);
}
