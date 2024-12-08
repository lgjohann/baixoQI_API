package com.johann.baixoqi_api.repository;


import com.johann.baixoqi_api.domain.Edificacao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificacaoRepository extends MongoRepository<Edificacao, String> {

}
