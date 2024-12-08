package com.johann.baixoqi_api.repository;


import com.johann.baixoqi_api.domain.CNAE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CNAERepository extends MongoRepository<CNAE, String> {

}
