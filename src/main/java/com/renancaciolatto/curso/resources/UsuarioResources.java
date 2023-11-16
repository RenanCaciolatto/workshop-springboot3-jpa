package com.renancaciolatto.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renancaciolatto.curso.entities.Usuario;
import com.renancaciolatto.curso.services.UsuarioServices;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResources {
	
	@Autowired
	private UsuarioServices servicos;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll(){
		List<Usuario> lista = servicos.findAll(); 
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> findByd(@PathVariable Long id){
		Usuario obj = servicos.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
