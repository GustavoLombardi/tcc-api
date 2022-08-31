package com.tcc.api.repositories;

import com.tcc.api.model.Especialidade;
import com.tcc.api.model.Faculdade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {


}
