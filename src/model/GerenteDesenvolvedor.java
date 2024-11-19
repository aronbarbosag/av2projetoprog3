package model;

public class GerenteDesenvolvedor extends Funcionario implements Gerencia, Desenvolve {
    public GerenteDesenvolvedor(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public String mostrarDetalhes() {
        return "Gerente Desenvolvedor: " + nome + ", Salário: " + salario;
    }

    @Override
    public void codar() {
        // Implementar lógica
    }

    @Override
    public void resolverProblemas() {
        // Implementar lógica
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