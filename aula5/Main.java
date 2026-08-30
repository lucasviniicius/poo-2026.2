package aula5;

public class Main {
    public static void main(String[] Args){
        Produto p1 = new Produto("p1", true, "Produto 1", 50);
        Produto p2 = new Produto("p2", true, "Produto 2", 60); 
        Produto p3 = new Produto("p3", true, "Produto 3", 10); 
        
        Produto[] carrinho = new Produto[10];

        Cliente c1 = new Cliente("c1", true, carrinho);

        System.out.println(c1.adicionarProduto(carrinho, p3));
        System.out.println(c1.adicionarProduto(carrinho, p2));
        System.out.println(c1.adicionarProduto(carrinho, p1));
        System.out.println("Quantidade de Produtos: "+ c1.getQtdProdutos());
        System.out.println(c1.removerProduto(carrinho, 1));
        System.out.println("Quantidade de Produtos: "+ c1.getQtdProdutos());
        System.out.println(c1.comprar(carrinho));
    }
}
