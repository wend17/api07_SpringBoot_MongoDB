package com.example.api07_springboot_mongodb.repository;

import com.example.api07_springboot_mongodb.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends MongoRepository<Persona,String> {
}
