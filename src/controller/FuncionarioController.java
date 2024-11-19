package controller;

import model.Funcionario;
import model.Desenvolvedor;
import model.Gerente;
import model.Treinador;
import model.GerenteDesenvolvedor;
import view.FuncionarioView;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioController {
    private List<Funcionario> funcionarios;
    private FuncionarioView view;
    private static final String ARQUIVO_FUNCIONARIOS = "funcionarios.txt";

    public FuncionarioController(FuncionarioView view) {
        this.view = view;
        this.funcionarios = new ArrayList<>();
        carregarFuncionarios();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        salvarFuncionarios();
    }

    public void listarFuncionarios() {
        view.mostrarFuncionarios(funcionarios);
    }

    public void atualizarFuncionario(int id, String novoNome, double novoSalario) {
        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                f.setNome(novoNome);
                f.setSalario(novoSalario);
                salvarFuncionarios();
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    public void excluirFuncionario(int id) {
        funcionarios.removeIf(f -> f.getId() == id);
        salvarFuncionarios();
    }

    private void carregarFuncionarios() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO_FUNCIONARIOS))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                int id = Integer.parseInt(dados[0]);
                String tipo = dados[1];
                String nome = dados[2];
                double salario = Double.parseDouble(dados[3]);

                Funcionario funcionario = criarFuncionario(tipo, id, nome, salario);
                if (funcionario != null) {
                    funcionarios.add(funcionario);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar funcionários: " + e.getMessage());
        }
    }

    private Funcionario criarFuncionario(String tipo, int id, String nome, double salario) {
        switch (tipo) {
            case "Desenvolvedor":
                return new Desenvolvedor(id, nome, salario);
            case "Gerente":
                return new Gerente(id, nome, salario);
            case "Treinador":
                return new Treinador(id, nome, salario);
            case "GerenteDesenvolvedor":
                return new GerenteDesenvolvedor(id, nome, salario);
            default:
                return null;
        }
    }

    private void salvarFuncionarios() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO_FUNCIONARIOS))) {
            for (Funcionario f : funcionarios) {
                bw.write(f.getId() + ";" + f.getClass().getSimpleName() + ";" + f.getNome() + ";" + f.getSalario());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar funcionários: " + e.getMessage());
        }
    }

    public void interagirComUsuario() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Atualizar Funcionário");
            System.out.println("4. Excluir Funcionário");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o tipo de funcionário (Desenvolvedor, Gerente, Treinador, GerenteDesenvolvedor): ");
                    String tipo = scanner.nextLine ();
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o salário: ");
                    double salario = scanner.nextDouble();
                    int id = funcionarios.size() + 1; // ID simples baseado no tamanho da lista
                    Funcionario novoFuncionario = criarFuncionario(tipo, id, nome, salario);
                    if (novoFuncionario != null) {
                        adicionarFuncionario(novoFuncionario);
                        System.out.println("Funcionário adicionado com sucesso!");
                    } else {
                        System.out.println("Tipo de funcionário inválido.");
                    }
                    break;
                case 2:
                    listarFuncionarios();
                    break;
                case 3:
                    System.out.print("Digite o ID do funcionário a ser atualizado: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o novo salário: ");
                    double novoSalario = scanner.nextDouble();
                    atualizarFuncionario(idAtualizar, novoNome, novoSalario);
                    break;
                case 4:
                    System.out.print("Digite o ID do funcionário a ser excluído: ");
                    int idExcluir = scanner.nextInt();
                    excluirFuncionario(idExcluir);
                    System.out.println("Funcionário excluído com sucesso!");
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}