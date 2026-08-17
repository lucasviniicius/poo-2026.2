package Aula2;

public class Relacionamento {
    public void conhecer(Pessoa p1, Pessoa p2){
        p1.apresentacao();
        p2.apresentacao();
        System.out.println("Agora " + p1.nome + " e " + p2.nome + " se conhecem!");
    }
}
