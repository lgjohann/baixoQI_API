package com.johann.baixoqi_api.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@Document
public class  Projeto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String nome;

    @DBRef(lazy = true)
    private Responsavel responsavel;

    private Empresa empresa;

    private Edificacao edificacao;

    public Projeto() {

    }

    public Projeto(String id, String nome, Responsavel responsavel, Empresa empresa, Edificacao edificacao) {
        this.id = id;
        this.nome = nome;
        this.responsavel = responsavel;
        this.empresa = empresa;
        this.edificacao = edificacao;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Projeto projeto = (Projeto) o;
        return Objects.equals(id, projeto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
