package com.sigma.service;
import com.sigma.model.Renavam;
import com.sigma.repository.RenavamRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class RenavamService{
    private  RenavamRepository renavamRepository;
    public RenavamService(RenavamRepository renavamRepository){
            this.renavamRepository=renavamRepository;
    }
    public Renavam save(Renavam renavam){
        return renavamRepository.save(renavam);
    }
    public List<Renavam> findAll(){
        return renavamRepository.findAll();
    }
    public Optional<Renavam> findById(Long id){
        return renavamRepository.findById(id);
    }
    public void delete(Renavam renavam){
        renavamRepository.delete(renavam);
    }


}

