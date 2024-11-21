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
        System.out.println(nome + " está ensinando novas tecnologias.");
    }

    @Override
    public void motivarEquipe() {
        System.out.println(nome + " está motivando a equipe.");
    }
}