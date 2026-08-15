package com.mongo.demo.repository;

import com.mongo.demo.model.Job;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobJD extends MongoRepository<Job,String> {
}
