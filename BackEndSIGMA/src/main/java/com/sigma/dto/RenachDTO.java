package com.sigma.dto;

public record RenachDTO(
        String cpf,
        String renach,
        String nomeCondutor,
        String categoriaCnh,
        Integer pontosCarteira,
        String validadeCnh,
        String statusHabilitacao, // "REGULAR", "SUSPENSA", "CASSAÇÃO"
        String observacoes // Ex: "Exercício de Atividade Remunerada (EAR)"
) {
}
