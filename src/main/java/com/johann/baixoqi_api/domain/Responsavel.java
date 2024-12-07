package com.johann.baixoqi_api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.johann.baixoqi_api.dto.ProjetoDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Document
@JsonIgnoreProperties(value = { "target", "source" })
public class Responsavel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String nome;
    private String cpf;
    private String numCREA;
    private String email;

    private List<ProjetoDTO> projetos = new ArrayList<>();

    public Responsavel(){}

    public Responsavel(String id, String nome, String cpf, String numCREA, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.numCREA = numCREA;
        this.email = email;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumCREA() {
        return numCREA;
    }

    public void setNumCREA(String numCREA) {
        this.numCREA = numCREA;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ProjetoDTO> getProjetos() {
        return projetos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Responsavel that = (Responsavel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
