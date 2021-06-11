package com.projeto.compasso.pedido.controller.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class EnderecoDto {
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
