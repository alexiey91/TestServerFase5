package it.uniroma2.fase5.repositories;

import it.uniroma2.fase5.model.Goal;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoalRepository extends MongoRepository<Goal, String> {

}
