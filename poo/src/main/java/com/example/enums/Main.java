package com.example.enums;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Camila",Pedido.CANCELADO);

        System.out.println(cliente1.toString());
    }
}
