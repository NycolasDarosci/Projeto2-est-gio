package com.projeto.compasso.pedido.controller.form;

import javax.validation.constraints.NotNull;

public class ProdutoForm {
    @NotNull
    private String descricao;
    @NotNull
    private double precoUnitario;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}
