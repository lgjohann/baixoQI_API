package com.johann.baixoqi_api.resources;

import com.johann.baixoqi_api.domain.Projeto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/projetos")
public class ProjetoResource {


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Projeto>>  findAll() {
        Projeto projeto = new Projeto("1", "projetao boi tatá", "04555316000109", "edificacao", "luis pastorio");
        Projeto projeto1 = new Projeto("2", "projeto curupira", "04555316000109", "edificacao2", "luis pastorio");
        List<Projeto> lista = new ArrayList<Projeto>();
        lista.addAll(Arrays.asList(projeto, projeto1));
        return ResponseEntity.ok().body(lista);
    };


}
