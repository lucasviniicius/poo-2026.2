package aula4;

import java.util.Scanner;

public class Professor {
    private String nome;
    private int idade;
    private int matricula;
    private Sala sala;

    public Professor(String nome, int idade, int matricula, Sala sala){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.sala = sala;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public Sala getSala(){
        return sala;
    }

    public void setSala(Sala sala){
        this.sala = sala;
    }

    public void iniciarAula(){
        if(sala.getOcupado() == false){
            sala.alternar();
            System.out.println("Aula iniciada.");
            System.out.println("Nome do professor: " + nome);
            System.out.println("Matrícula: " + matricula);
        } else {
            System.out.println("Sala ocupada.");
        }
    }

    public void chamada(boolean[] presencas){
        int diaDeAula = sala.getDiaDeAula();
        Aluno[] turma = sala.getTurma();

        if(diaDeAula < 0 || diaDeAula >= 10){
            System.out.println("Quantidade de dias de aula inválido.");
            return;
        }

        for(int i = 0; i < turma.length; i++){
            Aluno aluno = turma[i];

            if(aluno != null){
                aluno.getPresenca()[diaDeAula] = presencas[i];
            }
        }

        System.out.println("Chamada realizada do dia: " + diaDeAula);
    }

    public void terminarAula(){
        if(sala.getOcupado() != true){
            System.out.println("Não existe aula na sala " + sala.getNome());
        } else {
            sala.alternar();
            sala.setDiaDeAula(sala.getDiaDeAula() + 1);
            System.out.println("Aula finalizada.");
            System.out.println("Nome do professor: " + nome);
            System.out.println("Matrícula do professor: " + matricula);
        }
    }
}
