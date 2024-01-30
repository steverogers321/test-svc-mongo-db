package com.mongo.testmongo.model;

import java.util.Map;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "DecisionTree")
public class DecisionTree {

	@Indexed(unique = true)
	private String id;
	
	private String name;
	
	private Map<String, Object> steps;
}
