package com.renancaciolatto.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renancaciolatto.curso.entities.Pedido;
import com.renancaciolatto.curso.services.PedidoServices;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResources {
	
	@Autowired
	private PedidoServices servicos;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> findAll(){
		List<Pedido> lista = servicos.findAll(); 
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido> findByd(@PathVariable Long id){
		Pedido obj = servicos.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
