package com.lsfurtado.desafiobtg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lsfurtado.desafiobtg.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Integer> {

}
