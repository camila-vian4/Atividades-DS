package com.example.aula.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Setor {
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    VENDAS("Vendas"),
    MARKETING("Marketing");

    private String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    @JsonValue
    public String getTexto() {
        return texto;
    }

}
