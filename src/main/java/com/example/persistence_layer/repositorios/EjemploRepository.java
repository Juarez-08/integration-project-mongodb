package com.example.persistence_layer.repositorios;

import com.example.persistence_layer.modelos.Ejemplo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EjemploRepository extends MongoRepository<Ejemplo, String> {

}
