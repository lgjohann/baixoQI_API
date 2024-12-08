package com.johann.baixoqi_api.resources;

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

@RestController
@RequestMapping(value = "/responsaveis")
public class ResponsavelResource {

    @Autowired
    private ResponsavelService service;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ResponsavelDTO>>  findAll() {
        List<Responsavel> lista = service.findAll();
        List<ResponsavelDTO> listaDTO = lista.stream().map(x -> new ResponsavelDTO(x)).collect(Collectors.toList());

//        for (ResponsavelDTO responsavelDTO : listaDTO) {
//            for (Responsavel responsavel : lista) {
//                obj.getProjetos().stream().map(projeto -> responsavelDto.getProjetos().add(new ProjetoDTO(projeto))).collect(Collectors.toList());
//            }
//        }

        return ResponseEntity.ok().body(listaDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<ResponsavelDTO> findById(@PathVariable String id) {
        Responsavel obj = service.findById(id);
        ResponsavelDTO responsavelDto = new ResponsavelDTO(obj);
        obj.getProjetos().stream().map(projeto -> responsavelDto.getProjetos().add(new ProjetoDTO(projeto))).collect(Collectors.toList());
        return ResponseEntity.ok().body(responsavelDto);
    }

}
