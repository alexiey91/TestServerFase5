package it.uniroma2.fase5.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import it.uniroma2.fase5.model.rest.DTOresponse;

public interface MeasurementGoalService {


	ResponseEntity<DTOresponse> createMeasurementGoal(String measurementGoalId,String description, String creationDate, String lastModified, String timeFrame, List<String> metricsRef);
	ResponseEntity<DTOresponse> createMeasurementGoal(String measurementGoalId,String description, String creationDate, String lastModified, String timeFrame);
	ResponseEntity<DTOresponse> getMeasurementGoals();
	ResponseEntity<DTOresponse> deleteMeasurementGoal(String measurementGoalId);
}
