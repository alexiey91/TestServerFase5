package it.uniroma2.fase5.controller;

import org.springframework.http.ResponseEntity;

import it.uniroma2.fase5.model.rest.DTOresponse;

public interface StudentService {

	ResponseEntity<DTOresponse> createStudent(String name, String surname, String problemcause);
	ResponseEntity<DTOresponse> getStudents();
	ResponseEntity<DTOresponse> getStudentsByName(String name);
	ResponseEntity<DTOresponse> updateStudent(String id,String name, String surname, String problemcause);	
}
