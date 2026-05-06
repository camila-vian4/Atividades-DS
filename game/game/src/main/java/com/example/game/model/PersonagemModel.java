package com.example.game.model;

import com.example.game.enums.HabilidadePersonagem;
import com.example.game.enums.PersonalidadePersonagem;
import jakarta.persistence.*;

@Entity
@Table(name = "tab_personagem")
public class PersonagemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private int idade;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private HabilidadePersonagem habilidade;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PersonalidadePersonagem personalidade;

    public PersonagemModel() {
    }

    public PersonagemModel(Long id, String nome, int idade, HabilidadePersonagem habilidade, PersonalidadePersonagem personalidade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.personalidade = personalidade;
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
