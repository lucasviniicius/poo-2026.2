package aula15;

public class Aluno {
    private String nome;
    private String RA;
    private double nota1;
    private double nota2;

    public Aluno(String nome, String RA, double nota1, double nota2){
        this.nome = nome;
        this.RA = RA;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRA(){
        return RA;
    }

    public void setRA(String RA){
        this.RA = RA;
    }

    public double getNota1(){
        return nota1;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public double getNota2(){
        return nota2;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public void media(double nota1, double nota2) throws NotaInvalidaException{
        if((nota1 > 10.0 || nota1 < 0.0) || (nota2 > 10.0 || nota2 < 0.0)){
            throw new NotaInvalidaException("Nota inválida.");
        }

        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
    }
}