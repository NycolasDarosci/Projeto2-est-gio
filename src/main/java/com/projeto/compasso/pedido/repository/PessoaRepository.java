package com.projeto.compasso.pedido.repository;

import com.projeto.compasso.pedido.model.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
