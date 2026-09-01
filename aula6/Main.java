package aula6;

public class Main {
    public static void main(String[] Args){
        Estudante e = new Estudante("Luiz", 2020, 587.9);
        e.entrarAula();
        e.sairAula();

        EstudanteBolsista eb = new EstudanteBolsista("Lucas", 1010, 587.9, 0.5);
        eb.entrarAula();
        eb.sairAula();
        eb.calcularDesconto();
    }
}
