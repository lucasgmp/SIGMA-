package com.sigma.controller;

import com.sigma.dto.RenachDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/renach")
@CrossOrigin(origins = "*")
public class RenachController {

    @GetMapping("/{documento}")
    public ResponseEntity<?> consultarRenach(@PathVariable String documento) {
        String doc = documento.replaceAll("[^0-9]", "");

        if ("12345678900".equals(doc) || "00112233445".equals(doc)) {
            return ResponseEntity.ok(new RenachDTO(
                    "123.456.789-00",
                    "RN987654321",
                    "Agente Roberto Mendes",
                    "AB",
                    0,
                    "10/11/2028",
                    "REGULAR",
                    "Sem restrições. Atividade Remunerada (EAR)."
            ));
        } else if ("99988877700".equals(doc)) {
            return ResponseEntity.ok(new RenachDTO(
                    "999.888.777-00",
                    "RN112233445",
                    "Marcos Antonio de Oliveira",
                    "B",
                    24,
                    "01/03/2025",
                    "SUSPENSA",
                    "Processo de suspensão por excesso de pontuação instaurado."
            ));
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("message", "Registro RENACH / CPF não localizado no banco de dados."));
    }
}