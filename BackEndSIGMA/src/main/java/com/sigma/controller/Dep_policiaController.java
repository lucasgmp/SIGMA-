package com.sigma.controller;
import com.sigma.model.Dep_policia;
import com.sigma.service.Dep_policiaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("departamentos")
public class Dep_policiaController {
    private final Dep_policiaService dep_policiaService;

    public Dep_policiaController(Dep_policiaService dep_policiaService)
    {
        this.dep_policiaService = dep_policiaService;
    }
    @PostMapping
    public Dep_policia save(@RequestBody Dep_policia dep_policia){
        return dep_policiaService.save(dep_policia);
    }
    @GetMapping
    public List<Dep_policia> findAll(){
        return dep_policiaService.findAll();
    }
}

