package com.projeto.compasso.pedido.controller;

import java.util.List;

import javax.transaction.Transactional;

import com.projeto.compasso.pedido.controller.dto.ProdutoDto;
import com.projeto.compasso.pedido.controller.form.ProdutoForm;
import com.projeto.compasso.pedido.convert.ProdutoConvert;
import com.projeto.compasso.pedido.model.Produto;
import com.projeto.compasso.pedido.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/protected/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ProdutoConvert convert;

    @PostMapping
    @Transactional
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoForm postar(@RequestBody Produto p) {
        Produto produtoSave = produtoRepository.save(p);
        return convert.toProdutoForm(produtoSave);

    }

    @GetMapping
    public ResponseEntity<List<ProdutoDto>> listar() {
        List<Produto> produtos = produtoRepository.findAll();
        if (produtos.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(convert.toProdutoDto(produtos));
    }
}
