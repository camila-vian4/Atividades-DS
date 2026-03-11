package org.example.exemplo1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Camila", 22, "10/03/2026", "PIX");
        Funcionario funcionario1 = new Funcionario("Joana", 30, "GYHU9O", "Caixa", 2400.0);

        System.out.println(cliente1.toString());
        System.out.println(funcionario1.toString());
    }

}
