package com.example.projeto.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioRequestDTO {
    @NotBlank(message = "O nome é obrigatório.")
    @Size(min = 2, message = "O nome deve ter no mínimo dois caracteres.")
    @Size(max = 100, message = "O nome deve ter no máximo 100 caracteres.")
    private String nome;

    @NotBlank(message = "O e-mail é obrigatório.")
    @Email(message = "Deve ser um e-mail válido.")
    private String email;

    @NotBlank(message = "A senha é obrigatória.")
    @Size(min = 3, max = 8, message = "A senha deve ter entre 3 a 8 dígitos.")
    private String senha;

    public UsuarioRequestDTO() {
    }

    public UsuarioRequestDTO(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public @NotBlank(message = "O nome é obrigatório.") @Size(min = 2, message = "O nome deve ter no mínimo dois caracteres.") @Size(max = 100, message = "O nome deve ter no máximo 100 caracteres.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório.") @Size(min = 2, message = "O nome deve ter no mínimo dois caracteres.") @Size(max = 100, message = "O nome deve ter no máximo 100 caracteres.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O e-mail é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O e-mail é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha é obrigatória.") @Size(min = 3, max = 8, message = "A senha deve ter entre 3 a 8 dígitos.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatória.") @Size(min = 3, max = 8, message = "A senha deve ter entre 3 a 8 dígitos.") String senha) {
        this.senha = senha;
    }
}
