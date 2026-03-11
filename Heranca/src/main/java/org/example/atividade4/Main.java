package org.example.atividade4;

public class Main {
    public static void main(String[] args) {

        Engenheiro engenheiro1 = new Engenheiro("Antony", "antonyzinho@gmail.com", 15.000f,
                new Endereco("R. Alphaville", "502", "Condominio 202", "21381062", "Salvador"), "HHJGUY");

        Medico medico1 = new Medico("Camila", "camilazinha@gmail.com", 20.000f,
                new Endereco("R. Alphaville", "502", "Condominio 202", "21381062", "Salvador"), "UHHFYK");

        System.out.println(engenheiro1.toString());
        System.out.println(medico1.toString());
    }
}
