package com.tcc.api.config;


import com.tcc.api.enums.AgendamentoStatus;
import com.tcc.api.model.Agendamento;
import com.tcc.api.model.Especialidade;
import com.tcc.api.model.Faculdade;
import com.tcc.api.model.Usuario;
import com.tcc.api.repositories.AgendamentoRepository;
import com.tcc.api.repositories.EspecialidadeRepository;
import com.tcc.api.repositories.FaculdadeRepository;
import com.tcc.api.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @Autowired
    private FaculdadeRepository faculdadeRepository;

    @Autowired
    private EspecialidadeRepository especialidadeRepository;

    @Override
    public void run(String... args) throws Exception {


      Usuario u1 = new Usuario(null, "Maria", "Maria@gmail.com", "999999999", "123456");

      Usuario u2 = new Usuario(null, "José", "jose@gmail.com", "999999999", "123456");

        Agendamento a1 = new Agendamento(null, Instant.parse("2019-06-20T19:53:07Z"), AgendamentoStatus.AGUARDANDO, u1);
        Agendamento a2 = new Agendamento(null, Instant.parse("2019-07-21T03:42:10Z"),AgendamentoStatus.APROVADO, u2);
        Agendamento a3 = new Agendamento(null, Instant.parse("2019-07-22T15:21:22Z"),AgendamentoStatus.FINALIZADO, u1);


     //   Faculdade f1  = new Faculdade(null,"UNIP - ANCHIETA ","R. GENERAL LEITE DE CASTRO","201","casa","04182-020","JARDIM SANTA CRUZ","SP","SÃO PAULO", "Zona Sul", "2332-1300","https://www.google.com/maps/place/UNIP+-+Anchieta/@-23.6413602,-46.5979513,17z/data=!3m1!4b1!4m5!3m4!1s0x94ce5b57e38b06dd:0x459c204bf6d7b787!8m2!3d-23.6413651!4d-46.5957626" );
     //  Faculdade f2  = new Faculdade(null,"UNIP - CHÁCARA STO. ANTÔNIO ","R. CANCIONEIRO POPULAR","210","casa","04182-020","CHÁCARA SANTO ANTONIO","SP","SÃO PAULO", "Zona Sul", "21144000","https://www.google.com/maps/place/UNIP+-+Ch%C3%A1cara+Santo+Ant%C3%B4nio+I/@-23.6328342,-46.6991703,17z/data=!3m1!4b1!4m5!3m4!1s0x94ce50eedc11e6bf:0xea023a06a1072623!8m2!3d-23.6328391!4d-46.6969816");
     //   Faculdade f3  = new Faculdade(null,"UNIP - MARQUÊS ","AV. MARQUES DE SÃO VICENTE","3001","casa","05036-040","ÁGUA BRANCA","SP","SÃO PAULO", "Zona Oeste", "36137000","https://www.google.com/maps/place/UNIP+-+Marqu%C3%AAs/@-23.5158612,-46.6919785,17z/data=!3m1!4b1!4m5!3m4!1s0x94cef811f2dc100d:0x4b1218cce3811ce1!8m2!3d-23.5158661!4d-46.6897898");
     //   Faculdade f4  = new Faculdade(null,"UNIP - NORTE ","R. AMAZONAS DA SILVA","737","casa","02051-001","VILA GUILHERME","SP","SÃO PAULO", "Zona Norte", "27901550","https://www.google.com/maps/place/UNIP+-+Polo+EAD+-+Vila+Guilherme/@-23.5129562,-46.6115414,17z/data=!3m1!4b1!4m5!3m4!1s0x94ce58bcf1455e01:0x5b031903dfe08c94!8m2!3d-23.5129611!4d-46.6093527");
     //   Faculdade f5  = new Faculdade(null,"UNIP - TESTE ","R. AMAZONAS DA SILVA","737","casa","02051-001","VILA GUILHERME","SP","SÃO PAULO", "Zona Norte", "999999999","https://www.google.com/maps/place/UNIP+-+Marqu%C3%AAs/@-23.5158612,-46.6919785,17z/data=!3m1!4b1!4m5!3m4!1s0x94cef811f2dc100d:0x4b1218cce3811ce1!8m2!3d-23.5158661!4d-46.6897898");

      // Especialidade e1 = new Especialidade(null, "Nutrição", "1","heart_surgeon.png", "kOrangeColor");
      //  Especialidade e2 = new Especialidade(null, "Fisioterapia", "2","dental_surgeon.png", "kBlueColor");
      //  Especialidade e3 = new Especialidade(null, "Educação Fisica", "3","heart_surgeon.png", "kOrangeColor");
      //  Especialidade e4 = new Especialidade(null, "Psicologia", "4","heart_surgeon.png", "kOrangeColor");
      //  Especialidade e5 = new Especialidade(null, "D", "5","heart_surgeon.png", "kOrangeColor");



        usuarioRepository.saveAll(Arrays.asList(u1,u2));

        agendamentoRepository.saveAll(Arrays.asList(a1,a2,a3));



     //  faculdadeRepository.saveAll(Arrays.asList(f1,f2,f3,f4, f5));
     //  especialidadeRepository.saveAll(Arrays.asList(e1,e2,e3,e4, e5));

       // f1.getCa

    }




}
