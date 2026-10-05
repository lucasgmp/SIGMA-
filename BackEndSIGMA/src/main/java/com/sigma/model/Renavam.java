package com.sigma.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "renavam")
public class Renavam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,nullable = false)
    private String numRenavam;
    @Column(unique = true,nullable = false)
    private String placa;
    @Column(nullable = false)
    private String modelo;
    @Column(nullable = false)
    private String cor;
    @Column(nullable = false)
    private Boolean veiculoRoubado;
    @Column(nullable = false)
    private Boolean resttricao;
    @Column(nullable = false)
    private Boolean alerta;

    public String getNumRenavam() {
        return numRenavam;
    }
    public void setNumRenavam(String numRenavam) {
        this.numRenavam = numRenavam;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPlaca() {
        return placa;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    public void setVeiculoRoubado(Boolean veiculoRoubado) {
        this.veiculoRoubado = veiculoRoubado;
    }
    public Boolean getVeiculoRoubado() {
        return veiculoRoubado;
    }
    public void setResttricao(Boolean resttricao) {
        this.resttricao = resttricao;
    }
    public Boolean getResttricao() {
        return resttricao;
    }
    public void setAlerta(Boolean alerta) {
        this.alerta = alerta;
    }
    public Boolean getAlerta() {
        return alerta;
    }
}
