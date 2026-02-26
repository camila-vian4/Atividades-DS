package com.example.encapsulamento;

public class Main {
    public static void main(String[] args) {
        
        // ENCAPSULAMENTO
        Cliente cliente1 = new Cliente("Camila", 22); // INSTANCIAR CLASSE

        Pet pet1 = new Pet("Ayumi", 1, "Pinscher", "Pequeno", "Ração GoldeN");

        Livro livro1 = new Livro("Bridgerton - O Visconde Que Me Amava", "Julia Quinn", 123456789, 431, 58.75);

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Camila");
        funcionario1.setCargo("Auxiliar de Assistente Administrativo");
        funcionario1.setSalario(1621.00);

        Aluno aluno1 = new Aluno("Camila", "camila@gmail.com");

        Veiculo veiculo1 = new Veiculo("BRA2E19", "Preto", 5, 210.0, 14.0);

        System.out.println("Placa: " + veiculo1.getPlaca());
        System.out.println("Cor: " + veiculo1.getCor());
        System.out.println("Número de Passageiros: " + veiculo1.getNumPassageiros());
        System.out.println("Capacidade de tanque: " + veiculo1.getConsumoMedio() + " km/L");
        System.out.println("Velocidade Máxima: " + veiculo1.getVelociMax() + " km/h");

        System.out.println("\nNome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());

        System.out.println("\nNome: " + pet1.getNome());
        System.out.println("Idade: " + pet1.getIdade());
        System.out.println("Raça: " + pet1.getRaca());
        System.out.println("Porte: " + pet1.getPorte());
        System.out.println("Alimentação: " + pet1.getAlimentacao());
        
        System.out.println("\nTítulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("ISBN: " + livro1.getIsbn());
        System.out.println("Número de páginas: " + livro1.getNumPaginas());
        System.out.println("Preço: R$ " + livro1.getPreco());        

        System.out.println("\nNome: " + funcionario1.getNome());
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Salário: R$ " + funcionario1.getSalario());

        System.out.println("\nNome: " + aluno1.getNome());
        System.out.println("Email: " + aluno1.getEmail());
    }

}
