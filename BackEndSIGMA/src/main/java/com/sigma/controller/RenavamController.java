package com.sigma.controller;

import com.sigma.dto.monitoriamentoFeedDTO;
import com.sigma.dto.VeiculoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class RenavamController {

    private static final List<String> CAMERAS = List.of(
            "Câmera 01 - Pórtico Sul (KM 12)",
            "Câmera 04 - Av. Central / Cruzamento 3",
            "Câmera 08 - Ponte Juscelino Kubitschek",
            "Câmera 12 - Viaduto das Nações"
    );

    private static final List<String[]> VEICULOS_MOCK = List.of(
            new String[]{"XYZ-9876", "ROUBO/FURTO"},
            new String[]{"ABC-1D23", "REGULAR"},
            new String[]{"KGB-4412", "SUSPEITO"},
            new String[]{"BRA-2E19", "REGULAR"},
            new String[]{"CLO-9090", "CLONAGEM SUSPEITA"}
    );

    // Consulta direta de placa (RENAVAM)
    @GetMapping("/renavam/{placa}")
    public ResponseEntity<?> consultarPorPlaca(@PathVariable String placa) {
        String placaLimpa = placa.toUpperCase().replace("-", "").trim();

        if ("XYZ9876".equals(placaLimpa)) {
            return ResponseEntity.ok(new VeiculoDTO("XYZ-9876", "98765432100", "Honda Civic 2.0", "Prata", 2020, "Mariana Souza", "ROUBO/FURTO"));
        } else if ("ABC1D23".equals(placaLimpa) || "ABC1234".equals(placaLimpa)) {
            return ResponseEntity.ok(new VeiculoDTO("ABC-1D23", "12345678901", "Toyota Corolla 2.0", "Preto", 2022, "Carlos Eduardo", "REGULAR"));
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("message", "Veículo com placa " + placa + " não localizado na base do RENAVAM."));
    }

    // Feed dinâmico de câmeras
    @GetMapping("/monitoramento/feed-tempo-real")
    public ResponseEntity<List<monitoriamentoFeedDTO>> obterFeedTempoReal() {
        Random rand = new Random();
        String horaAtual = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        List<monitoriamentoFeedDTO> feed = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String[] veiculo = VEICULOS_MOCK.get(rand.nextInt(VEICULOS_MOCK.size()));
            String camera = CAMERAS.get(rand.nextInt(CAMERAS.size()));
            feed.add(new monitoriamentoFeedDTO((long) (i + 1), veiculo[0], camera, horaAtual, veiculo[1]));
        }

        return ResponseEntity.ok(feed);
    }
}