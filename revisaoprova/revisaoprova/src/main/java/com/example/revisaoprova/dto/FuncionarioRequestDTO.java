package com.example.revisaoprova.dto;

import com.example.revisaoprova.model.EnderecoModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class FuncionarioRequestDTO {

    @NotBlank(message = "O nome é obrigatório.")
    @Size(max = 200, message = "O nome deve ter no máximo 200 caracteres.")
    private String nome;

    @NotBlank(message = "A matricula é obrigatória.")
    @Size(min = 10, max = 14, message = "A matrícula deve estar entre 10 à 14 caracteres.")
    private String matricula;

    @NotBlank(message = "A data de nascimento é obrigatória.")
    private String dataNascimento;

    @NotNull(message = "O salário é obrigatório.")
    private double salario;

    @NotBlank(message = "O email é obrigatório.")
    private String email;

    @NotNull(message = "O endereço é obrigatório.")
    private EnderecoModel endereco;

    public FuncionarioRequestDTO() {
    }

    public FuncionarioRequestDTO(String nome, String matricula, String dataNascimento, double salario, String email, EnderecoModel endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.email = email;
        this.endereco = endereco;
    }

    public @NotBlank(message = "O nome é obrigatório.") @Size(max = 200, message = "O nome deve ter no máximo 200 caracteres.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório.") @Size(max = 200, message = "O nome deve ter no máximo 200 caracteres.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "A matricula é obrigatória.") @Size(min = 10, max = 14, message = "A matrícula deve estar entre 10 à 14 caracteres.") String getMatricula() {
        return matricula;
    }

    public void setMatricula(@NotBlank(message = "A matricula é obrigatória.") @Size(min = 10, max = 14, message = "A matrícula deve estar entre 10 à 14 caracteres.") String matricula) {
        this.matricula = matricula;
    }

    public @NotBlank(message = "A data de nascimento é obrigatória.") String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@NotBlank(message = "A data de nascimento é obrigatória.") String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @NotNull(message = "O salário é obrigatório.")
    public double getSalario() {
        return salario;
    }

    public void setSalario(@NotNull(message = "O salário é obrigatório.") double salario) {
        this.salario = salario;
    }

    public @NotBlank(message = "O email é obrigatório.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email é obrigatório.") String email) {
        this.email = email;
    }

    public @NotNull(message = "O endereço é obrigatório.") EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(@NotNull(message = "O endereço é obrigatório.") EnderecoModel endereco) {
        this.endereco = endereco;
    }
}
