package com.example.api.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.api.model.Profile;


public interface ProfileRepo extends MongoRepository<Profile, String>{
	
}

