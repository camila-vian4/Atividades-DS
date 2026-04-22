package com.example.revisao.model;

import com.example.revisao.enums.Setor;
import com.example.revisao.enums.Sexo;
import jakarta.persistence.*;

@Entity
@Table(name = "tab_funcionarios")
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int idade;
    private String email;
    private double salario;

    @Enumerated (EnumType.STRING)
    private Sexo sexo;

    @Enumerated (EnumType.STRING)
    private Setor setor;

    public FuncionarioModel() {
    }

    public FuncionarioModel(Long id, String nome, int idade, String email, double salario, Sexo sexo, Setor setor) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.salario = salario;
        this.sexo = sexo;
        this.setor = setor;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
}