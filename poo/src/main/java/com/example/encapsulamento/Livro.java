package com.example.encapsulamento;

public class Livro {

    private String titulo;
    private String autor;
    private int isbn;
    private int numPaginas;
    private Double preco;

    public Livro(String titulo, String autor, int isbn, int numPaginas, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.preco = preco;

    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

}











