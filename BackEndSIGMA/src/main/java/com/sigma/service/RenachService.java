package com.sigma.service;
import com.sigma.model.Renach;
import com.sigma.repository.RenachRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RenachService {
    private final RenachRepository renachRepository;
    public RenachService(RenachRepository renachRepository) {
        this.renachRepository = renachRepository;
    }
    public Renach salvar(Renach renach){
        return renachRepository.save(renach);
    }
    public List<Renach> listar(){
        return renachRepository.findAll();
    }
    public Renach buscar(long id){
        return renachRepository.findById(id).orElse(null);
    }
    public void excluirRenach(long id){
        renachRepository.deleteById(id);
    }



}

