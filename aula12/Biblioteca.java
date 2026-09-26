package aula12;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<Livro> livros;
    private ArrayList<Leitor> leitores;

    public Biblioteca(String nome, ArrayList<Livro> livros, ArrayList<Leitor> leitores){
        this.nome = nome;
        this.livros = livros;
        this.leitores = leitores;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public ArrayList<Livro> getLivros(){
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros){
        this.livros = livros;
    }

    public ArrayList<Leitor> getLeitores(){
        return leitores;
    }

    public void setLeitores(ArrayList<Leitor> leitores){
        this.leitores = leitores;
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
        System.out.println("Livro adicionado.");
    }

    public void adicionarLeitor(Leitor leitor){
        leitores.add(leitor);
        System.out.println("Leitor adicionado.");
    }

    public void buscarLivro(int codigo){
        System.out.println("Livro buscado: ");

        for(Livro livro : livros){
            if(livro.getCodigo() == codigo){
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Código: " + livro.getCodigo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Quantidade Disponível: " + livro.getQtdDisponivel());
                System.out.println("Valor da Multa: " + livro.getValorMultaDiaria());
                System.out.println("Disponível: " + livro.getDisponivel());
            }
        }
    }

    public void buscarLeitor(int matricula){
        System.out.println("Leitor buscado: ");

        for(Leitor leitor : leitores){
            if(leitor.getMatricula() == matricula){
                System.out.println("Nome: " + leitor.getNome());
                System.out.println("Matrícula: " + leitor.getMatricula());
                System.out.println("Idade: " + leitor.getIdade());
                System.out.println("Bloqueado: " + leitor.getBloqueado());
                System.out.println("Livros Emprestados: ");
                for(Livro livro : leitor.getLivrosEmprestados()){
                    System.out.println();
                    System.out.println("Título: " + livro.getTitulo());
                    System.out.println("Código: " + livro.getCodigo());
                    System.out.println("Autor: " + livro.getAutor());
                    System.out.println("Quantidade Disponível: " + livro.getQtdDisponivel());
                    System.out.println("Valor da Multa: " + livro.getValorMultaDiaria());
                    System.out.println("Disponível: " + livro.getDisponivel());
                }
            }
        }
    }

    public void listarLivrosDisponiveis(){
        System.out.println("Livros disponíveis: ");

        for(Livro livro : livros){
            if(livro.getDisponivel()){
                System.out.println();
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Código: " + livro.getCodigo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Quantidade Disponível: " + livro.getQtdDisponivel());
                System.out.println("Valor da Multa: " + livro.getValorMultaDiaria());
                System.out.println("Disponível: " + livro.getDisponivel());
            }
        }
    }
}
