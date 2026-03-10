package org.example.vetores;
import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        int quantidadeNotas = scanner.nextInt();

        double[] notas = new double[quantidadeNotas];
        double soma = 0;

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Digite a " + (i+1) + "ª nota: ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];

        }

        double media = soma / notas.length;

        System.out.println("\n-- Exibindo as notas --");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        System.out.println("\n>> Média: " + media);

        scanner.close();

    }
}
