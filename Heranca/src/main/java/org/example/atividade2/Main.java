package org.example.atividade2;

public class Main {
    public static void main(String[] args) {

        Processador processador1 = new Processador("Crucial", "HYUJ", "667");
        Memoria memoria1 = new Memoria("Rayzen", "YHHI", "998");
        PlacaMae placamae1 = new PlacaMae("Crucial", "UYYHK", "exemplo");
        DispositivoDeArmazenamento dispoDeArmaz1 = new DispositivoDeArmazenamento("Crucial", "HHUI", "998", "LLL");

        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
        System.out.println(placamae1.toString());
        System.out.println(dispoDeArmaz1.toString());

    }
}
