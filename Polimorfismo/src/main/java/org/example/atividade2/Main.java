package org.example.atividade2;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy1 = new Motoboy("Flavio", "04/12/2000", Sexo.MASCULINO, Setor.OPERACOES, 1000.0, "222j99kusP");
        Diretor diretor1 = new Diretor("Camila", "02/02/2004", Sexo.FEMININO, Setor.RECURSOS_HUMANOS,1000.0);

        System.out.println(motoboy1.toString());
        System.out.println(diretor1.toString());

        diretor1.admitir(motoboy1);
        diretor1.demitir(diretor1);
    }
}
