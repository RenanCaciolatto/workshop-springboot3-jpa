package com.renancaciolatto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renancaciolatto.curso.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
}
