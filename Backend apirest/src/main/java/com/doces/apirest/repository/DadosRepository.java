package com.doces.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doces.apirest.models.Dados;

public interface DadosRepository extends JpaRepository<Dados, Long>{

		Dados findById(long id);
	}
