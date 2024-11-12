package com.johann.baixoqi_api.repository;


import com.johann.baixoqi_api.domain.Projeto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends MongoRepository<Projeto, String> {

}
