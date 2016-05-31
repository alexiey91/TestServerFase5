package it.uniroma2.fase5.controller;

import it.uniroma2.fase5.model.rest.DTOresponse;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface GoalService {

	ResponseEntity<DTOresponse> createGoal(String goalId, int version,
			String creationDate, String lastModified, String timeFrame,
			String object, int magnitude, String focus, String costraint,
			String organizationalScope, String description,
			List<String> measurementRef, List<String> strategyRef);

	ResponseEntity<DTOresponse> createGoal(String goalId, int version, String creationDate,
			String lastModified, String timeFrame, String object,
			int magnitude, String focus, String costraint,
			String organizationalScope, String description);

	ResponseEntity<DTOresponse> getGoals();

	public ResponseEntity<DTOresponse> deleteAllGoal();

	ResponseEntity<DTOresponse> deleteGoal(String goalId);
}
