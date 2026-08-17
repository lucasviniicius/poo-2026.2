package Aula2;

public class Main {
    public static void main(String[] Args){
        Pessoa p1 = new Pessoa("Lucas", 18, 62.0, "masculino");
        Pessoa p2 = new Pessoa("Maria", 22, 78.3, "feminino");
        Relacionamento relacionamento = new Relacionamento();
        /*System.out.println(p1);
        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p1.peso);*/

        p1.apresentacao();
        p2.apresentacao();
        relacionamento.conhecer(p1, p2);
    }
}
