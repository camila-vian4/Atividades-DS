package com.example.game.dto;

import com.example.game.enums.HabilidadePersonagem;
import com.example.game.enums.PersonalidadePersonagem;

public class PersonagemResponseDTO {

    private String nome;
    private int idade;
    private HabilidadePersonagem habilidade;
    private PersonalidadePersonagem personalidade;


    public PersonagemResponseDTO() {
    }

    public PersonagemResponseDTO(String nome, int idade, HabilidadePersonagem habilidade, PersonalidadePersonagem personalidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.personalidade = personalidade;
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

    public HabilidadePersonagem getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(HabilidadePersonagem habilidade) {
        this.habilidade = habilidade;
    }

    public PersonalidadePersonagem getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(PersonalidadePersonagem personalidade) {
        this.personalidade = personalidade;
    }
}
