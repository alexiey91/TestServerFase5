package it.uniroma2.fase5.controller;

import it.uniroma2.fase5.model.Goal;
import it.uniroma2.fase5.model.rest.DTOresponse;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface StrategyService {
	ResponseEntity<DTOresponse> createStrategy(String strategyId,
			List<String> context, List<String> assumptions, String description,
			String creationDate, String lastModified, String timeFrame,
			int version, List<Goal> goalRef);

	ResponseEntity<DTOresponse> getStrategies();

	ResponseEntity<DTOresponse> deleteStrategy(String strategyId);
}
