package org.example.operadoreslogicos;
import java.util.*;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeUsuario;
        int senhaUsuario;
        boolean resultadoNome;
        boolean resultadoSenha;

        do{
            System.out.print("Informe o nome do usuário: ");
            nomeUsuario = scanner.nextLine();

            resultadoNome = nomeUsuario.equals("Camila"); // Comparação de Strings e inteiros

            if (resultadoNome == false) {
                System.out.print("Nome de usuário inválido, tente novamente.\n\n");
            }

        } while(resultadoNome == false);

        do{
            System.out.print("Informe a senha: ");
            senhaUsuario  = scanner.nextInt(); scanner.nextLine();
            
            resultadoSenha = (senhaUsuario == 204);

            if (resultadoSenha == false) {
                System.out.print("Senha inválida, tente novamente.\n\n");
            }

        } while(resultadoSenha == false);

        System.out.print("\nBem-vindo, usuário logado!");
        System.out.print("\nCarregando...");

        scanner.close();

    }
}
