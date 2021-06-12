package com.projeto.compasso.pedido.controller.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;

import com.projeto.compasso.pedido.model.Endereco;

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
    List<Endereco> endereco = new ArrayList<>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
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

    public Double getSalario() {
        return salario;
    }

    public char getSexo() {
        return sexo;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

}
