package aula15;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Lucas", "123456", 11, 9);

        try {
            a1.media(a1.getNota1(), a1.getNota2());
        } catch (NotaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }
}
