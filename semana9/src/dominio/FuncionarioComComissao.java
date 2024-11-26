package dominio;

public class FuncionarioComComissao extends Funcionario {
    private double salarioBase;
    private double vendas;
    private double taxaComissao;

    public FuncionarioComComissao(String nome, String cpf, double salarioBase, double vendas, double taxaComissao) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.vendas = vendas;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (vendas * taxaComissao);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Vendas: " + vendas);
        System.out.println("Taxa de Comissão: " + (taxaComissao * 100) + "%");
        System.out.println("Salário Total: " + calcularSalario());
    }
}
