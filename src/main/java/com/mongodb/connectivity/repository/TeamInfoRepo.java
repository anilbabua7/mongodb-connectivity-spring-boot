package com.mongodb.connectivity.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.connectivity.entity.TeamInfoEntity;
import com.mongodb.connectivity.entity.TeamName;

public interface TeamInfoRepo extends MongoRepository<TeamInfoEntity, ObjectId>{
	
	public List<TeamName> findByTeamName(String team);

}
