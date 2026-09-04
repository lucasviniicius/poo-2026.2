package aula7;

public class Conta {
    private String agencia;
    private String numConta;
    private double saldo;

    public Conta(String agencia, String numConta, double saldo){
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getAgencia(){
        return agencia;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public String getNumConta(){
        return numConta;
    }

    public void setNumConta(String numConta){
        this.numConta = numConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void saque(double valor){
        saldo -= valor;

        System.out.println("Saque: " + valor);
        System.out.println("Saldo atual: " + saldo); 
    }

    public void deposito(double valor){
        saldo += valor;

        System.out.println("Depósito: " + valor);
        System.out.println("Saldo atual: " + saldo);
    }
}
