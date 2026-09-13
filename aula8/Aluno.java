package aula8;

class Aluno {
    private String nome;
    private int idade;
    private int qtdDisciplina;
    private double valorDisciplina;

    public Aluno(String nome, int idade, int qtdDisciplina, double valorDisciplina){
        this.nome = nome;
        this.idade = idade;
        this.qtdDisciplina = qtdDisciplina;
        this.valorDisciplina = valorDisciplina;
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

    public int getQtdDisciplina(){
        return qtdDisciplina;
    }

    public void setQtdDisciplina(int qtdDisciplina){
        this.qtdDisciplina = qtdDisciplina;
    }

    public double getValorDisciplina(){
        return valorDisciplina;
    }

    public void setValorDisciplina(double valorDisciplina){
        this.valorDisciplina = valorDisciplina;
    }

    public void mensalidade(){
        double valorTotal = valorDisciplina * qtdDisciplina;
        System.out.println("Aluno: " + nome);
        System.out.println("Mensalidade: " + valorTotal);
    }
}