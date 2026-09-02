package aula6.atividade;

public class Aula {
    private String nome;
    private int ch;

    public Aula(String nome, int ch){
        this.nome = nome;
        this.ch = ch;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getCH(){
        return ch;
    }

    public void setCH(int ch){
        this.ch = ch;
    }
}
