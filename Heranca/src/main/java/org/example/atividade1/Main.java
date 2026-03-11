package org.example.atividade1;

public class Main {
    public static void main(String[] args) {
        Memoria memoria1 = new Memoria("Crucial", "SU650", "480GB");
        Processador processador1 = new Processador("Ryzen", "AMD Ryzen 5","5500X3D");

        System.out.println(memoria1.toString());
        System.out.println(processador1.toString());
    }
}
