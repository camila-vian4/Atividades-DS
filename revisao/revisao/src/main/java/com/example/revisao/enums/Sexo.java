package com.example.revisao.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Sexo {
    MASCULINO('M', "Masculino"),
    FEMININO('F', "Feminino");

    private final char caractere;
    private final String texto;

    Sexo(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }

    public char getCaractere() {
        return caractere;
    }

    @JsonValue
    public String getTexto() {
        return texto;
    }
}
