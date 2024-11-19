package model;

public class Gerente extends Funcionario implements Gerencia {
    public Gerente(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public String mostrarDetalhes() {
        return "Gerente: " + nome + ", Salário: " + salario;
    }

    @Override
    public void organizarEquipe() {
        // Implementar lógica
    }

    @Override
    public void conduzirReunioes() {
        // Implementar lógica
    }
}