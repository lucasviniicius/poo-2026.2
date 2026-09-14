package aula9;

public class Funcionario extends ClienteEspecial {
    private String setor;
    private int id;
    private double salario;

    public Funcionario(
            String nome,
            int idade,
            String cpf,
            String endereco,
            boolean bomCliente,
            Item carrinhoCompras[],
            int qtdItems,
            int pontos,
            double saldoCompras,
            String setor,
            int id,
            double salario) {

        super(
                nome,
                idade,
                cpf,
                endereco,
                bomCliente,
                carrinhoCompras,
                qtdItems,
                pontos,
                saldoCompras
        );

        this.setor = setor;
        this.id = id;
        this.salario = salario;
    }

    public void renovarEstoque(Item item, int qtd){
        int estoque = item.getQtdEstoque();
        item.setQtdEstoque(estoque + qtd);
    }

    public void bloquearItem(Item item, boolean indisponivel){
        item.setDisponibilidade(!indisponivel);
    }
}
