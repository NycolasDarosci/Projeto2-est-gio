package com.projeto.compasso.pedido.controller.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.projeto.compasso.pedido.model.Produto;

public class PedidoDto {
    @NotNull
    private double total;
    @NotNull
    private Date date;
    @NotNull
    private List<Produto> produtos = new ArrayList<>();

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
