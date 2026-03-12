package org.example.atividade1;

public class Soma implements OperacaoMatematica {
    @Override
    public Double calcular(double a, double b) {
        return a+b;
    }
}
