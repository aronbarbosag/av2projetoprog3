package model;

public class Treinador extends Funcionario implements Treina {
    public Treinador(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public String mostrarDetalhes() {
        return "Treinador: " + nome + ", Salário: " + salario;
    }

    @Override
    public void ensinarTecnologia() {
        // Implementar lógica
    }

    @Override
    public void motivarEquipe() {
        // Implementar lógica
    }
}