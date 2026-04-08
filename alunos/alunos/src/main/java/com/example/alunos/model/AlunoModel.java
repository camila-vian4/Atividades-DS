package com.example.alunos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AlunoModel {
    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String r_a;
    private String telefone;

    public AlunoModel() {
    }

    public AlunoModel(Long id, String nome, String r_a, String telefone) {
        this.id = id;
        this.nome = nome;
        this.r_a = r_a;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getR_a() {
        return r_a;
    }

    public void setR_a(String r_a) {
        this.r_a = r_a;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
