package com.example.game.enums;

public enum HabilidadePersonagem {

    CONGELAMENTO("Congelamento"),
    LER_PENSAMENTOS("Ler pensamentos"),
    ESCUDO_MAGICO("Escudo mágico"),
    SALTO_DUPLO("Salto duplo");

    private String texto;

    HabilidadePersonagem(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
