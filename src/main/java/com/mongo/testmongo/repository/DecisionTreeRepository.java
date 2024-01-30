package com.mongo.testmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.testmongo.model.DecisionTree;

@Repository
public interface DecisionTreeRepository extends MongoRepository<DecisionTree, String> {

}
