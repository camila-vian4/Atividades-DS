package com.example.revisao.dto.cliente;

import com.example.revisao.enums.Sexo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ClienteRequestDTO {

    @NotBlank(message = "O nome é obrigatório")
    @Size(max = 200, message = "O nome deve ter no máximo 200 caracteres.")
    private String nome;

    @NotBlank(message = "O CPF é obrigatório")
    private String cpf;

    @NotNull(message = "O sexo é obrigatório.")
    private Sexo sexo;

    @NotBlank(message = "O telefone é obrigatório")
    @Size(min = 11, max = 11, message = "O CPF deve ter 11 caracteres.")
    private String telefone;

    @NotBlank(message = "O e-mail é obrigatório")
    @Email(message = "Deve ser um e-mail válido.")
    private String email;

    @NotBlank(message = "A senha é obrigatória")
    private String senha;

    public ClienteRequestDTO() {
    }

    public ClienteRequestDTO(String nome, String cpf, Sexo sexo, String telefone, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public @NotBlank(message = "O nome é obrigatório") @Size(max = 200, message = "O nome deve ter no máximo 200 caracteres.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório") @Size(max = 200, message = "O nome deve ter no máximo 200 caracteres.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O CPF é obrigatório") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotBlank(message = "O CPF é obrigatório") String cpf) {
        this.cpf = cpf;
    }

    public @NotNull(message = "O sexo é obrigatório.") Sexo getSexo() {
        return sexo;
    }

    public void setSexo(@NotNull(message = "O sexo é obrigatório.") Sexo sexo) {
        this.sexo = sexo;
    }

    public @NotBlank(message = "O telefone é obrigatório") @Size(min = 11, max = 11, message = "O CPF deve ter 11 caracteres.") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "O telefone é obrigatório") @Size(min = 11, max = 11, message = "O CPF deve ter 11 caracteres.") String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank(message = "O e-mail é obrigatório") @Email(message = "Deve ser um e-mail válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O e-mail é obrigatório") @Email(message = "Deve ser um e-mail válido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha é obrigatória") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatória") String senha) {
        this.senha = senha;
    }
}
