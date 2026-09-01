package aula6;

public class EstudanteBolsista extends Estudante {
    private double desconto;

    public EstudanteBolsista(String nome, int matricula, double mensalidade, double desconto){
        super(nome, matricula, mensalidade);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void calcularDesconto(){
        double novaMensalidade = super.getMensalidade() - (super.getMensalidade() * desconto);
        System.out.println("Valor da mensalidade com desconto: " + novaMensalidade);
    }
}
