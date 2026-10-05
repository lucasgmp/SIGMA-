package com.sigma.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/ia")
@CrossOrigin(origins = "*")
public class IAanaliseController {

    @PostMapping("/analisar-padrao")
    public ResponseEntity<?> analisarMovimentacao(@RequestBody Map<String, String> request) {
        String placa = request.getOrDefault("placa", "N/A");

        // Regra heurística simulando o motor de IA
        if (placa.toUpperCase().contains("CLO") || placa.toUpperCase().contains("XYZ")) {
            return ResponseEntity.ok(Map.of(
                    "placa", placa,
                    "nivelRisco", "CRÍTICO",
                    "probabilidadeClonagem", "94.8%",
                    "diagnosticoIA", "Anomalia detectada: O veículo cruzou a Câmera 01 (Goiânia) e a Câmera 04 (Brasília) em um intervalo de 12 minutos. Velocidade estimada incompatível (1.100 km/h). Alta suspeita de dublê/clonagem.",
                    "acaoRecomendada", "Acionar patrulha de interceptação no raio da Câmera 04 imediatamente."
            ));
        }

        return ResponseEntity.ok(Map.of(
                "placa", placa,
                "nivelRisco", "BAIXO",
                "probabilidadeClonagem", "1.2%",
                "diagnosticoIA", "Padrão de deslocamento compatível com o histórico do condutor. Nenhuma anomalia espacial detetada.",
                "acaoRecomendada", "Manter monitoramento passivo."
        ));
    }
}