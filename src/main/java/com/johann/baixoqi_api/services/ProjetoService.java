package com.johann.baixoqi_api.services;

import com.johann.baixoqi_api.domain.Projeto;
import com.johann.baixoqi_api.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository repo;

    public List<Projeto> findAll() {
        return repo.findAll();
    }
}
