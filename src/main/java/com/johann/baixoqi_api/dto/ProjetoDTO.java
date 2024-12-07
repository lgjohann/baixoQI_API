package com.johann.baixoqi_api.dto;

import com.johann.baixoqi_api.domain.Projeto;
import com.johann.baixoqi_api.domain.Responsavel;

public class ProjetoDTO {

    private String id;
    private String nome;
    private Responsavel responsavel;

    public ProjetoDTO(){

    }

    public ProjetoDTO(Projeto obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.responsavel = obj.getResponsavel();
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

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
}
