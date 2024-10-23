package com.mongodbicfesgabo.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodbicfesgabo.app.entity.Coordinador;

public interface CoordinadorRepository extends MongoRepository<Coordinador, String> {

}
