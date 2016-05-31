package it.uniroma2.fase5.repositories;

import it.uniroma2.fase5.model.Status;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StatusRepository extends MongoRepository<Status, String> {

}
