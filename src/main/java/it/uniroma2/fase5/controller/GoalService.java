package it.uniroma2.fase5.controller;


import it.uniroma2.fase5.model.MeasurementGoal;
import it.uniroma2.fase5.model.Strategy;
import it.uniroma2.fase5.model.rest.DTOresponse;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface GoalService {
	
	ResponseEntity<DTOresponse> createGoal(String goalId,int version,String creationDate, String lastModifed, String timeframe, String description, List<String> context,List<String> assumption, List<String> measurementRef,List<String> strategyRef);
	ResponseEntity<DTOresponse> createGoal(String goalId,int version,String creationDate, String lastModifed, String timeframe, String description, List<String> context,List<String> assumption);
	ResponseEntity<DTOresponse> getGoals();
	public ResponseEntity<DTOresponse> deleteAllGoal();
	ResponseEntity<DTOresponse> deleteGoal(String goalId);
}
