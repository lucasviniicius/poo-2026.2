package aula6.atividade;

public class Atendimento {
    private int dia;
    private int horario;

    public Atendimento(int dia, int horario){
        this.dia = dia;
        this.horario = horario;
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getHorario(){
        return horario;
    }

    public void setHorario(int horario){
        this.horario = horario;
    }
}
