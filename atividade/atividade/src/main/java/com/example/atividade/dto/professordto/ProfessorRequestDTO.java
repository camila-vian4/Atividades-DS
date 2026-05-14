package com.example.atividade.dto.professordto;

import com.example.atividade.enums.Sexo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProfessorRequestDTO {


    @NotBlank(message = "O nome é obrigatório.")
    private String nome;

    @NotNull(message = "A idade é obrigatória.")
    private int idade;

    @NotNull(message = "O sexo é obrigatório.")
    private Sexo sexo;

    @NotBlank(message = "O Registro Funcional é obrigatório.")
    @Size(min = 4, max = 20, message = "O Registro Funcional deve ter entre 04 e 20 caracteres.")
    private String registroFuncional;

    @NotBlank(message = "A senha é obrigatória.")
    private String senha;

    public ProfessorRequestDTO() {
    }

    public ProfessorRequestDTO(String nome, int idade, Sexo sexo, String registroFuncional, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.registroFuncional = registroFuncional;
        this.senha = senha;
    }

    public @NotBlank(message = "O nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    @NotNull(message = "A idade é obrigatória.")
    public int getIdade() {
        return idade;
    }

    public void setIdade(@NotNull(message = "A idade é obrigatória.") int idade) {
        this.idade = idade;
    }

    public @NotNull(message = "O sexo é obrigatório.") Sexo getSexo() {
        return sexo;
    }

    public void setSexo(@NotNull(message = "O sexo é obrigatório.") Sexo sexo) {
        this.sexo = sexo;
    }

    public @NotBlank(message = "O Registro Funcional é obrigatório.") @Size(min = 4, max = 20, message = "O Registro Funcional deve ter entre 04 e 20 caracteres.") String getRegistroFuncional() {
        return registroFuncional;
    }

    public void setRegistroFuncional(@NotBlank(message = "O Registro Funcional é obrigatório.") @Size(min = 4, max = 20, message = "O Registro Funcional deve ter entre 04 e 20 caracteres.") String registroFuncional) {
        this.registroFuncional = registroFuncional;
    }

    public @NotBlank(message = "A senha é obrigatória.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatória.") String senha) {
        this.senha = senha;
    }
}
