package com.sigma.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "pessoa")



public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    @OneToOne
    @JoinColumn(name = "renach_id")
    private Renach renach;
    @OneToMany
    @JoinColumn(name = "pessoa_id")
    private List<Renavam> veiculos;


    @Setter
    @Getter
    @Column(nullable = false)
    private String nome;
    @Column(unique = true, nullable = false)
    private String cpf;

    private String telefone;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


}
