package atividades.atividade1;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;
    private double precoAluguel;

    public Livro(String titulo, String autor, boolean disponivel, double precoAluguel){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
        this.precoAluguel = precoAluguel;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public double getPrecoAluguel(){
        return precoAluguel;
    }

    public void setPrecoAluguel(double precoAluguel){
        this.precoAluguel = precoAluguel;
    }
}
