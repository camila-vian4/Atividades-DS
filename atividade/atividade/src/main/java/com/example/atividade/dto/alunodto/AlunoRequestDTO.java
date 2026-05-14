package com.example.atividade.dto.alunodto;

import com.example.atividade.enums.Sexo;
import jakarta.validation.constraints.*;

public class AlunoRequestDTO {

    @NotBlank(message = "O nome é obrigatório.")
    private String nome;

    @NotNull(message = "A idade é obrigatória.")
    private int idade;

    @NotNull(message = "O sexo é obrigatório.")
    private Sexo sexo;

    @NotBlank(message = "A matrícula é obrigatória.")
    @Size(min = 11, max = 13, message = "A matrícula deve ter entre 11 e 13 caracteres.")
    private String matricula;

    @NotBlank(message = "A senha é obrigatória.")
    private String senha;

    public AlunoRequestDTO() {
    }

    public AlunoRequestDTO(String nome, int idade, Sexo sexo, String matricula, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.matricula = matricula;
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

    public @NotBlank(message = "A matrícula é obrigatória.") @Size(min = 11, max = 13, message = "A matrícula deve ter entre 11 e 13 caracteres.") String getMatricula() {
        return matricula;
    }

    public void setMatricula(@NotBlank(message = "A matrícula é obrigatória.") @Size(min = 11, max = 13, message = "A matrícula deve ter entre 11 e 13 caracteres.") String matricula) {
        this.matricula = matricula;
    }

    public @NotBlank(message = "A senha é obrigatória.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatória.") String senha) {
        this.senha = senha;
    }
}
