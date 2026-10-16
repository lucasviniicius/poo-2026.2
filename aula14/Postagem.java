package aula14;

public class Postagem extends Publicacao implements Compartilhavel {
    private int qtdCompartilhamentos;

    public Postagem(int qtdCompartilhamentos, String autor, String conteudo, int curtidas){
        super(autor, conteudo, curtidas);
        this.qtdCompartilhamentos = qtdCompartilhamentos;
    }

    public int getQtdCompartilhamentos(){
        return qtdCompartilhamentos;
    }

    public void setQtdCompartilhamentos(int qtdCompartilhamentos){
        this.qtdCompartilhamentos = qtdCompartilhamentos;
    }

    public void exibir(){
        System.out.println("====EXIBIÇÃO====");
        System.out.println("Autor: " + super.getAutor());
        System.out.println("Conteúdo: " + super.getConteudo());
        System.out.println("Número de Curtidas: " + super.getCurtidas());
        System.out.println("Número de Compartilhamentos: " + qtdCompartilhamentos);
    }

    public void compartilhar(){
        qtdCompartilhamentos++;
        System.out.println("Compartilhou");
    }
}
