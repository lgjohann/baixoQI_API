package com.johann.baixoqi_api.domain;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {


    private String cnpj;
    private String razaoSocial;
    private List<CNAE> cnaeList = new ArrayList<>();
    private String grauDeRisco;
    private Integer cargaDeIncendio;
    private String logradouro;
    private String numero;
    private String bairro;
    private String complemento;
    private String cep;
    private String municipio;
    private String uf;

    public Empresa() {

    }

    public Empresa(String cnpj, String razaoSocial, List<CNAE> cnaeList, String grauDeRisco, Integer cargaDeIncendio, String logradouro, String numero, String bairro, String complemento, String cep, String municipio, String uf) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.cnaeList = cnaeList;
        this.grauDeRisco = grauDeRisco;
        this.cargaDeIncendio = cargaDeIncendio;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cep = cep;
        this.municipio = municipio;
        this.uf = uf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public List<CNAE> getCnaeList() {
        return cnaeList;
    }

    public String getGrauDeRisco() {
        return grauDeRisco;
    }

    public void setGrauDeRisco(String grauDeRisco) {
        this.grauDeRisco = grauDeRisco;
    }

    public Integer getCargaDeIncendio() {
        return cargaDeIncendio;
    }

    public void setCargaDeIncendio(Integer cargaDeIncendio) {
        this.cargaDeIncendio = cargaDeIncendio;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(cnpj, empresa.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cnpj);
    }
}
