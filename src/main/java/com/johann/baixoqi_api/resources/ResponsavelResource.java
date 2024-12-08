package com.johann.baixoqi_api.resources;

import com.johann.baixoqi_api.domain.Projeto;
import com.johann.baixoqi_api.domain.Responsavel;
import com.johann.baixoqi_api.dto.ProjetoDTO;
import com.johann.baixoqi_api.dto.ResponsavelDTO;
import com.johann.baixoqi_api.services.ResponsavelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "${cross.origin}")
@RestController
@RequestMapping(value = "/responsaveis")
public class ResponsavelResource {

    @Autowired
    private ResponsavelService service;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ResponsavelDTO>>  findAll() {
        List<Responsavel> lista = service.findAll();
        List<ResponsavelDTO> listaDTO = lista.stream().map(x -> new ResponsavelDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listaDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<ResponsavelDTO> findById(@PathVariable String id) {
        Responsavel obj = service.findById(id);
        ResponsavelDTO responsavelDto = new ResponsavelDTO(obj);
        return ResponseEntity.ok().body(responsavelDto);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody ResponsavelDTO objDto) {
        Responsavel obj = service.fromDTO(objDto);
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

}
