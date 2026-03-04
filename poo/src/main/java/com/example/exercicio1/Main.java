package com.example.exercicio1;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("R. Augusto Franco", "1093", "RJ");
        Cliente cliente1 = new Cliente("Camila", 22, endereco1);

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Logradouro: " + cliente1.getEndereco().getLogradouro());
        System.out.println("Número: " + cliente1.getEndereco().getNumero());
        System.out.println("Cidade: " + cliente1.getEndereco().getCidade());
    }
}
