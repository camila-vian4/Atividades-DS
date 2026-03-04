package com.example.revisao;

public class Main {
    public static void main(String[] args) {
        // INSTANCIAR A CLASSE PROFESSOR
        Professor prof1 = new Professor("Camila", "Prototipagem");
        Professor prof2 = new Professor("Antony", "Desenvolvimento de Sistemas");

        System.out.println("Nome: " + prof1.getNome());
        System.out.println("Disciplina: " + prof1.getDisciplina());

        System.out.println("\nNome: " + prof2.getNome());
        System.out.println("Disciplina: " + prof2.getDisciplina());



    }
}
