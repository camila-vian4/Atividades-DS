package org.example.atividade3;

public class Gerente extends CargoDeConfianca implements Contratacao {

    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase, bonificacao);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Contratando: " + getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Desligando: " + getNome());
    }

    @Override
    public double obterSalarioFinal() {
        return Bonificacao.GERENTE.getValor() * super.salarioBase;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioBase=" + obterSalarioFinal() +
                '}';
    }
}
