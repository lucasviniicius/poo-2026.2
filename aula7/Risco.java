package aula7;

public enum Risco {
    BAIXO(85, 2.5),
    MEDIO(45, 30),
    ALTO(2, 100);

    private final int risco;
    private final double rendimento;

    Risco(int risco, double rendimento){
        this.risco = risco;
        this.rendimento = rendimento;
    }

    public int getRisco(){
        return risco;
    }

    public double getRendimento(){
        return rendimento;
    }
}
