package aula9;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private boolean bomCliente;
    private Item carrinhoCompras[];
    private int qtdItems;

    public Cliente(String nome, int idade, String cpf, String endereco, boolean bomCliente, Item carrinhoCompras[], int qtdItems){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.bomCliente = bomCliente;
        this.carrinhoCompras = carrinhoCompras;
        this.qtdItems = qtdItems;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean getBomCliente() {
        return bomCliente;
    }

    public void setBomCliente(boolean bomCliente) {
        this.bomCliente = bomCliente;
    }

    public Item[] getCarrinhoCompras() {
        return carrinhoCompras;
    }

    public void setCarrinhoCompras(Item carrinhoCompras[]) {
        this.carrinhoCompras = carrinhoCompras;
    }

    public int getQtdItems(){
        return qtdItems;
    }

    public void setItems(int qtdItems){
        this.qtdItems = qtdItems;
    }

    public void adicionar(Item item){
        carrinhoCompras[qtdItems] = item;
        qtdItems++;
        System.out.println("----adiciona----");
        System.out.println("Item adicionado");
    }

    public void cancelar(int codigo){
        int pos = 0;

        for(int i = 0; i < qtdItems; i++){
            if(codigo == carrinhoCompras[i].getCodigo()){
                pos = i;
            }
        }

        for(int i = pos; i < qtdItems - 1; i++){
            carrinhoCompras[i] = carrinhoCompras[i + 1];
        }

        if(pos == 0){
            System.out.println("Item não encontrado.");
        }
        
        carrinhoCompras[qtdItems - 1] = null;
        qtdItems--;
        System.out.println("----remove----");
    }

    public double comprar(){
        double soma = 0;

        for(int i = 0; i < qtdItems; i++){
            soma += carrinhoCompras[i].getValor();
            int estoque = carrinhoCompras[i].getQtdEstoque();
            carrinhoCompras[i].setQtdEstoque(estoque - 1);
        }

        double mediaGasto = soma / qtdItems;

        System.out.println("----compras----");
        System.out.println("Valor total: " + soma);
        System.out.println("Valor por item: " + mediaGasto);
        return soma;
    }
}
