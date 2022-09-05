package com.tcc.api.services;

import com.tcc.api.model.Agendamento;
import com.tcc.api.repositories.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository repository;

    public List<Agendamento> findAll(){

        return repository.findAll();
    }


    public Agendamento findById(Long id){
        Optional<Agendamento> obj = repository.findById(id);
        return obj.get();

    }




}
