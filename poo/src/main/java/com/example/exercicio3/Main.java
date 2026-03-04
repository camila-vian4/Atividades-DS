package com.example.exercicio3;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario(21, "Anty",
                "R. oswaldi", "80028922", "anty@gmail.com",
                new ContaBancaria("Nubank", "0001", "005889",
                        "Corrente", 90.48, 100.0));

        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Código: " + funcionario1.getCodFuncionario());
        System.out.println("Endereço: " + funcionario1.getEndereco());
        System.out.println("Telefone: " + funcionario1.getTelefone());
        System.out.println("Email: " + funcionario1.getEmail());
        System.out.println("\nBanco: " + funcionario1.getContaBancaria().getBanco());
        System.out.println("Agência: " + funcionario1.getContaBancaria().getAgencia());
        System.out.println("Número da Conta: " + funcionario1.getContaBancaria().getNumConta());
        System.out.println("Tipo da conta: " + funcionario1.getContaBancaria().getTipoConta());
        System.out.println("Saldo Atual: " + funcionario1.getContaBancaria().getSaldoAtual());
        System.out.println("Limite Disponível: " + funcionario1.getContaBancaria().getLimiteDispo());
    }
}
