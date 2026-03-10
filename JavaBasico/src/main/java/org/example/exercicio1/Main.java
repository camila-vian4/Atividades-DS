package org.example.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double prestacoes = 5;

        System.out.print("Informe o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        double valorTotal = valorCompra / prestacoes;

        System.out.println("\n- - - - - - - - - - - - -");
        System.out.println("LOJA MAMÃO COM AÇÚCAR! <3\n");
        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Valor das parcelas: R$ " + valorTotal);

    }
}
