package com.projeto.compasso.pedido.repository;

import java.util.Optional;

import com.projeto.compasso.pedido.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    public Optional<Produto> findById(Long id);
}
