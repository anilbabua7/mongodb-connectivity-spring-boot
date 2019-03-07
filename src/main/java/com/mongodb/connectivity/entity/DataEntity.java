package com.mongodb.connectivity.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="dataEntity")
public class DataEntity {
	
	@Id
	private ObjectId objectId;
	private String data;
	
	public DataEntity() {
		
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ObjectId getObjectId() {
		return objectId;
	}

	public void setObjectId(ObjectId objectId) {
		this.objectId = objectId;
	}
	
	
	
	

}
