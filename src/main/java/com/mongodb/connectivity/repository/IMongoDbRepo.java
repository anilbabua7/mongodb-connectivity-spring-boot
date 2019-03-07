package com.mongodb.connectivity.repository;



import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.connectivity.entity.DataEntity;

public interface IMongoDbRepo extends MongoRepository<DataEntity, ObjectId>{

}
