package io.railway.adminservice.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import io.railway.adminservice.entity.Admin;

@Repository

public interface AdminRepository extends MongoRepository<Admin, String> {
	
	Admin findByUsername(String username);
	  Boolean existsByUsername(String  username);
	  Boolean existsByEmail(String email);

}
