package com.projeto.compasso.pedido.controller.form;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.projeto.compasso.pedido.model.Endereco;

public class PessoaForm {
    @NotNull
    private String nome;
    @NotNull
    private String cpf;
    @NotNull
    private double salario;
    @NotNull
    private char sexo;
    @NotNull
    List<Endereco> endereco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public char getSexo() {
        return sexo;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

}
