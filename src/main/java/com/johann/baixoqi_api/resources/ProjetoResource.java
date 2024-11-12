package com.johann.baixoqi_api.resources;

import com.johann.baixoqi_api.domain.Projeto;
import com.johann.baixoqi_api.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping(value = "/projetos")
public class ProjetoResource {

    @Autowired
    private ProjetoService service;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Projeto>>  findAll() {
        List<Projeto> lista = service.findAll();
        return ResponseEntity.ok().body(lista);
    }


}
