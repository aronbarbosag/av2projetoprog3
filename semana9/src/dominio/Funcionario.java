package dominio;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double calcularSalario();

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
