package org.example.atividade2;

public class Diretor extends Funcionario implements Contratacao {
    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);

    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = super.salarioBase;
        salarioFinal += super.salarioBase * this.PREMIO;
        return salarioFinal;
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Contratando: " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Desligando: " + funcionario.getNome());
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo.getTexto() +
                ", setor=" + setor.getTexto() +
                ", salarioBase=" + salarioBase +
                ", salarioBase=" + getSalarioFinal() +
                '}';
    }
}
