package com.renancaciolatto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renancaciolatto.curso.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
}
