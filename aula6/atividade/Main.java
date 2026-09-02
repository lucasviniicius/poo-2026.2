package aula6.atividade;

public class Main {
    public static void main(String[] Args){
        Aula a1 = new Aula("Aula de poo", 30);
        Aula a2 = new Aula("Aula de metodos", 50);
        Aula a3 = new Aula("Aula de dados", 40);
        
        Aula aulaP1[] = new Aula[3];
        aulaP1[0] = a1;
        aulaP1[1] = a2;
        aulaP1[2] = a3;

        Professor p1 = new Professor("Luiz", 1010, aulaP1);
        p1.calcularCHTotal();

        Aula aulaC1[] = new Aula[3];
        aulaC1[0] = a1;
        aulaC1[1] = a2;
        aulaC1[2] = a3;

        Atendimento at1 = new Atendimento(2, 8);
        Atendimento at2 = new Atendimento(3, 10);
        Atendimento at3 = new Atendimento(4, 12);
        

        Atendimento atendimentoC1[] = new Atendimento[3];
        atendimentoC1[0] = at1;
        atendimentoC1[1] = at2;
        atendimentoC1[2] = at3;

        Coordenador c1 = new Coordenador("Wilmer", 1000, aulaC1, "Tecnologia", atendimentoC1);
        c1.somaHorasAtendimento();
    }
}
