package com.tcc.api.services;

import com.tcc.api.model.Especialidade;
import com.tcc.api.model.Faculdade;
import com.tcc.api.repositories.EspecialidadeRepository;
import com.tcc.api.repositories.FaculdadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadeService {

    @Autowired
    private EspecialidadeRepository repository;

    public List<Especialidade> findAll(){
        return repository.findAll();
    }
}
