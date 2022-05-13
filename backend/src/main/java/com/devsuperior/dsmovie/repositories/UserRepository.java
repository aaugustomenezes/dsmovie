package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
//Os parâmetros do JpaRepository são parâmetros para a tabela.
//Essa interface vai fazer as operações CRUD NO BANCO DE DADOS.
	
	User findByEmail(String email);

}
