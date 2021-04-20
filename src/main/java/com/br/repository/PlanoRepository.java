package com.br.repository;

import com.br.model.Plano;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanoRepository extends MongoRepository<Plano, String> {
}
