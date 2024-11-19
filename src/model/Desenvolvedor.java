package model;

public class Desenvolvedor extends Funcionario implements Desenvolve {
    public Desenvolvedor(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public String mostrarDetalhes() {
        return "Desenvolvedor: " + nome + ", Salário: " + salario;
    }

    @Override
    public void codar() {
        // Implementar lógica
    }

    @Override
    public void resolverProblemas() {
        // Implementar lógica
    }
}