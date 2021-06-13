package com.projeto.compasso.pedido.controller.form;

import javax.validation.constraints.NotBlank;

public class EnderecoForm {
    @NotBlank
    private String pais;
    @NotBlank
    private String estado;
    @NotBlank
    private String cidade;
    @NotBlank
    private String cep;
    @NotBlank
    private String rua;
}
