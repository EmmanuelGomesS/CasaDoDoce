package com.doces.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doces.apirest.models.Doce;

public interface DoceRepository extends JpaRepository<Doce, Long>{

	Doce findById(long id);
}
