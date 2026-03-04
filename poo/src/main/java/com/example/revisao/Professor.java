package com.example.revisao;

public class Professor {
    // ATRIBUTOS
    private String nome;
    private String disciplina;

    // CONSTRUTOR
    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    // MÉTODOS DE ACESSO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
