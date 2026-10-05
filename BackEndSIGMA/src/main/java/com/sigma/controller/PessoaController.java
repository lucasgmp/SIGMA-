package com.sigma.controller;
import com.sigma.model.Pessoa;
import com.sigma.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pessoas")
public class PessoaController {
    private PessoaService pessoaService;
    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }
    @PostMapping
    public Pessoa save(@RequestBody Pessoa pessoa)
    {
        return pessoaService.save(pessoa);
    }
    @GetMapping
    public List<Pessoa> findAll()
    {
        return pessoaService.findAll();
    }
}
