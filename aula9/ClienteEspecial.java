package aula9;

public class ClienteEspecial extends Cliente {
    private int pontos;
    private double saldoCompras;

    public ClienteEspecial(String nome, int idade, String cpf, String endereco, boolean bomCliente, Item carrinhoCompras[], int qtdItems, int pontos, double saldoCompras){
        super(nome, idade, cpf, endereco, bomCliente, carrinhoCompras, qtdItems);
        this.pontos = pontos;
        this.saldoCompras = saldoCompras;
    }

    public int getPontos(){
        return pontos;
    }

    public void setPontos(int pontos){
        this.pontos = pontos;
    }

    public double getSaldoCompras(){
        return saldoCompras;
    }

    public void setSaldoCompras(double saldoCompras){
        this.saldoCompras = saldoCompras;
    }

    public double comprar(){
        double valorGasto = super.comprar();

        double valorEconomizado = valorGasto * 0.05;
        double valorTotalDesconto = valorGasto - valorEconomizado;

        saldoCompras += valorEconomizado;
        if(saldoCompras >= 100){
            pontos += 5;
            saldoCompras -= 100;
        }

        System.out.println("----compras----");
        System.out.println("Valor total cliente especial: " + valorTotalDesconto);
        return valorTotalDesconto;
    }

    public void comprar(Item item, int pontosItem){
        if(pontos >= pontosItem){
            pontos -= pontosItem;

            int estoque = item.getQtdEstoque();
            item.setQtdEstoque(estoque - 1);

            System.out.println("----compras----");
            System.out.println("Produto comprado: " + item.getNome());
        } else {
            System.out.println("Quantidade de pontos não é suficiente.");
        }
    }
}
