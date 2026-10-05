package com.sigma.controller;

import com.sigma.dto.dashboardStatsDTO;
import com.sigma.dto.monitoriamentoFeedDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin(origins = "*")
public class DashboardController {

    @GetMapping("/stats")
    public ResponseEntity<dashboardStatsDTO> obterEstatisticas() {
        // Dados simulados para os cartões de métricas do sistema
        dashboardStatsDTO stats = new dashboardStatsDTO(
                14250L, // Total de veículos monitorados
                38L,    // Alertas registrados hoje
                184L,   // Consultas RENAVAM/RENACH realizadas
                12L     // Viaturas ativas em patrulhamento
        );
        return ResponseEntity.ok(stats);
    }

    @GetMapping("/ultimos-alertas")
    public ResponseEntity<List<monitoriamentoFeedDTO>> obterUltimosAlertas() {
        String agora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        List<monitoriamentoFeedDTO> alertas = List.of(
                new monitoriamentoFeedDTO(101L, "XYZ-9876", "Av. Central - Câmera 04", agora, "ROUBO/FURTO"),
                new monitoriamentoFeedDTO(102L, "KGB-4412", "Ponte JK - Câmera 08", agora, "SUSPEITO"),
                new monitoriamentoFeedDTO(103L, "ABC-1D23", "Pórtico Sul - Câmera 01", agora, "REGULAR")
        );

        return ResponseEntity.ok(alertas);
    }
}