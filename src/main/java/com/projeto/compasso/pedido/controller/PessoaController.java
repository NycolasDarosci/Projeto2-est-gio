package com.projeto.compasso.pedido.controller;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.projeto.compasso.pedido.controller.dto.PessoaDto;
import com.projeto.compasso.pedido.model.Pessoa;
import com.projeto.compasso.pedido.repository.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @PostMapping
    @Transactional
    public PessoaDto postar(@RequestBody Pessoa pessoa) {

    }

    @GetMapping
    public List<PessoaDto> listar() {
        List<Pessoa> pessoas = repository.findAll();
        return convert
    }
}
