package aula12;

public class Livro {
    private String titulo;
    private int codigo;
    private String autor;
    private int qtdDisponivel;
    private double valorMultaDiaria;
    private boolean disponivel;  

    public Livro(String titulo, int codigo, String autor, int qtdDisponivel, double valorMultaDiaria, boolean disponivel){
        this.titulo = titulo;
        this.codigo = codigo;
        this.autor = autor;
        this.qtdDisponivel = qtdDisponivel;
        this.valorMultaDiaria = valorMultaDiaria;
        this.disponivel = disponivel;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getQtdDisponivel(){
        return qtdDisponivel;
    }

    public void setQtdDisponivel(int qtdDisponivel){
        this.qtdDisponivel = qtdDisponivel;
    }

    public double getValorMultaDiaria(){
        return valorMultaDiaria;
    }

    public void setValorMultaDiaria(double valorMultaDiaria){
        this.valorMultaDiaria = valorMultaDiaria;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }
}