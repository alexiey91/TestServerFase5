package it.uniroma2.fase5.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;

import it.uniroma2.fase5.model.MeasurementGoal;

public interface MeasurementGoalRepository extends MongoRepository<MeasurementGoal, String> {
   

}
