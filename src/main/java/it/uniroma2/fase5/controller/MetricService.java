package it.uniroma2.fase5.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import it.uniroma2.fase5.model.rest.DTOresponse;

public interface MetricService {
	
	ResponseEntity<DTOresponse> createMetric(String metricId,String description, String count, List<String> metricUnits, String scaleType, String limH, String limL, String creationDate, int version );
	ResponseEntity<DTOresponse> getMetrics();
	ResponseEntity<DTOresponse> deleteMetric(String metricId);
}
