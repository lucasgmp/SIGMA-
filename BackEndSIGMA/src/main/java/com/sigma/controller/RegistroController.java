package com.sigma.controller;

import com.sigma.dto.RegistroOcorrenciaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@RestController
@RequestMapping("/api/registros")
@CrossOrigin(origins = "*")
public class RegistroController {

    @PostMapping
    public ResponseEntity<?> cadastrarOcorrencia(@RequestBody RegistroOcorrenciaDTO dto) {
        String protocolo = "BO-SIGMA-" + System.currentTimeMillis();
        String dataRegistro = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        return ResponseEntity.ok(Map.of(
                "status", "SUCESSO",
                "protocolo", protocolo,
                "dataHora", dataRegistro,
                "mensagem", "Ocorrência registrada com sucesso na rede central do SIGMA."
        ));
    }
}