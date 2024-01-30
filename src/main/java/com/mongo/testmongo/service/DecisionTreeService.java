package com.mongo.testmongo.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mongo.testmongo.model.DecisionTree;
import com.mongo.testmongo.repository.DecisionTreeRepository;
import ch.qos.logback.core.testUtil.RandomUtil;

@Service
public class DecisionTreeService {
	
	@Autowired
	private DecisionTreeRepository decisionTreeRepository;

	public ResponseEntity<DecisionTree> createDecisionTree(DecisionTree decisionTree) {

		decisionTree.setId(UUID.randomUUID().toString());
		decisionTreeRepository.save(decisionTree);
		return ResponseEntity.ok(decisionTree);
	}

	public ResponseEntity<DecisionTree> updateDecisionTree(String decisionTreeId, DecisionTree decisionTree) {
		DecisionTree existingDecisionTree = decisionTreeRepository.findById(decisionTreeId).get();
		decisionTree.setId(existingDecisionTree.getId());
		decisionTreeRepository.save(decisionTree);
		return ResponseEntity.ok(decisionTree);
	}
	
	public ResponseEntity<DecisionTree> getDecisionTree(String id) {
		Optional<DecisionTree> decisionTree = decisionTreeRepository.findById(id);
		return ResponseEntity.ofNullable(decisionTree.isPresent() ? decisionTree.get() : null);
	}

}
