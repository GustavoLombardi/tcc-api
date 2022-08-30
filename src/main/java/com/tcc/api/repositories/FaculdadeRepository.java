package com.tcc.api.repositories;

import com.tcc.api.model.Faculdade;
import com.tcc.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaculdadeRepository extends JpaRepository<Faculdade, Long> {


}
