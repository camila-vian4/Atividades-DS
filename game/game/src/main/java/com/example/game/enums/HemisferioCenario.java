package com.example.game.enums;

public enum HemisferioCenario {

    NORTE("Norte"),
    SUL("Sul"),
    LESTE("Leste"),
    OESTE("Oeste");

    private String texto;

    HemisferioCenario(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
