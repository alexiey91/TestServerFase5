package it.uniroma2.fase5.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;

import it.uniroma2.fase5.model.Metric;

public interface MetricRepository extends MongoRepository<Metric, String> {
   

}
