package aula6.atividade;

public class Coordenador extends Professor {
    private String nucleo;
    private Atendimento atendimentos[];

    public Coordenador(String nome, int matricula, Aula aula[], String nucleo, Atendimento atendimentos[]){
        super(nome, matricula, aula);
        this.nucleo = nucleo;
        this.atendimentos = atendimentos;
    }

    public String getNucleo(){
        return nucleo;
    }

    public void setNucleo(String nucleo){
        this.nucleo = nucleo;
    }

    public Atendimento[] getAtendimentos(){
        return atendimentos;
    }

    public void setAtendimentos(Atendimento atendimentos[]){
        this.atendimentos = atendimentos;
    }

    public void somaHorasAtendimento(){
        int soma = 0;

        for(int i = 0; i < atendimentos.length; i++){
            soma += atendimentos[i].getHorario();
        }

        System.out.println("Soma das horas de atendimentos do cordenador " + super.getNome() + ": " + soma);
    }
}
