package com.johann.baixoqi_api.domain;

import com.johann.baixoqi_api.domain.enums.DepCombEnum;
import com.johann.baixoqi_api.domain.enums.RiscoEspecifico;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Document
public class Edificacao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private Integer anoConstrucao;
    private Double areaConstruida;
    private Double areaProtegida;
    private Double alturaDescente;
    private Double alturaAscendente;
    private boolean existePorao;
    private Double areaPorao;
    private Double areaMaiorPavimento;
    private String reponsavelPeloUso;
    private String propietario;
    private Integer populacao;
    private Integer populacaoPavimentoMaiorPopulacao;
    private DepCombEnum depositoDescobertoCombustivel;
    private List<RiscoEspecifico> riscoEspecificos;
    private boolean existeVentilacao;

    public Edificacao() {}

    public Edificacao(String id, Integer anoConstrucao, Double areaConstruida, Double areaProtegida, Double alturaDescente, Double alturaAscendente, boolean existePorao, Double areaPorao, Double areaMaiorPavimento, String reponsavelPeloUso, String propietario, Integer populacao, Integer populacaoPavimentoMaiorPopulacao, DepCombEnum depositoDescobertoCombustivel, List<RiscoEspecifico> riscoEspecificos, boolean existeVentilacao) {
        this.id = id;
        this.anoConstrucao = anoConstrucao;
        this.areaConstruida = areaConstruida;
        this.areaProtegida = areaProtegida;
        this.alturaDescente = alturaDescente;
        this.alturaAscendente = alturaAscendente;
        this.existePorao = existePorao;
        this.areaPorao = areaPorao;
        this.areaMaiorPavimento = areaMaiorPavimento;
        this.reponsavelPeloUso = reponsavelPeloUso;
        this.propietario = propietario;
        this.populacao = populacao;
        this.populacaoPavimentoMaiorPopulacao = populacaoPavimentoMaiorPopulacao;
        this.depositoDescobertoCombustivel = depositoDescobertoCombustivel;
        this.riscoEspecificos = riscoEspecificos;
        this.existeVentilacao = existeVentilacao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAnoConstrucao() {
        return anoConstrucao;
    }

    public void setAnoConstrucao(Integer anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }

    public Double getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(Double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public Double getAreaProtegida() {
        return areaProtegida;
    }

    public void setAreaProtegida(Double areaProtegida) {
        this.areaProtegida = areaProtegida;
    }

    public Double getAlturaDescente() {
        return alturaDescente;
    }

    public void setAlturaDescente(Double alturaDescente) {
        this.alturaDescente = alturaDescente;
    }

    public Double getAlturaAscendente() {
        return alturaAscendente;
    }

    public void setAlturaAscendente(Double alturaAscendente) {
        this.alturaAscendente = alturaAscendente;
    }

    public boolean isExistePorao() {
        return existePorao;
    }

    public void setExistePorao(boolean existePorao) {
        this.existePorao = existePorao;
    }

    public Double getAreaPorao() {
        return areaPorao;
    }

    public void setAreaPorao(Double areaPorao) {
        this.areaPorao = areaPorao;
    }

    public Double getAreaMaiorPavimento() {
        return areaMaiorPavimento;
    }

    public void setAreaMaiorPavimento(Double areaMaiorPavimento) {
        this.areaMaiorPavimento = areaMaiorPavimento;
    }

    public String getReponsavelPeloUso() {
        return reponsavelPeloUso;
    }

    public void setReponsavelPeloUso(String reponsavelPeloUso) {
        this.reponsavelPeloUso = reponsavelPeloUso;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    public Integer getPopulacaoPavimentoMaiorPopulacao() {
        return populacaoPavimentoMaiorPopulacao;
    }

    public void setPopulacaoPavimentoMaiorPopulacao(Integer populacaoPavimentoMaiorPopulacao) {
        this.populacaoPavimentoMaiorPopulacao = populacaoPavimentoMaiorPopulacao;
    }

    public DepCombEnum getDepositoDescobertoCombustivel() {
        return depositoDescobertoCombustivel;
    }

    public void setDepositoDescobertoCombustivel(DepCombEnum depositoDescobertoCombustivel) {
        this.depositoDescobertoCombustivel = depositoDescobertoCombustivel;
    }

    public List<RiscoEspecifico> getRiscoEspecificos() {
        return riscoEspecificos;
    }


    public boolean isExisteVentilacao() {
        return existeVentilacao;
    }

    public void setExisteVentilacao(boolean existeVentilacao) {
        this.existeVentilacao = existeVentilacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edificacao that = (Edificacao) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
