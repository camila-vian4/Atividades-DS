package com.example.game.dto;

public class JogadorResponseDTO {

    private String nickname;
    private int idade;
    private String email;

    public JogadorResponseDTO() {
    }

    public JogadorResponseDTO(String nickname, int idade, String email) {
        this.nickname = nickname;
        this.idade = idade;
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
