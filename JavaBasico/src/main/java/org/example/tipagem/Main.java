package org.example.tipagem;

public class Main {
    public static void main(String[] args) {
        //Declaração de variavéis
        String nome = "Marta";
        int idade = 30;
        double peso = 65.2;

        //Declaração de constantes
        final String CPF = "123.456.789-00";

        //Exibindo resultados
        //Concatenando com o sinal de "+"
        System.out.println("O nome do usuário é: " + nome);
        System.out.println("O CPF do usuário é: " + CPF);
        System.out.println("A idade do usuário é: " + idade);
        System.out.println("O peso do usuário é " + peso + " quilos");
    }
}