package it.uniroma2.fase5.controller.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import it.uniroma2.fase5.controller.MeasurementGoalService;
import it.uniroma2.fase5.model.MeasurementGoal;
import it.uniroma2.fase5.model.Metric;
import it.uniroma2.fase5.model.Question;
import it.uniroma2.fase5.model.rest.DTOresponse;
import it.uniroma2.fase5.repositories.MeasurementGoalRepository;
import it.uniroma2.fase5.repositories.MetricRepository;
import it.uniroma2.fase5.repositories.QuestionRepository;

@Service("MeasurementGoalService")
public class MeasurementGoalServiceImpl implements MeasurementGoalService {

	@Autowired
	QuestionRepository questionRepository;
	@Autowired
	MetricRepository metricRepository;
	@Autowired
	MeasurementGoalRepository measurementGoalRepository;
	
	@Override
	public ResponseEntity<DTOresponse> createMeasurementGoal(String measurementGoalId,String description, String creationDate, String lastModified, String timeFrame, String interpretationModel) {
		
		MeasurementGoal measurementGoal= new MeasurementGoal(measurementGoalId, description, creationDate, lastModified, timeFrame, interpretationModel);
		measurementGoalRepository.save(measurementGoal);
				
		DTOresponse dtoresponse = new DTOresponse();		
		ResponseEntity<DTOresponse> response = new ResponseEntity<DTOresponse>(dtoresponse,HttpStatus.OK);
			
		return response;
	}
	@Override
	public ResponseEntity<DTOresponse> createMeasurementGoal(String measurementGoalId,String description, String creationDate, String lastModified, String timeFrame, String interpretationModel, List<String> questionsRef,List<String> metricsRef) {
		
		List<Question> temp= new ArrayList<Question>();
		List<Metric> temp2= new ArrayList<Metric>();
		for( String s : questionsRef ){
			if(questionRepository.findOne(s)!=null)
				temp.add(questionRepository.findOne(s));				
		}
		if (temp.size()==0){
			return new ResponseEntity<DTOresponse>(new DTOresponse(),HttpStatus.BAD_REQUEST);
		}
		
		for( String s : metricsRef ){
			if(metricRepository.findOne(s)!=null)
				temp2.add(metricRepository.findOne(s));				
		}
		if (temp2.size()==0){
			return new ResponseEntity<DTOresponse>(new DTOresponse(),HttpStatus.BAD_REQUEST);
		}		
		MeasurementGoal measurementGoal= new MeasurementGoal(measurementGoalId, description, creationDate, lastModified, timeFrame,interpretationModel,temp,temp2);
		measurementGoalRepository.save(measurementGoal);
				
		DTOresponse dtoresponse = new DTOresponse();		
		ResponseEntity<DTOresponse> response = new ResponseEntity<DTOresponse>(dtoresponse,HttpStatus.OK);
			
		return response;
	}

	@Override
	public ResponseEntity<DTOresponse> deleteMeasurementGoal(String measurementGoalId) {
	
		
		measurementGoalRepository.delete(measurementGoalRepository.findOne(measurementGoalId));
		
		return null;
	}
	@Override
	public ResponseEntity<DTOresponse> deleteAllMeasurementGoal() {
	
		
		measurementGoalRepository.delete(measurementGoalRepository.findAll());
		
		return null;
	}
	
	@Override
	public ResponseEntity<DTOresponse> getMeasurementGoals() {
		
		List<MeasurementGoal> measurementGoals = measurementGoalRepository.findAll();
		
		DTOresponse dtoresponse = new DTOresponse();
		dtoresponse.setMeasurementGoals(measurementGoals);
		
		ResponseEntity<DTOresponse> response = new ResponseEntity<DTOresponse>(dtoresponse,HttpStatus.OK);	
	
		return response;
		
	}
}
