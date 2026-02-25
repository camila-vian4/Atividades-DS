package com.example.encapsulamento;

public class Main {
    public static void main(String[] args) {
        
        // ALGORITMO
        // String nome;
        // int idade;

        // nome = "Camila";
        // idade = 22;

        //PROGRAMAÇÃO ORIENTADA A OBJETOS
        // Cliente cliente1 = new Cliente();
        // cliente1.nome = "Marta";
        // cliente1.idade = 22;

        // Pet pet1 = new Pet();
        // pet1.nome = "Ayumi";
        // pet1.idade = 2;

        // ENCAPSULAMENTO
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Camila");
        cliente1.setIdade(22);

        Pet pet1 = new Pet();
        pet1.setNome("Ayumi");
        pet1.setIdade(1);

        Livro livro1 = new Livro();
        livro1.setNome("Bridgerton - O Visconde Que Me Amava");
        livro1.setPreco(47.90);

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Camila");
        funcionario1.setCargo("Auxiliar de Assistente Administrativo");
        funcionario1.setSalario(1621.00);

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());

        System.out.println("\nNome: " + pet1.getNome());
        System.out.println("Idade: " + pet1.getIdade());
        
        System.out.println("\nNome: " + livro1.getNome());
        System.out.println("Preço: R$ " + livro1.getPreco());

        System.out.println("\nNome: " + funcionario1.getNome());
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Salário: R$ " + funcionario1.getSalario());

    }

}
