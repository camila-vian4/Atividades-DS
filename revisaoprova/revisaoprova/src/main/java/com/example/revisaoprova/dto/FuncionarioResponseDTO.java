package com.example.revisaoprova.dto;

import com.example.revisaoprova.model.EnderecoModel;

public class FuncionarioResponseDTO {

    private Long id;
    private String nome;
    private String matricula;
    private String dataNascimento;
    private double salario;
    private String email;
    private EnderecoModel endereco;

    public FuncionarioResponseDTO() {
    }

    public FuncionarioResponseDTO(Long id, String nome, String matricula, String dataNascimento, double salario, String email, EnderecoModel endereco) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.email = email;
        this.endereco = endereco;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }
}
