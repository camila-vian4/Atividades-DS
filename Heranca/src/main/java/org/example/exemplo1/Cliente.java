package org.example.exemplo1;

public class Cliente extends Pessoa {
    private String dataCompra;
    private String formaDePagamento;

    public Cliente(String nome, int idade, String dataCompra, String formaDePagamento) {
        super(nome, idade);
        this.dataCompra = dataCompra;
        this.formaDePagamento = formaDePagamento;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dataCompra='" + dataCompra + '\'' +
                ", formaDePagamento='" + formaDePagamento + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
