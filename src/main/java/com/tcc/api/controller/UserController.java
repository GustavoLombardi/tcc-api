package com.tcc.api.controller;



import com.tcc.api.Response;

import com.tcc.api.model.Faculdade;
import com.tcc.api.model.Usuario;
import com.tcc.api.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<Response<List<Usuario>>> findAll(){
        Response<List<Usuario>> response = new Response<>();
        response.setData(service.findAll());
        response.setStatusCode(HttpStatus.OK.value());
        response.setTimeStamp(System.currentTimeMillis());
        return ResponseEntity.ok().body(response);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Response<Usuario>> findById(@PathVariable Long id){
        Response<Usuario> response = new Response<>();
        response.setData(service.findById(id));
        response.setStatusCode(HttpStatus.OK.value());
        response.setTimeStamp(System.currentTimeMillis());
        return ResponseEntity.ok().body(response);
    }



}
