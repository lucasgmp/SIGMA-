package com.sigma.controller;
import com.sigma.model.Policial;
import com.sigma.service.PolicialService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/policias")

public class PolicialController {
    private PolicialService service;

    public PolicialController(PolicialService service) {
        this.service = service;
    }

    @PostMapping
    public Policial save(@RequestBody Policial policial) {
        return service.save(policial);
    }
    @GetMapping
    public List<Policial> findAll() {
        return service.findAll();
    }
}
