package aula7;

import java.util.Random;

public class Funcionario extends Cliente {
    private String cargo;

    public Funcionario(String nome, int idade, Conta conta, String cargo){
        super(nome, idade, conta);
        this.cargo = cargo;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void investimentoEspecial(double valor){
        Random gerador = new Random();
        int n = gerador.nextInt(0, 100);
        System.out.println(n);

        super.getConta().saque(valor);

        if(n <= 60){
            double retorno = valor * (1 + 50.0 / 100);
            System.out.println("Valor retornado: " + retorno);
            super.getConta().deposito(retorno);
        } else {
            System.out.println("Investimento inválido.");
        }
    }
}
