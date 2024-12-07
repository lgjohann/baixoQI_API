package com.johann.baixoqi_api.resources;

import com.johann.baixoqi_api.domain.Projeto;
import com.johann.baixoqi_api.dto.ProjetoDTO;
import com.johann.baixoqi_api.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
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

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody ProjetoDTO objDto) {
        Projeto obj = service.fromDTO(objDto);
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
