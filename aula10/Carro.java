package aula10;

public class Carro extends Veiculo{
    private String placa;

    public Carro(
        String marca, 
        boolean estado, 
        double tanque, 
        double consumo,
        double velocidadeAtual,
        double litragemTanque,
        double velocidadeMaxima,
        String placa
    ){
        super(marca, estado, tanque, consumo, velocidadeAtual, litragemTanque, velocidadeMaxima);
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }

    public void setMarca(String placa){
        this.placa = placa;
    }

    @Override 
    public void acelerar(){
        double velocidadeAtual = super.getVelocidadeAtual();
        super.setVelocidadeAtual(velocidadeAtual + 10);
    }

    @Override 
    public void frear(){
        double velocidadeAtual = super.getVelocidadeAtual();
        super.setVelocidadeAtual(velocidadeAtual - 5);
    }

    @Override 
    public void chavear(){
        boolean estado = super.getEstado();

        if(estado){
            while(super.getVelocidadeAtual() > 0){
                frear();
            }
            super.setEstado(false); 
            System.out.println("Carro desligado.");
        } else if(!estado){
            super.setEstado(true);
            System.out.println("Carro ligado.");
        }
    }

    public void corrida(double distancia, double gasolinaEspecial){
        if((gasolinaEspecial + super.getLitragemTanque()) > super.getTanque()){
            System.out.println("Combustível supera o limite do tanque.");
            return;
        }

        double distanciaGasolinaEspecial = gasolinaEspecial * (super.getConsumo() * 2);

        if(distanciaGasolinaEspecial < distancia){
            double distanciaGasolinaNormal = super.getLitragemTanque() * super.getConsumo();
            double novaDistancia = distancia - distanciaGasolinaEspecial;
            double litragemComum = novaDistancia / super.getConsumo();

            if(distanciaGasolinaNormal < novaDistancia){
                System.out.println("Falta " + (novaDistancia - distanciaGasolinaNormal) + " km para ser percorrido.");
                super.setVelocidadeAtual(0);
                super.setLitragemTanque(0);
            } else {
                super.setLitragemTanque(super.getLitragemTanque() - litragemComum);
                System.out.println("Distância percorrida.");
            }
        } else {
            System.out.println("Distância percorrida com gasolina especial.");
        }
    }
}
