package com.example.enums;

public enum Pedido {
    ABERTO("Aberto"),
    CANCELADO("Cancelado"),
    CONCLUÍDO("Concluído");

    private String texto;

    Pedido(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
