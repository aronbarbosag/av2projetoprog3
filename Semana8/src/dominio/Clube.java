package dominio;

public class Clube {
    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Clube(String nome, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public int calcularTotalJogos() {
        return vitorias + derrotas + empates;
    }

    public int calcularTotalPontos() {
        return (vitorias * 3) + empates;
    }
    public String getNome() {
        return nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Clube: " + nome);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Empates: " + empates);
        System.out.println("Total de Jogos: " + calcularTotalJogos());
        System.out.println("Total de Pontos: " + calcularTotalPontos());
    }
}