package it.uniroma2.fase5.repositories;

import it.uniroma2.fase5.model.Strategy;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StrategyRepository extends MongoRepository<Strategy, String> {

}
