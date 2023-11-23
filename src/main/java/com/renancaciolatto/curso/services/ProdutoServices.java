package com.renancaciolatto.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renancaciolatto.curso.entities.Produto;
import com.renancaciolatto.curso.repositories.ProdutoRepository;

@Service
public class ProdutoServices {
	
	@Autowired
	private ProdutoRepository repositorio;
	
	public List<Produto> findAll(){
		return repositorio.findAll();
	}
	
	public Produto findById(Long id) {
		Optional<Produto> obj = repositorio.findById(id);
		return obj.get();
	}
}
