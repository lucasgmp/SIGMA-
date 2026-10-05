package com.sigma.service;
import com.sigma.model.Dep_policia;
import com.sigma.repository.Dep_policiaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class Dep_policiaService {
    private final  Dep_policiaRepository  dep_policiaRepository;


    public Dep_policiaService(Dep_policiaRepository depPoliciaRepository) {
        this.dep_policiaRepository = depPoliciaRepository;
    }
     public Dep_policia save(Dep_policia dep_policia){
        return dep_policiaRepository.save(dep_policia);
     }
     public List<Dep_policia> findAll(){
        return dep_policiaRepository.findAll();
     }




}
