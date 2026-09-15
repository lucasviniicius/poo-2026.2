package aula10;

public class Aviao extends Veiculo {
    private boolean voando;

    public Aviao(
        String marca, 
        boolean estado, 
        double tanque, 
        double consumo,
        double velocidadeAtual,
        double litragemTanque,
        double velocidadeMaxima,
        boolean voando
    ) {
        super(marca, estado, tanque, consumo, velocidadeAtual, litragemTanque, velocidadeMaxima);
        this.voando = voando;
    }

    public boolean getVoando(){
        return voando;
    }

    public void setVoando(boolean voando){
        this.voando = voando;
    }

    public void voar(){
        if(super.getVelocidadeAtual() >= 200){
            voando = true;
            System.out.println("Avião voando.");
        } else {
            System.out.println("Velocidade insuficiente para voar.");
        }
    }

    @Override 
    public void acelerar(){
        if(voando){
            super.setVelocidadeAtual(getVelocidadeAtual() + 20);
            System.out.println("Avião voando.");
        } else {
            super.acelerar();
            System.out.println("Avião está pousado.");
        }
    }

    @Override 
    public void frear(){
        if(voando){
            super.setVelocidadeAtual(getVelocidadeAtual() - 10);
            
            if(super.getVelocidadeAtual() < 200){
                voando = false;
                System.out.println("Avião pousando.");
            }
        } else {
            super.frear();
            System.out.println("Avião está pousado.");
        }
    }

    @Override 
    public void chavear(){
        if(super.getEstado()){
            if(super.getVelocidadeAtual() > 0 || voando){
                System.out.println("Não pode desligar o avião em movimento.");
            } else {
                super.setEstado(false);
                System.out.println("Avião desligado.");
            }
        } else {
            super.setEstado(true);
            System.out.println("Avião ligado.");
        }
    }

    @Override 
    public void corrida(double distancia){
        double litragemNecessaria = distancia / super.getConsumo();

        if(litragemNecessaria > super.getLitragemTanque()){
            voando = false;
            super.setEstado(false);
            super.setVelocidadeAtual(0);
            super.setLitragemTanque(0);
            System.out.println("Pouso emergencial.");
        } else {
            super.setLitragemTanque(super.getLitragemTanque() - litragemNecessaria);
            System.out.println("Voo bem sucedido.");
        }
    }
}
