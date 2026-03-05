package org.example.exemplo1;

public class Cliente extends Pessoa {
    private String dataCompra;
    private String formaDePagamento;

    public Cliente(String nome, int idade, String dataCompra, String formaDePagamento) {
        super(nome, idade);
        this.dataCompra = dataCompra;
        this.formaDePagamento = formaDePagamento;
    }

}
