package org.example.exemplo1;

public class Gato implements Animal {
    @Override
    public String emitirSom() {
        return "Meow!";
    }

    @Override
    public String comer() {
        return "Ração para Gato";
    }
}
