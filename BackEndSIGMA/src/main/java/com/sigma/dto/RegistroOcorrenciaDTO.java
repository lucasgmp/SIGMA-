package com.sigma.dto;

public record RegistroOcorrenciaDTO(
        String tipoOcorrencia,
        String placaVeiculo,
        String cpfCondutor,
        String descricao,
        String localizacao
) {
}
