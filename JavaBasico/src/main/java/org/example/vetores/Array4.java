package org.example.vetores;
import java.util.*;

public class Array4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();
        String resposta;

        do {
            System.out.print("Digite uma nota: ");
            notas.add(scanner.nextDouble());

            System.out.print("\nDeseja inserir mais uma nota?");
            System.out.print("\nPressione a tecla N para sair.\n");
            resposta = scanner.next();
        } while(!resposta.equalsIgnoreCase("n"));

        System.out.println("Exibindo as notas: ");
        for (double nota : notas) {
            System.out.print("\nNota: " + nota);
        }
    }
}
