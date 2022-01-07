package com.crossjoin.lojaapp.repository;

	import org.springframework.data.jpa.repository.JpaRepository;

	import com.crossjoin.lojaapp.model.Produto;

	public interface ProdutoRepository extends JpaRepository<Produto, Long> {
		
	}