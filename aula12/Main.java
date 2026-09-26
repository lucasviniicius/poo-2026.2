package aula12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Leitor> leitores = new ArrayList<>();
        ArrayList<Livro> livrosEmprestadosComum = new ArrayList<>();
        ArrayList<Livro> livrosEmprestadosPremium = new ArrayList<>();
        ArrayList<Livro> livrosEmprestadosBibliotecario = new ArrayList<>();

        System.out.println("=== CRIANDO A BIBLIOTECA ===");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", livros, leitores);

        Livro l1 = new Livro("L1", 1, "Lucas", 5, 25.0, true);
        Livro l2 = new Livro("L2", 2, "Vinícius", 5, 25.0, true);

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);

        System.out.println("--- Livros Disponíveis ---");
        biblioteca.listarLivrosDisponiveis();

        Leitor leitorComum = new Leitor("Leitor em Comum", 11, 18, false, livrosEmprestadosComum);
        LeitorPremium leitorPremium = new LeitorPremium("Leitor Premium", 22, 18, false, livrosEmprestadosPremium, 0, 0);
        Bibliotecario bibliotecario = new Bibliotecario("Bibliotecario", 33, 18, false, livrosEmprestadosBibliotecario, 50, 10, "TI", 501, 4500.0);

        biblioteca.adicionarLeitor(leitorComum);
        biblioteca.adicionarLeitor(leitorPremium);
        biblioteca.adicionarLeitor(bibliotecario);

        System.out.println("=== TESTANDO EMPRÉSTIMO COMUM");
        leitorComum.emprestar(l2);
        leitorComum.consultarEmprestimo();

        System.out.println("--- Lista de Disponíveis Após Empréstimo ---");
        biblioteca.listarLivrosDisponiveis();

        System.out.println("=== TESTANDO LEITOR PREMIUM E ACÚMULO DE PONTOS ===");
        for(int i = 0; i < 5; i++){
            leitorPremium.emprestar(l1);
        }
        System.out.println("Pontos acumulados após 5 empréstimos: " + leitorPremium.getPontos());

        System.out.println("--- Emprestando livro utilizando 10 pontos: ");
        leitorPremium.emprestar(l2, 10);

        System.out.println("=== TESTANDO AÇÕES DO BIBLIOTECÁRIO ===");
        System.out.println("--- Bibliotecário renovando estoque do livro 'Estruturas de Dados': ");
        bibliotecario.renovarEstoque(l2, 3);
        bibliotecario.liberarLivro(l2);

        System.out.println("--- Livros Disponíveis Após a Liberação do Bibliotecário ---");
        biblioteca.listarLivrosDisponiveis();

        System.out.println("=== TESTANDO DEVOLUÇÃO ===");
        leitorComum.devolver(2);
        System.out.println("Empréstimos atuais de " + leitorComum.getNome() + ":");
        leitorComum.consultarEmprestimo();
    }
}
