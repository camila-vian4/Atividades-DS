package com.example.revisao.dto.cliente;

import com.example.revisao.enums.Sexo;

public class ClienteResponseDTO {

    private Long id;
    private String nome;
    private String cpf;
    private Sexo sexo;
    private String telefone;
    private String email;

    public ClienteResponseDTO() {
    }

    public ClienteResponseDTO(Long id, String nome, String cpf, Sexo sexo, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
