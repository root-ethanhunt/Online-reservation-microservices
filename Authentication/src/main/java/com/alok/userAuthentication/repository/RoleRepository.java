package com.alok.userAuthentication.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alok.userAuthentication.models.ERole;
import com.alok.userAuthentication.models.Role;




public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
