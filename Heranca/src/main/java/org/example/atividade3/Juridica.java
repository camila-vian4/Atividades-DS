package org.example.atividade3;

public class Juridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;

    public Juridica(String nome, String telefone, String cnpj, String inscricaoEstadual) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "Juridica{" +
                "cnpj='" + cnpj + '\'' +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
