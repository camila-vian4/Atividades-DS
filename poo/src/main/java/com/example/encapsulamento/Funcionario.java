package com.example.encapsulamento;

public class Funcionario {
    
    // ATRIBUTOS DA CLASSE
    private String nome;
    private String cargo;
    private Double salario;

    // MÉTODOS DE ACESSO
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    

}
