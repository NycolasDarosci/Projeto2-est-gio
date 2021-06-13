package com.projeto.compasso.pedido.convert;

import java.util.List;
import java.util.stream.Collectors;

import com.projeto.compasso.pedido.controller.dto.PessoaDto;
import com.projeto.compasso.pedido.controller.form.PessoaForm;
import com.projeto.compasso.pedido.model.Pessoa;

import org.springframework.stereotype.Component;

@Component
public class PessoaConvert {

    public PessoaDto toPessoaDto(Pessoa pessoa) {
        PessoaDto pessoaDto = new PessoaDto();
        pessoaDto.setNome(pessoa.getNome());
        pessoaDto.setCpf(pessoa.getCpf());
        pessoaDto.setSalario(pessoa.getSalario());
        pessoaDto.setSexo(pessoa.getSexo());
        pessoaDto.setEndereco(pessoa.getEndereco());
        return pessoaDto;
    }

    public List<PessoaDto> toPessoaDto(List<Pessoa> pessoa) {
        return pessoa.stream().map(x -> toPessoaDto(x)).collect(Collectors.toList());
    }

    public PessoaForm toPessoaForm(Pessoa pessoa) {
        PessoaForm pessoaForm = new PessoaForm();
        pessoaForm.setNome(pessoa.getNome());
        pessoaForm.setCpf(pessoa.getCpf());
        pessoaForm.setSalario(pessoa.getSalario());
        pessoaForm.setSexo(pessoa.getSexo());
        pessoaForm.setEndereco(pessoa.getEndereco());
        return pessoaForm;
    }

    public List<PessoaForm> toPessoaForm(List<Pessoa> pessoa) {
        return pessoa.stream().map(x -> toPessoaForm(x)).collect(Collectors.toList());
    }
}
