package com.example.game.dto;

import com.example.game.enums.HabilidadePersonagem;
import com.example.game.enums.PersonalidadePersonagem;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PersonagemRequestDTO {
    @NotBlank(message = "O nome é obrigatório.")
    @Size(min = 2, message = "O nome deve ter no mínimo 02 caracteres.")
    @Size(max = 20, message = "O nome deve ter no máximo 20 caracteres.")
    private String nome;

    @NotNull(message = "A idade é obrigatória.")
    private int idade;

    @NotNull(message = "A habilidade é obrigatória.")
    private HabilidadePersonagem habilidade;

    @NotNull(message = "A personalidade é obrigatória.")
    private PersonalidadePersonagem personalidade;

    public PersonagemRequestDTO() {
    }

    public PersonagemRequestDTO(String nome, int idade, HabilidadePersonagem habilidade, PersonalidadePersonagem personalidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.personalidade = personalidade;
    }

    public @NotBlank(message = "O nome é obrigatório.") @Size(min = 2, message = "O nome deve ter no mínimo 02 caracteres.") @Size(max = 20, message = "O nome deve ter no máximo 20 caracteres.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório.") @Size(min = 2, message = "O nome deve ter no mínimo 02 caracteres.") @Size(max = 20, message = "O nome deve ter no máximo 20 caracteres.") String nome) {
        this.nome = nome;
    }

    @NotNull(message = "A idade é obrigatória.")
    public int getIdade() {
        return idade;
    }

    public void setIdade(@NotNull(message = "A idade é obrigatória.") int idade) {
        this.idade = idade;
    }

    public @NotNull(message = "A habilidade é obrigatória.") HabilidadePersonagem getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(@NotNull(message = "A habilidade é obrigatória.") HabilidadePersonagem habilidade) {
        this.habilidade = habilidade;
    }

    public @NotNull(message = "A personalidade é obrigatória.") PersonalidadePersonagem getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(@NotNull(message = "A personalidade é obrigatória.") PersonalidadePersonagem personalidade) {
        this.personalidade = personalidade;
    }
}
