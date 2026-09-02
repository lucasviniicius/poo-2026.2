package atividades.atividade1;

public class Usuario {
    private String nome;
    private boolean estudante;
    private int qtdLivrosAlugados;
    private Livro livrosAlugados[] = new Livro[5];

    public Usuario(String nome, boolean estudante){
        this.nome = nome;
        this.estudante = estudante;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public boolean getEstudante(){
        return estudante;
    }

    public void setEstudante(boolean estudante){
        this.estudante = estudante;
    }

    public Livro[] getLivrosAlugados(){
        return livrosAlugados;
    }

    public void setLivrosAlugados(Livro[] livrosAlugados){
        this.livrosAlugados = livrosAlugados;
    }

    public int getQtdLivrosAlugados() {
        return qtdLivrosAlugados;
    }

    public void setQtdLivrosAlugados(int qtdLivrosAlugados) {
        this.qtdLivrosAlugados = qtdLivrosAlugados;
    }

    public void alugarLivro(Livro livro){
        if(livro.getDisponivel() && qtdLivrosAlugados <= 5){
            livrosAlugados[qtdLivrosAlugados] = livro;
            qtdLivrosAlugados++;
            livro.setDisponivel(false);
            System.out.println("Livro alugado para " + nome);
        } else {
            System.out.println("Não é possível alugar esse livro.");
        }
    }

    public void devolverLivro(int posicao){
        Livro livro = livrosAlugados[posicao];

        for(int i = 0; i < qtdLivrosAlugados; i++){
            livrosAlugados[i] = livrosAlugados[i + 1];
        }

        livro.setDisponivel(true);
        livrosAlugados[qtdLivrosAlugados - 1] = null;
        qtdLivrosAlugados--;

        System.out.println(livro.getTitulo() + " removido com sucesso");
    }
}
