package com.projeto.compasso.pedido.repository;

import com.projeto.compasso.pedido.model.Pedido;
import com.projeto.compasso.pedido.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
