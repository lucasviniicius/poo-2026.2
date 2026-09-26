package aula12;

import java.util.ArrayList;

public class Leitor {
    private String nome;
    private int matricula;
    private int idade;
    private boolean bloqueado;
    private ArrayList<Livro> livrosEmprestados;

    public Leitor(String nome, int matricula, int idade, boolean bloqueado, ArrayList<Livro> livrosEmprestados){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.bloqueado = bloqueado;
        this.livrosEmprestados = livrosEmprestados;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public boolean getBloqueado(){
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado){
        this.bloqueado = bloqueado;
    }

    public ArrayList<Livro> getLivrosEmprestados(){
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados){
        this.livrosEmprestados = livrosEmprestados;
    }

    public void emprestar(Livro livro){
        if(!livro.getDisponivel() || bloqueado){
            System.out.println("Livros não está disponível ou leitor não esta bloqueado.");
            return;
        }

        livrosEmprestados.add(livro);
        livro.setQtdDisponivel(livro.getQtdDisponivel() - 1);
        System.err.println("Livro adicionado.");

        if(livro.getQtdDisponivel() == 0){
            livro.setDisponivel(false);
        }
    }

    public void devolver(int codigo){
        for(Livro livro : livrosEmprestados){
            if(livro.getCodigo() == codigo){
                livrosEmprestados.remove(livro);
                livro.setQtdDisponivel(livro.getQtdDisponivel() + 1);
                livro.setDisponivel(true);
                System.out.println("Livro devolvido com sucesso.");
                return;
            }
        }
    }

    public void consultarEmprestimo(){
        System.out.println("Livros Emprestados: ");

        for(Livro livro : livrosEmprestados){
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
