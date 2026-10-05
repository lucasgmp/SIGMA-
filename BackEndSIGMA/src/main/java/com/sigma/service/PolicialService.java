package com.sigma.service;
import com.sigma.model.Policial;
import com.sigma.repository.PolicialRepository;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class PolicialService {
private final PolicialRepository repository;
public PolicialService(PolicialRepository repository) {
		this.repository = repository;
	}
    public Policial save(Policial policial) {
        return repository.save(policial);
    }
    public List<Policial> findAll() {
        return repository.findAll();
    }
}
