package com.renancaciolatto.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renancaciolatto.curso.entities.Produto;
import com.renancaciolatto.curso.services.ProdutoServices;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResources {
	
	@Autowired
	private ProdutoServices servicos;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll(){
		List<Produto> lista = servicos.findAll(); 
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto> findByd(@PathVariable Long id){
		Produto obj = servicos.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
