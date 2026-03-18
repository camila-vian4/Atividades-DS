package org.example.atividade3;

import org.example.atividade2.Diretor;
import org.example.atividade2.Sexo;

public class Main {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Camila", "112.009.878-09", "11/09/1978", 1000.0, Bonificacao.GERENTE);
        Motoboy motoboy1 = new Motoboy("Antonie", "778.882.989-90", "26/10/1976", 1000.0, "667688990");

        System.out.println(gerente1.toString());
        System.out.println(motoboy1.toString());

        gerente1.admitir(motoboy1);

    }
}
