package com.example.aula.model;

import com.example.aula.enums.Setor;
import com.example.aula.enums.Sexo;
import jakarta.persistence.*;

@Entity
@Table(name = "tab_funcionarios")
public class FuncionarioModel {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private int idade;
    private String email;
    private double salario;

    @Enumerated (EnumType.STRING)
    private Setor setor;

    @Enumerated (EnumType.STRING)
    private Sexo sexo;

    public FuncionarioModel() {
    }

    public FuncionarioModel(Long id, String nome, int idade, String email, double salario, Setor setor, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
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

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "FuncionarioModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                ", setor=" + setor +
                ", sexo=" + sexo +
                '}';
    }
}
