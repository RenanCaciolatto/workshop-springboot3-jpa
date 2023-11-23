package com.renancaciolatto.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renancaciolatto.curso.entities.Categoria;
import com.renancaciolatto.curso.services.CategoriaServices;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {
	
	@Autowired
	private CategoriaServices servicos;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll(){
		List<Categoria> lista = servicos.findAll(); 
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findByd(@PathVariable Long id){
		Categoria obj = servicos.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
