package org.example.exemplo1;

public class Pato implements Animal {
    @Override
    public String emitirSom() {
        return "Quack quack!";
    }

    @Override
    public String comer() {
        return "Peixe";
    }
}
