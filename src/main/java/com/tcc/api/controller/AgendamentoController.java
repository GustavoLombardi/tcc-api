package com.tcc.api.controller;


import com.tcc.api.Response;
import com.tcc.api.model.Agendamento;
import com.tcc.api.model.Usuario;
import com.tcc.api.services.AgendamentoService;
import com.tcc.api.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService service;

    @GetMapping
    public ResponseEntity<Response<List<Agendamento>>> findAll(){
        Response<List<Agendamento>> response = new Response<>();
        response.setData(service.findAll());
        response.setStatusCode(HttpStatus.OK.value());
        response.setTimeStamp(System.currentTimeMillis());
        return ResponseEntity.ok().body(response);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Response<Agendamento>> findById(@PathVariable Long id){
        Response<Agendamento> response = new Response<>();
        response.setData(service.findById(id));
        response.setStatusCode(HttpStatus.OK.value());
        response.setTimeStamp(System.currentTimeMillis());
        return ResponseEntity.ok().body(response);
    }



}
