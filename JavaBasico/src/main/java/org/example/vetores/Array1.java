package org.example.vetores;

public class Array1 {
    public static void main(String[] args) {
        int[] notas = new int[2];

        notas[0] = 10;
        notas[1] = 8;

        for (int i = 0; i < 2; i++) {
            System.out.println("Nota: " + notas[i]);
        }
    }
}
