package it.uniroma2.fase5.repositories;

import it.uniroma2.fase5.model.Project;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String>{

}
