package com.mongodb.connectivity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.connectivity.entity.DataEntity;
import com.mongodb.connectivity.repository.IMongoDbRepo;

@RestController
public class DataEntityController {
	
	@Autowired
	IMongoDbRepo mongoRepo;

	/* @RequestMapping(value="getOnlyData")
	public List<String> getEntitiesData(){
		List<DataEntity> entities =  mongoRepo.getData();
	}*/
	
	@RequestMapping(value="getEntities")
	public List<DataEntity> getAllEntities(){
		return mongoRepo.findAll();
	}
	
	
}
