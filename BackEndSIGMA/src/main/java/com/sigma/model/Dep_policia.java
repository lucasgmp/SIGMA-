package com.sigma.model;
import jakarta.persistence.*;
import lombok.Getter;


@Entity
@Table(name = "dep_policia")
public class Dep_policia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Column(nullable = false)
    private String nome;
    private String endereco;
    private String telefone;
    private String cidade;
    private String estado;



}
