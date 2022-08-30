package com.tcc.api.services;

import com.tcc.api.model.Faculdade;
import com.tcc.api.model.Usuario;
import com.tcc.api.repositories.FaculdadeRepository;
import com.tcc.api.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaculdadeService {

    @Autowired
    private FaculdadeRepository repository;

    public List<Faculdade> findAll(){
        return repository.findAll();
    }
}
