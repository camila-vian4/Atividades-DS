package com.example.game.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class JogadorRequestDTO {

    @NotBlank(message = "O nome é obrigatório.")
    @Size(min = 4, message = "O nickname deve ter no mínimo quatro caracteres.")
    @Size(max = 20, message = "O nickname deve ter no máximo 20 caracteres.")
    private String nickname;

    @NotNull(message = "A idade é obrigatória.")
    private int idade;

    @NotBlank(message = "O e-mail é obrigatório.")
    @Email(message = "Deve ser um e-mail válido.")
    private String email;


    @NotBlank(message = "A senha é obrigatória.")
    @Size(min = 3, max = 10, message = "A senha deve ter entre 3 a 10 dígitos.")
    private String senha;

    public JogadorRequestDTO() {
    }

    public JogadorRequestDTO(String nickname, int idade, String email, String senha) {
        this.nickname = nickname;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
    }

    public @NotBlank(message = "O nome é obrigatório.") @Size(min = 4, message = "O nickname deve ter no mínimo quatro caracteres.") @Size(max = 20, message = "O nickname deve ter no máximo 20 caracteres.") String getNickname() {
        return nickname;
    }

    public void setNickname(@NotBlank(message = "O nome é obrigatório.") @Size(min = 4, message = "O nickname deve ter no mínimo quatro caracteres.") @Size(max = 20, message = "O nickname deve ter no máximo 20 caracteres.") String nickname) {
        this.nickname = nickname;
    }

    @NotNull(message = "A idade é obrigatória.")
    public int getIdade() {
        return idade;
    }

    public void setIdade(@NotNull(message = "A idade é obrigatória.") int idade) {
        this.idade = idade;
    }

    public @NotBlank(message = "O e-mail é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O e-mail é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha é obrigatória.") @Size(min = 3, max = 10, message = "A senha deve ter entre 3 a 10 dígitos.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatória.") @Size(min = 3, max = 10, message = "A senha deve ter entre 3 a 10 dígitos.") String senha) {
        this.senha = senha;
    }
}
