package com.johann.baixoqi_api.resources;

import com.johann.baixoqi_api.domain.Projeto;
import com.johann.baixoqi_api.dto.ProjetoDTO;
import com.johann.baixoqi_api.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/projetos")
public class ProjetoResource {

    @Autowired
    private ProjetoService service;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ProjetoDTO>>  findAll() {
        List<Projeto> lista = service.findAll();
        List<ProjetoDTO> listaDTO = lista.stream().map(x -> new ProjetoDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listaDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<ProjetoDTO> findById(@PathVariable String id) {
        Projeto obj = service.findById(id);
        ProjetoDTO projetoDto = new ProjetoDTO(obj);
        return ResponseEntity.ok().body(projetoDto);
    }

}
