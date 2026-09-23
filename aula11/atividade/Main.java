package aula11.atividade;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Luiz");
        nomes.add("Lucas");
        nomes.add("Vinicius");
        nomes.add("Matheus");
        nomes.add("Daniel");
        
        for(String nome : nomes){
            System.out.println(nome);
        }

        ArrayList<Double> notas = new ArrayList<>();

        notas.add(8.9);
        notas.add(7.8);
        notas.add(9.5);
        notas.add(10.0);
        notas.add(9.8);

        double soma = 0;

        for(double nota : notas){
            soma += nota;
        }

        double media = soma / notas.size();
        System.out.println("Média: " + media);

        HashMap<String, Double> cadastroProdutos = new HashMap<>();

        cadastroProdutos.put("Computador", 4890.0);
        cadastroProdutos.put("Mouse", 49.99);
        cadastroProdutos.put("Mouse Pad", 25.0);
        cadastroProdutos.put("Monitor", 300.0);
        cadastroProdutos.put("Cabo HDMI", 12.0);

        System.out.println(cadastroProdutos.get("Computador"));

        HashMap<String, String> agendaTelefonica = new HashMap<>();

        agendaTelefonica.put("Lucas", "999999999");
        agendaTelefonica.put("Vinicius", "111111111");

        System.out.println(agendaTelefonica.get("Lucas"));
        System.out.println(agendaTelefonica.get("Vinicius"));

        agendaTelefonica.remove("Lucas");
        agendaTelefonica.remove("Vinicius");

        Aluno a1 = new Aluno(1, "Lucas", 9.9);
        Aluno a2 = new Aluno(2, "Vinicius", 10.0);
        Aluno a3 = new Aluno(2, "Vinicius Silva", 9.8);

        HashMap<Integer, Aluno> alunos = new HashMap<>();

        alunos.put(a1.getMatricula(), a1);
        alunos.put(a2.getMatricula(), a2);

        for(int matricula : alunos.keySet()){
            Aluno aluno = alunos.get(matricula);
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nota: " + aluno.getNota());
        }

        alunos.put(2, a3);

        for(int matricula : alunos.keySet()){
            Aluno aluno = alunos.get(matricula);
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nota: " + aluno.getNota());
        }

        alunos.remove(a1.getMatricula());

        for(int matricula : alunos.keySet()){
            Aluno aluno = alunos.get(matricula);
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nota: " + aluno.getNota());
        }
    }
}
