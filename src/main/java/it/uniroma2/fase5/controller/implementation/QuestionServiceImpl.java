package it.uniroma2.fase5.controller.implementation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import it.uniroma2.fase5.controller.QuestionService;
import it.uniroma2.fase5.model.Question;
import it.uniroma2.fase5.model.rest.DTOresponse;
import it.uniroma2.fase5.repositories.QuestionRepository;

@Service("QuestionService")
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionRepository questionRepository;
	
	@Override
	public ResponseEntity<DTOresponse> createQuestion(String questionId,String description, String creationDate, String lastModified, String timeFrame, int version, String focus) {
		
		Question question= new Question(questionId, description, creationDate, lastModified, timeFrame, version, focus);
		questionRepository.save(question);
				
		DTOresponse dtoresponse = new DTOresponse();		
		ResponseEntity<DTOresponse> response = new ResponseEntity<DTOresponse>(dtoresponse,HttpStatus.OK);
			
		return response;
	}

	@Override
	public ResponseEntity<DTOresponse> deleteQuestion(String questionId) {
	
		
		questionRepository.delete(questionRepository.findOne(questionId));
		/*List<Problem> problems = problemRepository.findAll();
		for(Problem p:problems)
			if (p.getCause().equals(problemcause))
				problemRepository.delete(p.getId());
		*/		
		return null;
	}
	
	@Override
	public ResponseEntity<DTOresponse> getQuestions() {
		
		List<Question> questions = questionRepository.findAll();
		
		DTOresponse dtoresponse = new DTOresponse();
		dtoresponse.setQuestions(questions);
		
		ResponseEntity<DTOresponse> response = new ResponseEntity<DTOresponse>(dtoresponse,HttpStatus.OK);	
	
		return response;
		
	}
}
