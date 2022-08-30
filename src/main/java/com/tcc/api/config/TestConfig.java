package com.tcc.api.config;


import com.tcc.api.model.Faculdade;
import com.tcc.api.model.Usuario;
import com.tcc.api.repositories.FaculdadeRepository;
import com.tcc.api.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private FaculdadeRepository faculdadeRepository;

    @Override
    public void run(String... args) throws Exception {

        Usuario u1 = new Usuario(null, "Maria", "Maria@gmail.com", "999999999", "123456");

        Usuario u2 = new Usuario(null, "José", "jose@gmail.com", "999999999", "123456");


        Faculdade f1  = new Faculdade(null,"UNIP - ANCHIETA ","R. GENERAL LEITE DE CASTRO","201","casa","04182-020","JARDIM SANTA CRUZ","SP","SÃO PAULO", "Zona Sul", "999999999");
        Faculdade f2  = new Faculdade(null,"UNIP - CHÁCARA STO. ANTÔNIO ","R. CANCIONEIRO POPULAR","210","casa","04182-020","CHÁCARA SANTO ANTONIO","SP","SÃO PAULO", "Zona Sul", "999999999");
        Faculdade f3  = new Faculdade(null,"UNIP - MARQUÊS ","AV. MARQUES DE SÃO VICENTE","3001","casa","05036-040","ÁGUA BRANCA","SP","SÃO PAULO", "Zona Oeste", "999999999");
        Faculdade f4  = new Faculdade(null,"UNIP - NORTE ","R. AMAZONAS DA SILVA","737","casa","02051-001","VILA GUILHERME","SP","SÃO PAULO", "Zona Norte", "999999999");

        usuarioRepository.saveAll(Arrays.asList(u1,u2));

        faculdadeRepository.saveAll(Arrays.asList(f1,f2,f3,f4));



    }




}
