package org.example.atividade2;

public class Motoboy extends Funcionario {
    private String carteiraDeHabilitacao;

    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "carteiraDeHabilitacao='" + carteiraDeHabilitacao + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo.getTexto() +
                ", setor=" + setor.getTexto() +
                ", salarioBase=" + salarioBase +
                ", salarioBase=" + getSalarioFinal() +
                '}';
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }
}
