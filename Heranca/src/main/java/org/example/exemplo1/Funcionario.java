package org.example.exemplo1;

public class Funcionario extends Pessoa {
    private String matricula;
    private String cargo;
    private Double salario;

    public Funcionario(String nome, int idade, String matricula, String cargo, Double salario) {
        super(nome, idade);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }
}
