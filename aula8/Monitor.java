package aula8;

public class Monitor extends Aluno {
    private double desconto;

    public Monitor(String nome, int idade, int qtdDisciplina, double valorDisciplina, double desconto){
        super(nome, idade, qtdDisciplina, valorDisciplina);
        this.desconto = desconto;
    }

    public double getDesconto(){
        return desconto;
    }

    public void setDesconto(double desconto){
        this.desconto = desconto;
    }

    public void mensalidade(){
        double valorTotal = getValorDisciplina() * getQtdDisciplina() * (1 - desconto);
        System.out.println("Monitor: " + getNome());
        System.out.println("Mensalidade: " + valorTotal);
    }

    public void mensalidade(double novoDesconto){
        double valorTotal = getValorDisciplina() * getQtdDisciplina() * (1 - novoDesconto);
        System.out.println("Monitor: " + getNome());
        System.out.println("Mensalidade: " + valorTotal);
    }
}
