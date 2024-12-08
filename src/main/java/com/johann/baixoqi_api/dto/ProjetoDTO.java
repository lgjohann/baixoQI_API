package com.johann.baixoqi_api.dto;

import com.johann.baixoqi_api.domain.Edificacao;
import com.johann.baixoqi_api.domain.Empresa;
import com.johann.baixoqi_api.domain.Projeto;
import com.johann.baixoqi_api.domain.Responsavel;

public class ProjetoDTO {

    private String id;
    private String nome;
    private Responsavel responsavel;
    private Empresa empresa;
    private Edificacao edificacao;

    public ProjetoDTO(){

    }

    public ProjetoDTO(Projeto obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.responsavel = obj.getResponsavel();
        this.empresa = obj.getEmpresa();
        this.edificacao = obj.getEdificacao();
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Edificacao getEdificacao() {
        return edificacao;
    }

    public void setEdificacao(Edificacao edificacao) {
        this.edificacao = edificacao;
    }
}
