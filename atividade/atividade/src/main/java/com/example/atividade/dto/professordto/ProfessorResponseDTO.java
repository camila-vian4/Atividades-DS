package com.example.atividade.dto.professordto;

import com.example.atividade.enums.Sexo;

public class ProfessorResponseDTO {
    private Long id;
    private String nome;
    private int idade;
    private Sexo sexo;
    private String registroFuncional;

    public ProfessorResponseDTO() {
    }

    public ProfessorResponseDTO(Long id, String nome, int idade, Sexo sexo, String registroFuncional) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.registroFuncional = registroFuncional;
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
}
