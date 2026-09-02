package aula6.atividade;

public class Professor {
    private String nome;
    private int matricula;
    private Aula aula[];
    
    public Professor(String nome, int matricula, Aula aula[]){
        this.nome = nome;
        this.matricula = matricula;
        this.aula = aula;
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

    public Aula[] getAula(){
        return aula;
    }

    public void setAula(Aula aula[]){
        this.aula = aula;
    }

    public void calcularCHTotal(){
        int soma = 0;

        for(int i = 0; i < aula.length; i++){
            soma += aula[i].getCH();
        }

        System.out.println("Carga Horária Total de Aulas: " + soma);
    }
}
