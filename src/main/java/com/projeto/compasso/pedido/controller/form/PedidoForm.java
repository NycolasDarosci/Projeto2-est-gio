package com.projeto.compasso.pedido.controller.form;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class PedidoForm {
    @NotNull
    private double total;
    @NotNull
    private Date date;

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
