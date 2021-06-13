package com.projeto.compasso.pedido.controller.form;

import javax.validation.constraints.NotNull;

public class EnderecoForm {
    @NotNull
    private String pais;
    @NotNull
    private String estado;
    @NotNull
    private String cidade;
    @NotNull
    private String cep;
    @NotNull
    private String rua;

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
