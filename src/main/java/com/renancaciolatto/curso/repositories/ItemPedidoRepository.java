package com.renancaciolatto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renancaciolatto.curso.entities.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long>{
}
