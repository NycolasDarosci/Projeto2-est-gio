package com.projeto.compasso.pedido.convert;

import java.util.List;
import java.util.stream.Collectors;

import com.projeto.compasso.pedido.controller.dto.PedidoDto;
import com.projeto.compasso.pedido.controller.form.PedidoForm;
import com.projeto.compasso.pedido.model.Pedido;

import org.springframework.stereotype.Component;

@Component
public class PedidoConvert {

    public PedidoDto toPedidoDto(Pedido pedido) {
        PedidoDto pedidoDto = new PedidoDto();
        pedidoDto.setTotal(pedido.getTotal());
        pedidoDto.setDate(pedido.getDate());
        pedidoDto.setProdutos(pedido.getProduto());
        return pedidoDto;
    }

    public List<PedidoDto> toPedidoDto(List<Pedido> pedidos) {
        return pedidos.stream().map(x -> toPedidoDto(x)).collect(Collectors.toList());
    }

    public PedidoForm toPedidoForm(Pedido pedido) {
        PedidoForm pedidoForm = new PedidoForm();
        pedidoForm.setTotal(pedido.getTotal());
        pedidoForm.setDate(pedido.getDate());
        return pedidoForm;
    }

}
