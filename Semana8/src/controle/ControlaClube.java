package controle;

import dominio.Clube;
import java.util.Scanner;

public class ControlaClube {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do clube: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de vitórias: ");
        int vitorias = scanner.nextInt();

        System.out.print("Digite o número de derrotas: ");
        int derrotas = scanner.nextInt();

        System.out.print("Digite o número de empates: ");
        int empates = scanner.nextInt();

        Clube clube = new Clube(nome, vitorias, derrotas, empates);

        System.out.println("\nInformações do Clube:");
        clube.exibirInformacoes();

        scanner.close();
    }
}