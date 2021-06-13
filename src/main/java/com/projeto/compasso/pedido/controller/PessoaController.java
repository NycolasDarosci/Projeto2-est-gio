package com.projeto.compasso.pedido.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import com.projeto.compasso.pedido.controller.dto.PessoaDto;
import com.projeto.compasso.pedido.controller.form.PessoaForm;
import com.projeto.compasso.pedido.convert.PessoaConvert;
import com.projeto.compasso.pedido.model.Endereco;
import com.projeto.compasso.pedido.model.Pessoa;
import com.projeto.compasso.pedido.repository.EnderecoRepository;
import com.projeto.compasso.pedido.repository.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private PessoaConvert convert;

    @PostMapping
    @Transactional
    @ResponseStatus(HttpStatus.CREATED)
    public PessoaForm postar(@RequestBody @Valid Pessoa p) {
        List<Endereco> endereco = p.getEndereco();
        Pessoa pessoa = new Pessoa(endereco);
        Pessoa pessoaSave = pessoaRepository.save(pessoa);
        return convert.toPessoaForm(pessoaSave);
    }

    @GetMapping
    public List<PessoaDto> listar() {
        List<Pessoa> pessoas = pessoaRepository.findAll();
        return convert.toPessoaDto(pessoas);
    }
}
