package com.projeto.compasso.pedido.controller.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;

import lombok.Getter;

@Getter
public class PessoaDto {
    @NotBlank
    private String nome;
    @NotBlank
    private String cpf;
    @NotBlank
    private Double salario;
    @NotBlank
    private char sexo;
    @NotBlank
    List<EnderecoDto> endereco = new ArrayList<>();
}
