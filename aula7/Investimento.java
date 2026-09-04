package aula7;

import java.util.Random;

public class Investimento extends Conta {
    private Risco risco;

    public Investimento(String agencia, String numConta, double saldo, Risco risco){
        super(agencia, numConta, saldo);
        this.risco = risco;
    }

    public Risco getRisco(){
        return risco;
    }

    public void setRisco(Risco risco){
        this.risco = risco;
    }

    public void investir(double valor){
        Random gerador = new Random();
        int n = gerador.nextInt(0, 100);
        System.out.println(n);

        saque(valor);
        
        if(n <= risco.getRisco()){
            double retorno = valor * (1 + risco.getRendimento() / 100);
            System.out.println("Valor retornado: " + retorno);
            deposito(retorno);
        } else {
            System.out.println("Investimento inválido.");
        }
    }
}
