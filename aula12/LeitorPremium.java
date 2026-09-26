package aula12;

import java.util.ArrayList;

public class LeitorPremium extends Leitor {
    private int pontos;
    private int totalEmprestimos;

    public LeitorPremium(String nome, int matricula, int idade, boolean bloqueado, ArrayList<Livro> livrosEmprestados, int pontos, int totalEmprestimos){
        super(nome, matricula, idade, bloqueado, livrosEmprestados);
        this.pontos = pontos;
        this.totalEmprestimos = totalEmprestimos;
    }

    public int getPontos(){
        return pontos;
    }

    public void setPontos(int pontos){
        this.pontos = pontos;
    }

    public int getTotalEmprestimos(){
        return totalEmprestimos;
    }

    public void setTotalEmprestimos(int totalEmprestimos){
        this.totalEmprestimos = totalEmprestimos;
    }

    @Override 
    public void emprestar(Livro livro){
        if(!livro.getDisponivel() || super.getBloqueado()){
            System.out.println("Livros não está disponível ou leitor não esta bloqueado.");
            return;
        }

        super.getLivrosEmprestados().add(livro);
        livro.setQtdDisponivel(livro.getQtdDisponivel() - 1);
        totalEmprestimos++;
        if(totalEmprestimos % 5 == 0){
            pontos += 10;
            System.out.println("Parabéns, você ganhou 10 pontos.");
        }
        System.out.println("Livro adicionado.");

        if(livro.getQtdDisponivel() == 0){
            livro.setDisponivel(false);
        }
    }

    public void emprestar(Livro livro, int pontosNecessarios){
        if(!livro.getDisponivel() || super.getBloqueado()){
            System.out.println("Livros não está disponível ou leitor não esta bloqueado.");
            return;
        }

        if(pontos < pontosNecessarios){
            System.out.println("Quantidade de pontos não é suficiente.");
            return;
        }

        super.getLivrosEmprestados().add(livro);
        livro.setQtdDisponivel(livro.getQtdDisponivel() - 1);
        totalEmprestimos++;
        pontos -= pontosNecessarios;

        if (totalEmprestimos % 5 == 0) {
            pontos += 10;
            System.out.println("Parabéns, você ganhou 10 pontos.");
        }

        if (livro.getQtdDisponivel() == 0) {
            livro.setDisponivel(false);
        }

        System.out.println("Empréstimo especial realizado com sucesso.");
    }
}
