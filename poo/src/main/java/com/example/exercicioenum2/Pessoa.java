package com.example.exercicioenum2;

public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private String telefone;
    private String email;
    private Sexo sexo;
    private Endereco endereco;

    public Pessoa(int id, String nome, int idade, String telefone, String email, Sexo sexo, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
