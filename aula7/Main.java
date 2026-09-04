package aula7;

public class Main {
    public static void main(String[] args) {
        System.out.println("====LUCAS====");
        Conta c1 = new Conta("10", "1010", 0.0);
        Cliente lucas = new Cliente("lucas", 18, c1);

        c1.deposito(1000.00);

        Investimento i1 = new Investimento(c1.getAgencia(), c1.getNumConta(), c1.getSaldo(), Risco.BAIXO);
        i1.investir(100.00);

        System.out.println("====JULIA====");
        Conta c2 = new Conta("20", "2020", 0.0);
        Cliente julia = new Cliente("julia", 18, c2);

        c2.deposito(1000);

        Investimento i2 = new Investimento(c2.getAgencia(), c2.getNumConta(), c2.getSaldo(), Risco.MEDIO);
        i2.investir(100);

        System.out.println("====LUIZA====");
        Conta c3 = new Conta("30", "3030", 0.0);
        Cliente luiza = new Cliente("luiza", 18, c3);

        c3.deposito(1000);

        Investimento i3 = new Investimento(c3.getAgencia(), c3.getNumConta(), c3.getSaldo(), Risco.ALTO);
        i3.investir(100);

        System.out.println("====JOÃO====");
        Conta c4 = new Conta("40", "4040", 0.0);
        Funcionario joao = new Funcionario("joão", 27, c4, "Atendente");

        c4.deposito(1000.00);

        joao.investimentoEspecial(100.00);
    }
}
