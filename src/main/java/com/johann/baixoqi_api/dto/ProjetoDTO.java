package com.johann.baixoqi_api.dto;

import com.johann.baixoqi_api.domain.Projeto;

public class ProjetoDTO {

    private String id;
    private String nome;

    public ProjetoDTO(){

    }

    public ProjetoDTO(Projeto obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
