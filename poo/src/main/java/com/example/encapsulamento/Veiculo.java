package com.example.encapsulamento;

public class Veiculo {

    private String placa;
    private String cor;
    private int numPassageiros;
    private Double velociMax;
    private Double consumoMedio;


    public Veiculo(String placa, String cor, int numPassageiros, Double velociMax, Double consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numPassageiros = numPassageiros;
        this.velociMax = velociMax;
        this.consumoMedio = consumoMedio;
    }


    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getNumPassageiros() {
        return numPassageiros;
    }
    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }
    public Double getVelociMax() {
        return velociMax;
    }
    public void setVelociMax(Double velociMax) {
        this.velociMax = velociMax;
    }
    public Double getConsumoMedio() {
        return consumoMedio;
    }
    public void setConsumoMedio(Double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

}
