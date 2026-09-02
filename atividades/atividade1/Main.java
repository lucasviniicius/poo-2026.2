package atividades.atividade1;

public class Main {
    public static void main(String[] Args){
        Livro l1 = new Livro("l1", "Romulo", true, 22);
        Livro l2 = new Livro("l2", "Rodrigo", true, 25);
        Livro l3 = new Livro("l3", "Cecilia", true, 30);
    
        Usuario u1 = new Usuario("Lucas", false);

        Bibliotecario b1 = new Bibliotecario("Bilo", 20, u1);

        u1.alugarLivro(l1);
        u1.alugarLivro(l2);
        u1.alugarLivro(l3);
        u1.devolverLivro(0);

        b1.fecharLocacao();
    }   
}
