package aula4;

public class Main {
    public static void main(String[] Args){
        Aluno a1 = new Aluno("a1", 18, 10);
        Aluno a2 = new Aluno("a2", 18, 11);
        Aluno a3 = new Aluno("a3", 18, 12);
        Aluno a4 = new Aluno("a4", 18, 13);

        Aluno[] turma = new Aluno[10];

        turma[0] = a1;
        turma[1] = a2;
        turma[2] = a3;
        turma[3] = a4;

        Sala s1 = new Sala("CC", turma);
        Professor p1 = new Professor("p1", 27, 0, s1);

        boolean[] presencas1 = {true, true, true, true, true, false, true, true, true, false};

        p1.iniciarAula();
        p1.chamada(presencas1);
        p1.terminarAula();

        boolean[] presencas2 = {true, true, true, true, true, false, true, true, true, false};

        p1.iniciarAula();
        p1.chamada(presencas2);
        p1.terminarAula();

    }
}
