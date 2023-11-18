package com.renancaciolatto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renancaciolatto.curso.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
}
