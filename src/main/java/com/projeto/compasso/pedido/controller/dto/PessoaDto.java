package com.projeto.compasso.pedido.controller.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.projeto.compasso.pedido.model.Endereco;

public class PessoaDto {

    @NotNull
    private String nome;
    @NotNull
    private String cpf;
    @NotNull
    List<Endereco> endereco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(List<Endereco> list) {
        this.endereco = list;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

}
