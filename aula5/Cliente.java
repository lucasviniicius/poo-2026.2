package aula5;

public class Cliente {
    private String nome;
    private boolean vip;
    private Produto[] carrinho;
    private int qtdProdutos = 0;

    public Cliente(String nome, boolean vip, Produto[] carrinho){
        this.nome = nome;
        this.vip = vip;
        this.carrinho = carrinho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Produto[] getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Produto[] carrinho) {
        this.carrinho = carrinho;
    }

    public int getQtdProdutos(){
        return qtdProdutos;
    }

    public void setQtdProdutos(int qtdProdutos){
        this.qtdProdutos = qtdProdutos;
    }

    public String adicionarProduto(Produto[] carrinho, Produto novoProduto){
        if(qtdProdutos >= 10){
            return "Carrinho cheio.";
        }

        if(novoProduto.getDisponibilidade() == true){
            carrinho[qtdProdutos] = novoProduto;
            qtdProdutos++;
        }

        return "Produto adicionado.";
    }

    public String removerProduto(Produto[] carrinho, int posicao){
        Produto produto = carrinho[posicao];

        for(int i = posicao; i < qtdProdutos - 1; i++){
            carrinho[i] = carrinho[i + 1];
        }

        carrinho[qtdProdutos - 1] = null;
        qtdProdutos--;

        return "Produto removido.";
    }

    public String comprar(Produto[] carrinho){
        double soma = 0;

        for(int i = 0; i < qtdProdutos; i++){
            soma += carrinho[i].getValor();
        }

        if(vip == true){
            soma = soma * 0.9;
        }

        return "Valor da compra: " + soma;
    }
}
