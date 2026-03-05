package com.example.exercicioenum1;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario(1, "Camila",8518.00, Setor.MARKETING, Sexo.FEMININO, 25);

        System.out.println(funcionario1.toString());

    }
}
