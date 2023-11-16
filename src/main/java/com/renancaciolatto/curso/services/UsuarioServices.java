package com.renancaciolatto.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renancaciolatto.curso.entities.Usuario;
import com.renancaciolatto.curso.repositories.UsuarioRepository;

@Service
public class UsuarioServices {
	
	@Autowired
	private UsuarioRepository repositorio;
	
	public List<Usuario> findAll(){
		return repositorio.findAll();
	}
	
	public Usuario findById(Long id) {
		Optional<Usuario> obj = repositorio.findById(id);
		return obj.get();
	}
}
