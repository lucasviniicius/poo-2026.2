package aula14;

public class Main {
    public static void main(String[] args) {
        Postagem p1 = new Postagem(0, "Lucas", "conteudop1", 0);

        p1.curtir();
        p1.curtir();
        p1.curtir();
        p1.curtir();
        p1.compartilhar();

        System.out.println("====P1====");
        p1.exibir();

        Story s1 = new Story(0, "Mano", "conteudos1", 0);

        s1.curtir();
        s1.curtir();
        s1.visualizar();
        s1.visualizar();
        s1.visualizar();
        s1.visualizar();

        System.out.println("====S1====");
        s1.exibir();
    }
}
