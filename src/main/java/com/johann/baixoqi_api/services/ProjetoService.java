package com.johann.baixoqi_api.services;

import com.johann.baixoqi_api.domain.Projeto;
import com.johann.baixoqi_api.dto.ProjetoDTO;
import com.johann.baixoqi_api.repository.ProjetoRepository;
import com.johann.baixoqi_api.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository repo;

    public List<Projeto> findAll() {
        return repo.findAll();
    }

    public Projeto findById(String id) {
        Optional<Projeto> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public Projeto insert(Projeto obj) {
        return repo.insert(obj);
    }

    public Projeto fromDTO(ProjetoDTO objDto) {
        return new Projeto(objDto.getId(), objDto.getNome());
    }
}
