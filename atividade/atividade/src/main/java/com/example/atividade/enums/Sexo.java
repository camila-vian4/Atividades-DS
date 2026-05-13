package com.example.atividade.enums;

public enum Sexo {
    FEMININO("Feminino"),
    MASCULINO("Masculino");

    private String texto;

    Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
