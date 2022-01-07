package com.crossjoin.lojaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crossjoin.lojaapp.model.Loja;

public interface LojaRepository extends JpaRepository<Loja, Long> {
	
}
