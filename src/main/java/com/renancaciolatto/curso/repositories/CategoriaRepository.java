package com.renancaciolatto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renancaciolatto.curso.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
}
