package dominio;

public class FuncionarioPorHora extends Funcionario {
    private double horasTrabalhadas;
    private double valorHora;

    public FuncionarioPorHora(String nome, String cpf, double horasTrabalhadas, double valorHora) {
        super(nome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor por Hora: " + valorHora);
        System.out.println("Salário Total: " + calcularSalario());
    }
}
