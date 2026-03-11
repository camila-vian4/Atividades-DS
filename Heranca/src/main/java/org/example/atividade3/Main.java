package org.example.atividade3;

public class Main {
    public static void main(String[] args) {

        Fisica pessoaFisica1 = new Fisica("Camila", "21 983575240", "889.991.223-67", "99878890", "02/02/2004");
        Juridica pessoaJuridica1 = new Juridica("Antony", "71 998767845", "998.990.334-65", "99JK8H0");

        System.out.println(pessoaFisica1.toString());
        System.out.println(pessoaJuridica1.toString());
    }
}
