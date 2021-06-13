package com.projeto.compasso.pedido.convert;

import java.util.List;
import java.util.stream.Collectors;

import com.projeto.compasso.pedido.controller.dto.EnderecoDto;
import com.projeto.compasso.pedido.model.Endereco;

import org.springframework.stereotype.Component;

@Component
public class EnderecoConvert {
    public EnderecoDto toEnderecoDto(Endereco endereco) {
        EnderecoDto enderecoDto = new EnderecoDto();
        enderecoDto.setCidade(endereco.getCidade());
        enderecoDto.setRua(endereco.getRua());
        return enderecoDto;
    }

    public List<EnderecoDto> toEnderecoDto(List<Endereco> endereco) {
        return endereco.stream().map(x -> toEnderecoDto(x)).collect(Collectors.toList());
    }
}
