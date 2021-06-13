package com.projeto.compasso.pedido.controller.dto;

import javax.validation.constraints.NotNull;

public class EnderecoDto {

    @NotNull
    private String cidade;
    @NotNull
    private String rua;

    public String getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
