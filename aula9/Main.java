package aula9;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Notebook", 101, 3500.00, 10, true);
        Item item2 = new Item("Mouse Gamer", 102, 150.00, 20, true);
        Item item3 = new Item("Teclado Mecânico", 103, 300.00, 15, true);

        System.out.println("=== TESTE DA CLASSE CLIENTE ESPECIAL ===");
        Item[] carrinhoEspecial = new Item[100];
        ClienteEspecial clienteEsp = new ClienteEspecial(
            "Maria Silva", 28, "123.456.789-00", "Rua A, 123", 
            true, carrinhoEspecial, 0, 10, 0.0
        );

        // Adicionando itens ao carrinho
        clienteEsp.adicionar(item1);
        clienteEsp.adicionar(item2);

        // Realizando a compra com desconto de 5% da ClienteEspecial
        clienteEsp.comprar();

        // Comprando item usando pontos acumuldados
        System.out.println("\nTentando comprar com pontos (Pontos atuais: " + clienteEsp.getPontos() + "):");
        clienteEsp.comprar(item3, 5); // Custa 5 pontos

        System.out.println("\n=== TESTE DA CLASSE FUNCIONARIO ===");
        Item[] carrinhoFunc = new Item[100];
        Funcionario func = new Funcionario(
            "Carlos Souza", 35, "987.654.321-11", "Av. Central, 456", 
            true, carrinhoFunc, 0, 50, 0.0, 
            "TI", 1001, 4500.00
        );

        // Testando métodos exclusivos do Funcionário
        System.out.println("Estoque antigo do Notebook: " + item1.getQtdEstoque());
        func.renovarEstoque(item1, 5);
        System.out.println("Estoque atualizado do Notebook: " + item1.getQtdEstoque());

        System.out.println("Disponibilidade antiga do Mouse: " + item2.disponibilidade());
        func.bloquearItem(item2, true); // Bloqueia o item
        System.out.println("Disponibilidade nova do Mouse: " + item2.disponibilidade());
    }
}
