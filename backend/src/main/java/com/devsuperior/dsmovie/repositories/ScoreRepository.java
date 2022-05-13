package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
//Os parâmetros do JpaRepository são parâmetros para a tabela.
//Essa interface vai fazer as operações CRUD NO BANCO DE DADOS.	

}
