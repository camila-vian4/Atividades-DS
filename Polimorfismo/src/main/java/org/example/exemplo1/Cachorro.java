package org.example.exemplo1;

public class Cachorro implements Animal {
    @Override
    public String emitirSom() {
        return "Auau!";
    }

    @Override
    public String comer() {
        return "Ração para Cachorro";
    }
}
