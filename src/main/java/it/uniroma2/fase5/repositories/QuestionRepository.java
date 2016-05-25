package it.uniroma2.fase5.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;

import it.uniroma2.fase5.model.Question;

public interface QuestionRepository extends MongoRepository<Question, String> {
   

}
