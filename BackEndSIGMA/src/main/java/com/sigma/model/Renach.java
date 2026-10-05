package com.sigma.model;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
@Entity
@Table(name = "renach")
public class Renach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Column(unique = true,nullable = false)
    private String numRenach;
    private String categoriaCNH;
    private LocalDate DataEmissao;
    private LocalDate Validade;
    private String situacao;
    private Integer pontuacao;
    private Boolean habilitado;
    private Boolean procurado;

    public String getNumRenach() {
        return numRenach;
    }
    public void setNumRenach(String numRenach) {
        this.numRenach = numRenach;
    }
    public String getCategoriaCNH() {
        return categoriaCNH;
    }
    public void setCategoriaCNH(String categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }
    public LocalDate getDataEmissao() {
        return DataEmissao;
    }
    public void setDataEmissao(LocalDate dataEmissao) {
        DataEmissao = dataEmissao;
    }
    public void setValidade(LocalDate validade){
        this.Validade = validade;
    }
    public LocalDate getValidade(){
        return this.Validade;
    }
    public void setSituacao(String situacao){
        this.situacao = situacao;
    }
    public String getSituacao(){
        return this.situacao;
    }
    public void setPontuacao(Integer pontuacao){
        this.pontuacao = pontuacao;
    }
    public Integer getPontuacao(){
        return this.pontuacao;
    }
    public void setHabilitado(Boolean habilitado){
        this.habilitado = habilitado;
    }
    public Boolean getHabilitado(){
        return this.habilitado;
    }
    public void setProcurado(Boolean procurado){
        this.procurado = procurado;
    }
    public Boolean getProcurado(){
        return this.procurado;
    }


}
