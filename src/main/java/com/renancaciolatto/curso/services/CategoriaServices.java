package com.renancaciolatto.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renancaciolatto.curso.entities.Categoria;
import com.renancaciolatto.curso.repositories.CategoriaRepository;

@Service
public class CategoriaServices {
	
	@Autowired
	private CategoriaRepository repositorio;
	
	public List<Categoria> findAll(){
		return repositorio.findAll();
	}
	
	public Categoria findById(Long id) {
		Optional<Categoria> obj = repositorio.findById(id);
		return obj.get();
	}
}
