package com.sigma.repository;
import com.sigma.model.Registro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroRespository extends JpaRepository<Registro,Long> {
}
