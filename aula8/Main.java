package aula8;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Lucas", 18, 6, 62.3);
        Monitor m1 = new Monitor("Marcos", 18, 6, 62.3, 0.3);

        a1.mensalidade();
        m1.mensalidade();
        m1.mensalidade(0.50);
    }
}
