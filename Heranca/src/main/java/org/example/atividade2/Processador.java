package org.example.atividade2;

public class Processador extends Produto {
    private String frequencia;

    public Processador(String marca, String modelo, String frequencia) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "frequencia='" + frequencia + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
