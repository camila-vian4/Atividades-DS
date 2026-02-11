package org.example.lacoderepeticao;
import java.util.*;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int avaliacao;

        do{
            System.out.print("Avalie nosso atendimento, de 1 a 5 estrelas: ");
            avaliacao = scanner.nextInt();
        } while(avaliacao < 1 || avaliacao > 5);

        System.out.println("Obrigado(a)!");
    }
}
