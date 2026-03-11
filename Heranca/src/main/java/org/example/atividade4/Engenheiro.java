package org.example.atividade4;

public class Engenheiro extends Funcionario {
    private String crea;

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public Engenheiro(String nome, String email, float salario, Endereco endereco, String crea) {
        super(nome, email, salario, endereco);
        this.crea = crea;

    }

    @Override
    public String toString() {
        return "Engenheiro{" +
                "crea='" + crea + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                ", endereco=" + endereco +
                '}';
    }
}
