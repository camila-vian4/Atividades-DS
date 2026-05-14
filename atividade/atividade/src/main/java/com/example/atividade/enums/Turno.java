package com.example.atividade.enums;

public enum Turno {
    MANHA("Manhã"),
    TARDE("Tarde"),
    NOITE("Noite");

    private String texto;

    Turno(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
