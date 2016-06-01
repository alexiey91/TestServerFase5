package it.uniroma2.fase5.controller;

import org.springframework.http.ResponseEntity;

import it.uniroma2.fase5.model.rest.DTOresponse;

public interface ProblemService {

	ResponseEntity<DTOresponse> createProblem(String problemcause);
	ResponseEntity<DTOresponse> getProblems();
	ResponseEntity<DTOresponse> deleteProblem(String problemcause);
}
