package org.example.lacoderepeticao;
import java.util.*;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        while(idade<18) {
            System.out.println("\nAcesso negado!");
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();
        }

        System.out.println("\nAcesso permitido!");
        System.out.println("Carregando...");
    }
}
