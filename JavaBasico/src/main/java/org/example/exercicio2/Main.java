package org.example.exercicio2;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("BOLETIM ESCOLAR! :)\n");

        System.out.print("Informe o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("\nInforme a 1º nota: ");
        int nota1 = scanner.nextInt();

        System.out.print("Informe a 2º nota: ");
        int nota2 = scanner.nextInt();

        int mediaAluno = (nota1 + nota2) / 2;

        if (mediaAluno >= 7) {
            System.out.print("\nNome: " + nomeAluno);
            System.out.print("\nMédia: " + mediaAluno);
            System.out.println("\nSituação: APROVADO(a)");
        } else {
            System.out.print("\nNome: " + nomeAluno);
            System.out.print("\nMédia: " + mediaAluno);
            System.out.println("\nSituação: REPROVADO(a)");
        }

    }
}
