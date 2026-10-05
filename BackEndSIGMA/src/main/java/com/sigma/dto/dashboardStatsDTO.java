package com.sigma.dto;

public record dashboardStatsDTO(
        long totalVeiculosMonitorados,
        long alertasHoje,
        long consultasRenavam,
        long viaturasAtivas
) {
}
