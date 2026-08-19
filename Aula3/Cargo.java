public enum Cargo {
    ESTAGIARIO(0.05),
    ANALISTA(0.08),
    GERENTE(0.5),
    DIRETOR(0.8);

    double percentualBonus;

    Cargo(double percentualBonus){
        this.percentualBonus = percentualBonus;
    }

    public double getPercentual(){
        return percentualBonus;
    }

    public void setPercentual(double percentualBonus){
        this.percentualBonus = percentualBonus;
    }
}