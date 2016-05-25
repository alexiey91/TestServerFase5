package it.uniroma2.fase5.controller.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import it.uniroma2.fase5.controller.ProblemService;
import it.uniroma2.fase5.model.Problem;
import it.uniroma2.fase5.model.rest.DTOresponse;
import it.uniroma2.fase5.repositories.ProblemRepository;

@Service("ProblemService")
public class ProblemServiceImpl implements ProblemService {

	@Autowired
	ProblemRepository problemRepository;
	
	@Override
	public ResponseEntity<DTOresponse> createProblem(String problemcause) {
	
		
		Problem problem = new Problem(problemcause);
		
		problemRepository.save(problem);
				
		DTOresponse dtoresponse = new DTOresponse();
		dtoresponse.setProblemid(problem.getId());
		
		ResponseEntity<DTOresponse> response = new ResponseEntity<DTOresponse>(dtoresponse,HttpStatus.OK);
		
		
		return response;
	}

	
	@Override
	public ResponseEntity<DTOresponse> deleteProblem(String problemcause) {
	
		
		
		List<Problem> problems = problemRepository.findAll();
		for(Problem p:problems)
			if (p.getCause().equals(problemcause))
				problemRepository.delete(p.getId());
		
				
		
		
		
		return null;
	}
	
	@Override
	public ResponseEntity<DTOresponse> getProblems() {
		
		List<Problem> problems = problemRepository.findAll();
		
		DTOresponse dtoresponse = new DTOresponse();
		dtoresponse.setProblems(problems);
		
		ResponseEntity<DTOresponse> response = new ResponseEntity<DTOresponse>(dtoresponse,HttpStatus.OK);	
		
		return response;
		
	}



}
