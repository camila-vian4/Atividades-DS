package com.example.game.enums;

public enum LootCenario {
    ESCASSO("Escasso"),
    COMUM("Comum"),
    ABUNDANTE("Abundante");

    private String texto;

    LootCenario(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
