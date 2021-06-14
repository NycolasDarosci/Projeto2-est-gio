package com.projeto.compasso.pedido.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.projeto.compasso.pedido.controller.dto.PedidoDto;
import com.projeto.compasso.pedido.convert.PedidoConvert;
import com.projeto.compasso.pedido.model.Pedido;
import com.projeto.compasso.pedido.repository.PedidoRepository;
import com.projeto.compasso.pedido.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/protected/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private PedidoConvert pedidoConvert;

    /*
     * @PostMapping
     * 
     * @Transactional
     * 
     * @ResponseStatus(HttpStatus.CREATED) public PedidoForm postar(@RequestBody
     * Pedido p) {
     * 
     * return pedidoConvert.toPedidoForm(pedido);
     * 
     * }
     */

    @GetMapping
    public ResponseEntity<List<PedidoDto>> listar() {
        List<Pedido> pedidos = pedidoRepository.findAll();
        if (pedidos.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pedidoConvert.toPedidoDto(pedidos));
    }
}
