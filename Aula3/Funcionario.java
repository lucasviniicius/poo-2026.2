package aula3;

public class Funcionario {
    private String nome;
    private double salario;
    private Cargo cargo;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public Cargo setCargo(){
        return cargo;
    }

    public void setCargo(Cargo cargo){
        this.cargo = cargo;
    }

    public Funcionario(String nome, double salario, Cargo cargo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double calculaSalarioBonus(){
        double valor = salario + (salario * cargo.getPercentual());
        return valor;
    }
}
