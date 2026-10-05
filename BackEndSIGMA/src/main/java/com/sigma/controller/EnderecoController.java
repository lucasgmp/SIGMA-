package com.sigma.controller;
import com.sigma.model.Endereco;
import com.sigma.service.EnderecoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("endereco")
public class EnderecoController {
    private EnderecoService enderecoService;
    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @PostMapping
    public Endereco salvar(@RequestBody Endereco endereco){
        return enderecoService.save(endereco);
    }
    @GetMapping
    public List<Endereco> getEnderecos() {
        return enderecoService.findAll();
    }


}
