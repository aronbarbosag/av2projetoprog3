package view;

import model.Funcionario;

import java.util.List;

public class FuncionarioView {
    public void mostrarFuncionarios(List<Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        for (Funcionario f : funcionarios) {
            System.out.println(f.mostrarDetalhes());
        }
    }
}