package com.example.exercicio2;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Thor", "2", "Pinscher");
        Cliente cliente1 = new Cliente("Jasmine", "30", pet1);

        Cliente cliente2 = new Cliente("Isaac", "35", new Pet("Nigel",
                "2", "Poodle"));

        System.out.println("Nome Cliente: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Nome Pet: " + cliente1.getPet().getNome());
        System.out.println("Idade Pet: " + cliente1.getPet().getIdade());
        System.out.println("Raça: " + cliente1.getPet().getRaca());

        System.out.println("\nNome Cliente: " + cliente2.getNome());
        System.out.println("Idade: " + cliente2.getIdade());
        System.out.println("Nome Pet: " + cliente2.getPet().getNome());
        System.out.println("Idade Pet: " + cliente2.getPet().getIdade());
        System.out.println("Raça: " + cliente2.getPet().getRaca());
    }
}
