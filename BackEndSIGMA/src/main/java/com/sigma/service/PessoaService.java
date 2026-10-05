package com.sigma.service;
import com.sigma.model.Pessoa;
import com.sigma.repository.PessoaRepository;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class PessoaService {
    private  final PessoaRepository pessoaRepository;
    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }
    public Pessoa save(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }
    public List<Pessoa> findAll(){
        return pessoaRepository.findAll();
    }
}
