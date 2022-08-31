package com.tcc.api.controller;



import com.tcc.api.model.Faculdade;
import com.tcc.api.services.FaculdadeService;
import com.tcc.api.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/campus")
public class FaculdadeController {

    @Autowired
    private FaculdadeService service;

    @GetMapping
    public ResponseEntity<Response<List<Faculdade>>>  findAll(){
        Response<List<Faculdade>> response = new Response<>();
        response.setData(service.findAll());
    //    response.setStatusCode(HttpStatus.OK.value());
      //  response.setTimeStamp(System.currentTimeMillis());
        return ResponseEntity.ok().body(response);
    }

}


