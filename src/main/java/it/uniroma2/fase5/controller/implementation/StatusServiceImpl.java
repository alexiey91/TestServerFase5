package it.uniroma2.fase5.controller.implementation;

import it.uniroma2.fase5.controller.StatusService;
import it.uniroma2.fase5.model.Goal;
import it.uniroma2.fase5.model.MeasurementGoal;
import it.uniroma2.fase5.model.Status;
import it.uniroma2.fase5.model.Strategy;
import it.uniroma2.fase5.model.rest.DTOresponse;
import it.uniroma2.fase5.repositories.GoalRepository;
import it.uniroma2.fase5.repositories.StatusRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service("StatusService")
public class StatusServiceImpl implements StatusService{
@Autowired
StatusRepository statusRepository;

@Autowired
GoalRepository goalRepository;


	@Override
	public ResponseEntity<DTOresponse> createStatus(String statusId,
			String status, String creationDate, String lastModified,
			List<String> goalRef) {
		// TODO Auto-generated method stub
		List<Goal> temp= new ArrayList<Goal>();
		for( String s :goalRef ){
			if(goalRepository.findOne(s)!=null)
				temp.add(goalRepository.findOne(s));				
		}
		if (temp.size()==0){
			return new ResponseEntity<DTOresponse>(new DTOresponse(),HttpStatus.BAD_REQUEST);
		}
		
		
		Status stat= new Status(statusId,status,creationDate,lastModified,temp);
		statusRepository.save(stat);
				
		DTOresponse dtoresponse = new DTOresponse();		
		ResponseEntity<DTOresponse> response = new ResponseEntity<DTOresponse>(dtoresponse,HttpStatus.OK);
			
		return response;
		
		
		
	}

	@Override
	public ResponseEntity<DTOresponse> getStatus() {
		// TODO Auto-generated method stub
		List<Status> status = statusRepository.findAll();

		DTOresponse dtoresponse = new DTOresponse();
		dtoresponse.setStatus(status);

		ResponseEntity<DTOresponse> response = new ResponseEntity<DTOresponse>(
				dtoresponse, HttpStatus.OK);

		return response;
	}

	@Override
	public ResponseEntity<DTOresponse> deleteAllStatus() {
		// TODO Auto-generated method stub
			statusRepository.delete(statusRepository.findAll());
		
		return null;
	}

	@Override
	public ResponseEntity<DTOresponse> deleteStatus(String statusId) {
		// TODO Auto-generated method stub
		statusRepository.delete(statusRepository.findOne(statusId));
		return null;
	}

	
}
