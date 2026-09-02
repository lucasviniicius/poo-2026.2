package atividades.atividade1;

public class Bibliotecario {
    private String nome;
    private int registro;
    private Usuario usuarioAtendido;

    public Bibliotecario(String nome, int registro, Usuario usuarioAtendido){
        this.nome = nome;
        this.registro = registro;
        this.usuarioAtendido = usuarioAtendido;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getResgistro(){
        return registro;
    }

    public void setRegistro(int registro){
        this.registro = registro;
    }

    public Usuario getUsuarioAtendido(){
        return usuarioAtendido;
    }

    public void setUsuarioAtendido(Usuario usuarioAtendido){
        this.usuarioAtendido = usuarioAtendido;
    }

    public void fecharLocacao(){
        double somaLivros = 0;

        for(int i = 0; i < usuarioAtendido.getQtdLivrosAlugados(); i++){
            somaLivros += usuarioAtendido.getLivrosAlugados()[i].getPrecoAluguel();
        }

        if(usuarioAtendido.getEstudante()){
            somaLivros = somaLivros * 0.8;
        }

        System.out.println("========CUPOM DE LOCAÇÃO========");
        System.out.println("Nome do bibliotecário: " + nome);
        System.out.println("Registro do bibliotecário: " + registro);
        System.out.println("Livros alugados: ");

        for(int i = 0; i < usuarioAtendido.getQtdLivrosAlugados(); i++){
            System.out.println(usuarioAtendido.getLivrosAlugados()[i].getTitulo());
        }

        System.out.println("Valor final: " + somaLivros);
    }
}
