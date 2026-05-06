package com.example.game.enums;

public enum PersonalidadePersonagem {
    ESTRATEGICO("Estratégico"),
    SARCASTICO("Sarcástico"),
    RAIVOSO("Raivoso"),
    TIMIDO("Timido");

    private String texto;

    PersonalidadePersonagem(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
