package org.example.vetores;
import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[2];

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite a " + (i+1) + "ª nota: ");
            notas[i] = scanner.nextDouble();

        }

        System.out.println("\nExibindo as notas: ");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        scanner.close();
    }
}
