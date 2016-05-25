package it.uniroma2.fase5.controller;



import org.springframework.http.ResponseEntity;

import it.uniroma2.fase5.model.rest.DTOresponse;

public interface QuestionService {

	ResponseEntity<DTOresponse> createQuestion(String questionId,String description, String creationDate, String lastModified, String timeFrame);
	ResponseEntity<DTOresponse> getQuestions();
	ResponseEntity<DTOresponse> deleteQuestion(String questionId);
}
