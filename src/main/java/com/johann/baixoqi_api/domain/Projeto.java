package com.johann.baixoqi_api.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@Document
public class Projeto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String nome;
    private String cnpj; // isso aqui vai ser o ID_empresa?
    private String edificacao; // aqui a id_edificacao
    private String responsavel; // id_responsavel
//  private List<medidasProtecao> = new ArrayListM<>();

    public Projeto() {

    }

    public Projeto(String id, String nome, String cnpj, String edificacao, String responsavel) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.edificacao = edificacao;
        this.responsavel = responsavel;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEdificacao() {
        return edificacao;
    }

    public void setEdificacao(String edificacao) {
        this.edificacao = edificacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
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
