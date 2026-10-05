package com.sigma.dto;

public record VeiculoDTO(
        String placa,
        String renavam,
        String marcaModelo,
        String cor,
        Integer ano,
        String proprietario,
        String status // "REGULAR", "ROUBO/FURTO", "SUSPEITO"
) {}
