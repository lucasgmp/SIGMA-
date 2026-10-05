package com.sigma.repository;
import com.sigma.model.Dep_policia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Dep_policiaRepository  extends JpaRepository<Dep_policia, Long>{
}
