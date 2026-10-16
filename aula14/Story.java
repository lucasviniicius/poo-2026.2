package aula14;

public class Story extends Publicacao implements Visualizavel {
    private int visualizacoes;

    public Story(int visualizacoes, String autor, String conteudo, int curtidas){
        super(autor, conteudo, curtidas);
        this.visualizacoes = visualizacoes;
    }

    public int getVisualizacoes(){
        return visualizacoes;
    }

    public void setVisualizacoes(int visualizacoes){
        this.visualizacoes = visualizacoes;
    }

    public void exibir(){
        System.out.println("====EXIBIÇÃO====");
        System.out.println("Autor: " + super.getAutor());
        System.out.println("Conteúdo: " + super.getConteudo());
        System.out.println("Número de Curtidas: " + super.getCurtidas());
        System.out.println("Número de Visualizações: " + visualizacoes);
    }

    public void visualizar(){
        visualizacoes++;
        System.out.println("Visualizou");
    }
}
