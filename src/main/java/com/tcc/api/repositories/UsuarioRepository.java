package com.tcc.api.repositories;

import com.tcc.api.model.Usuario;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    @Query("select u from Usuario u where u.email = ?1 and u.password = ?2")
    Optional<Usuario> findByUsuarioEqualsAndSenhaEquals(String email, String senha);


}
