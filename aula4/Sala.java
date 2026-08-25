package aula4;

public class Sala {
    private String nome;
    private boolean ocupado;
    private Aluno[] turma;
    private int diaDeAula = 0;

    public Sala(String nome, Aluno[] turma){
        this.nome = nome;
        this.turma = turma;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public boolean getOcupado(){
        return ocupado;
    }

    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }

    public Aluno[] getTurma(){
        return turma;
    }

    public void setTurma(Aluno[] turma){
        this.turma = turma;
    }

    public int getDiaDeAula(){
        return diaDeAula;
    }

    public void setDiaDeAula(int diaDeAula){
        this.diaDeAula = diaDeAula;
    }

    public void alternar(){
        if(ocupado){
            ocupado = false;
        } else {
            ocupado = true;
        }
    }
}
