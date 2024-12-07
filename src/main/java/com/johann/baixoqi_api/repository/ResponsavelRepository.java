package com.johann.baixoqi_api.repository;


import com.johann.baixoqi_api.domain.Responsavel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsavelRepository extends MongoRepository<Responsavel, String> {

}
