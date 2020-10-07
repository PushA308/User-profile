package com.example.api.repository;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.api.model.Profile;


public interface ProfileRepo extends MongoRepository<Profile, String>{
	Profile findBy_id(ObjectId _id);
}

