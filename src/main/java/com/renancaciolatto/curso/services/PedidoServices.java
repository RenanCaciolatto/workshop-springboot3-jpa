package com.renancaciolatto.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renancaciolatto.curso.entities.Pedido;
import com.renancaciolatto.curso.repositories.PedidoRepository;

@Service
public class PedidoServices {
	
	@Autowired
	private PedidoRepository repositorio;
	
	public List<Pedido> findAll(){
		return repositorio.findAll();
	}
	
	public Pedido findById(Long id) {
		Optional<Pedido> obj = repositorio.findById(id);
		return obj.get();
	}
}
