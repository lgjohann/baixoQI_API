package com.johann.baixoqi_api.dto;

import com.johann.baixoqi_api.domain.Edificacao;
import com.johann.baixoqi_api.domain.Empresa;
import com.johann.baixoqi_api.domain.Projeto;
import com.johann.baixoqi_api.domain.Responsavel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ResponsavelDTO {

    private String id;
    private String nome;
    private String cpf;
    private String numCREA;
    private String email;


    private List<ProjetoDTO> projetos = new ArrayList<>();

    public ResponsavelDTO(){

    }

    public ResponsavelDTO(Responsavel obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.cpf = obj.getCpf();
        this.numCREA = obj.getNumCREA();
        this.email = obj.getEmail();

        obj.getProjetos().stream().map(projeto -> this.getProjetos().add(new ProjetoDTO(projeto))).collect(Collectors.toList());
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
}
