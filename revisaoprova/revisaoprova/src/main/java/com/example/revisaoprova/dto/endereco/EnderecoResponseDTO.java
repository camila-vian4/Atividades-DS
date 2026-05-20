package com.example.revisaoprova.dto.endereco;

import com.example.revisaoprova.enums.UnidadeFederativa;

public class EnderecoResponseDTO {

    private Long id;
    private String cep;
    private String logradouro;
    private String numero;
    private String cidade;
    private UnidadeFederativa uf;

    public EnderecoResponseDTO() {
    }

    public EnderecoResponseDTO(Long id, String cep, String logradouro, String numero, String cidade, UnidadeFederativa uf) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }
}
