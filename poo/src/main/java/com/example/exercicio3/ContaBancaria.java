package com.example.exercicio3;

public class ContaBancaria {
    private String banco;
    private String agencia;
    private String numConta;
    private String tipoConta;
    private Double SaldoAtual;
    private Double LimiteDispo;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Double getSaldoAtual() {
        return SaldoAtual;
    }

    public void setSaldoAtual(Double saldoAtual) {
        SaldoAtual = saldoAtual;
    }

    public Double getLimiteDispo() {
        return LimiteDispo;
    }

    public void setLimiteDispo(Double limiteDispo) {
        LimiteDispo = limiteDispo;
    }

    public ContaBancaria(String banco,
                         String agencia, String numConta, String tipoConta, Double saldoAtual, Double limiteDispo) {
        this.banco = banco;
        this.agencia = agencia;
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        SaldoAtual = saldoAtual;
        LimiteDispo = limiteDispo;


    }
}
