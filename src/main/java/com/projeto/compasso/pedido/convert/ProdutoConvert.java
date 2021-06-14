package com.projeto.compasso.pedido.convert;

import java.util.List;
import java.util.stream.Collectors;

import com.projeto.compasso.pedido.controller.dto.ProdutoDto;
import com.projeto.compasso.pedido.controller.form.ProdutoForm;
import com.projeto.compasso.pedido.model.Produto;

import org.springframework.stereotype.Component;

@Component
public class ProdutoConvert {

    public ProdutoForm toProdutoForm(Produto produto) {
        ProdutoForm product = new ProdutoForm();
        product.setDescricao(produto.getDescricao());
        product.setPrecoUnitario(produto.getPrecoUnitario());
        return product;
    }

    public ProdutoDto toProdutoDto(Produto produto) {
        ProdutoDto product = new ProdutoDto();
        product.setDescricao(produto.getDescricao());
        product.setPrecoUnitario(produto.getPrecoUnitario());
        return product;
    }

    public List<ProdutoDto> toProdutoDto(List<Produto> produtos) {
        return produtos.stream().map(x -> toProdutoDto(x)).collect(Collectors.toList());
    }
}
