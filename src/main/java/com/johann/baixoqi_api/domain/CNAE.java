package com.johann.baixoqi_api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@Document
@JsonIgnoreProperties(value = { "target", "source" })
public class CNAE implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String codigo;
    private String grauDeRisco;
    private Integer cargaDeIncendio;

    public CNAE(){

    }

    public CNAE(String codigo, String grauDeRisco, Integer cargaDeIncendio) {
        this.codigo = codigo;
        this.grauDeRisco = grauDeRisco;
        this.cargaDeIncendio = cargaDeIncendio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CNAE cnae = (CNAE) o;
        return Objects.equals(codigo, cnae.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}
