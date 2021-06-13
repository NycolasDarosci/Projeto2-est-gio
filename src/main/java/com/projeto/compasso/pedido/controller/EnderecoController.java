package com.projeto.compasso.pedido.controller;

import java.util.List;

import com.projeto.compasso.pedido.controller.dto.EnderecoDto;
import com.projeto.compasso.pedido.convert.EnderecoConvert;
import com.projeto.compasso.pedido.model.Endereco;
import com.projeto.compasso.pedido.repository.EnderecoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private EnderecoConvert enderecoConvert;

    /*
     * @PostMapping
     * 
     * @Transactional
     * 
     * @ResponseStatus(HttpStatus.CREATED) public EnderecoForm
     * postar(@RequestBody @Valid Endereco e) { Endereco endereco =
     * enderecoRepository.save(e); return enderecoConvert.toEnderecoForm(endereco);
     * }
     */

    @GetMapping
    public List<EnderecoDto> listar() {
        List<Endereco> endereco = enderecoRepository.findAll();
        return enderecoConvert.toEnderecoDto(endereco);
    }

}
