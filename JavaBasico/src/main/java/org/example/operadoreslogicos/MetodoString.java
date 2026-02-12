package org.example.operadoreslogicos;

public class MetodoString {
    public static void main(String[] args) {

        String nome = "Marta";
        String sobrenome = "Silveira";

        // Exibindo a quantidade de caracteres
        System.out.print("Tamanho do nome: " + nome.length());
        System.out.print("\nTamanho do sobrenome: " + sobrenome.length());

        // Concatenando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        // Exibindo nome completo usando métodos Strings - Maiúsculas
        System.out.print("\nConcatenação Maiúscula: " + nomeCompleto.toUpperCase());

        // Exibindo nome completo usando métodos Strings - Minúsculas
        System.out.print("\nConcatenação Minúscula: " + nomeCompleto.toLowerCase());
    }
}
