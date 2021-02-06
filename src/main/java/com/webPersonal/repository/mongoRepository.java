package com.webPersonal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.webPersonal.dto.MongoDto;

@Repository
public interface mongoRepository extends MongoRepository<MongoDto, String>{

}
