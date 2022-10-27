package com.aula.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
