package com.sigma.dto;

public record monitoriamentoFeedDTO(
        Long id,
        String placa,
        String cameraLocal,
        String dataHora,
        String statusAlerta
) {
}
