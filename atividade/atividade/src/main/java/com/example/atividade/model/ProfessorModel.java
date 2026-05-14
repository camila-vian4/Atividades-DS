package com.example.atividade.model;

import com.example.atividade.enums.Sexo;
import jakarta.persistence.*;

@Entity
@Table(name = "tab_professores")
public class ProfessorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int idade;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Column(nullable = false, unique = true)
    private String registroFuncional;

    @Column(nullable = false)
    private String senha;

    public ProfessorModel() {
    }

    public ProfessorModel(Long id, String nome, int idade, Sexo sexo, String registroFuncional, String senha) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.registroFuncional = registroFuncional;
        this.senha = senha;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getRegistroFuncional() {
        return registroFuncional;
    }

    public void setRegistroFuncional(String registroFuncional) {
        this.registroFuncional = registroFuncional;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
