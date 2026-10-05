package com.sigma.service;
import com.sigma.model.Registro;
import com.sigma.repository.RegistroRespository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class RegistroService {

    private final RegistroRespository registroRespository;

    public RegistroService(RegistroRespository registroRespository) {

        this.registroRespository = registroRespository;
    }
    public Registro save(Registro resgistros) {
        return registroRespository.save(resgistros);
    }
    public List<Registro> FindALL(){
        return registroRespository.findAll();
    }
    public Optional<Registro> findById(Long id){
        return registroRespository.findById(id);
    }
    public void deletar(long id){
        registroRespository.deleteById(id);
    }
}



