package aula6;

public class Estudante {
    private String nome;
    private int matricula;
    private double mensalidade;

    public Estudante(String nome, int matricula, double mensalidade) {
        this.nome = nome;
        this.matricula = matricula;
        this.mensalidade = mensalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public void entrarAula(){
        System.out.println("Aluna " + nome + " entrou na sala");
    }

    public void sairAula(){
        System.out.println("Aluno " + nome + " saiu da sala");
    }
}
