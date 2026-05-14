package com.example.atividade.dto.alunodto;

import com.example.atividade.enums.Sexo;

public class AlunoResponseDTO {
    private Long id;
    private String nome;
    private int idade;
    private Sexo sexo;
    private String matricula;

    public AlunoResponseDTO() {
    }

    public AlunoResponseDTO(Long id, String nome, int idade, Sexo sexo, String matricula) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.matricula = matricula;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
