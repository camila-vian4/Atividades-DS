package com.example.exercicio1;

public class Endereco {
    // ATRIBUTOS
    private String logradouro;
    private String numero;
    private String cidade;

    // CONSTRUTOR
    public Endereco(String logradouro, String numero, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
    }

    // MÉTODOS DE ACESSO

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
