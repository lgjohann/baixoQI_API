package com.johann.baixoqi_api.services;

import com.johann.baixoqi_api.domain.Projeto;
import com.johann.baixoqi_api.domain.Responsavel;
import com.johann.baixoqi_api.domain.Responsavel;
import com.johann.baixoqi_api.dto.ResponsavelDTO;
import com.johann.baixoqi_api.repository.ResponsavelRepository;
import com.johann.baixoqi_api.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponsavelService {

    @Autowired
    private ResponsavelRepository repo;

    public List<Responsavel> findAll() {
        return repo.findAll();
    }

    public Responsavel findById(String id) {
        Optional<Responsavel> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public Responsavel insert(Responsavel obj) {
        return repo.insert(obj);
    }

    public Responsavel fromDTO(ResponsavelDTO objDto) {
        return new Responsavel(objDto.getId(), objDto.getNome(), objDto.getCpf(), objDto.getNumCREA(), objDto.getEmail());
    }
}
