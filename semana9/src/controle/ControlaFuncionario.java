package controle;

import dominio.Funcionario;
import dominio.FuncionarioComComissao;
import dominio.FuncionarioPorHora;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlaFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> listaFuncionarios = new ArrayList<>();

        System.out.println("Cadastro de Funcionário com Comissão:");
        System.out.print("Nome: ");
        String nomeComissao = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfComissao = scanner.nextLine();
        System.out.print("Salário Base: ");
        double salarioBase = scanner.nextDouble();
        System.out.print("Vendas: ");
        double vendas = scanner.nextDouble();
        System.out.print("Taxa de Comissão (0.1 para 10%): ");
        double taxaComissao = scanner.nextDouble();
        scanner.nextLine(); 

        FuncionarioComComissao funcComComissao = new FuncionarioComComissao(
                nomeComissao, cpfComissao, salarioBase, vendas, taxaComissao);
        listaFuncionarios.add(funcComComissao);

        System.out.println("\nCadastro de Funcionário por Hora:");
        System.out.print("Nome: ");
        String nomeHora = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfHora = scanner.nextLine();
        System.out.print("Horas Trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();
        System.out.print("Valor por Hora: ");
        double valorHora = scanner.nextDouble();

        FuncionarioPorHora funcPorHora = new FuncionarioPorHora(
                nomeHora, cpfHora, horasTrabalhadas, valorHora);
        listaFuncionarios.add(funcPorHora);

        System.out.println("\nInformações dos Funcionários:");
        for (Funcionario funcionario : listaFuncionarios) {
            funcionario.mostrarInfo();
            System.out.println("--------------------");
        }

        scanner.close();
    }
}
