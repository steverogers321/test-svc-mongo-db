package com.mongo.testmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.testmongo.model.DecisionTree;
import com.mongo.testmongo.service.DecisionTreeService;

@RestController
public class DecisionTreeController {
	
	@Autowired
	private DecisionTreeService decisionTreeService;

	@PostMapping("/create")
	public ResponseEntity<DecisionTree> createDecisionTree(@Validated @RequestBody DecisionTree decisionTree) {
		return decisionTreeService.createDecisionTree(decisionTree);
	}
	
	@PostMapping("/update/{decisionTreeId}")
	public ResponseEntity<DecisionTree> updateDecisionTree(@PathVariable String decisionTreeId, @Validated @RequestBody DecisionTree decisionTree) {
		return decisionTreeService.updateDecisionTree(decisionTreeId, decisionTree);
	}
	
	@GetMapping("/get/{decisionTreeId}")
	public ResponseEntity<DecisionTree> getDecisionTree(@PathVariable String decisionTreeId) {
		return decisionTreeService.getDecisionTree(decisionTreeId);
	}
}
