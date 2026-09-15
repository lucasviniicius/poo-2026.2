package aula10;

class Veiculo {
    private String marca;
    private boolean estado;
    private double tanque;
    private double consumo;
    private double velocidadeAtual;
    private double litragemTanque;
    private double velocidadeMaxima;

    public Veiculo(String marca, boolean estado, double tanque, double consumo, double velocidadeAtual, double litragemTanque, double velocidadeMaxima){
        this.marca = marca;
        this.estado = estado;
        this.tanque = tanque;
        this.consumo = consumo;
        this.velocidadeAtual = velocidadeAtual;
        this.litragemTanque = litragemTanque;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public boolean getEstado(){
        return estado;
    }

    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public double getTanque(){
        return tanque;
    }

    public void setTanque(double tanque){
        this.tanque = tanque;
    }

    public double getConsumo(){
        return consumo;
    }

    public void setConsumo(double consumo){
        this.consumo = consumo;
    }

    public double getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getLitragemTanque(){
        return litragemTanque;
    }

    public void setLitragemTanque(double litragemTanque){
        this.litragemTanque = litragemTanque;
    }

    public double getVelocidadeMaxima(){
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void chavear(){
        if(estado){
            estado = false;
            System.out.println("Carro desligado.");
        } else {
            estado = true;
            System.out.println("Carro ligado.");
        }
    }

    public void acelerar(){
        if(velocidadeAtual < velocidadeMaxima){
            velocidadeAtual += 1;
        } else {
            System.out.println("Velocidade máxima atingida");
        }
    }

    public void frear(){
        if(velocidadeAtual > 0){
            velocidadeAtual -= 1;
        } else {
            System.out.println("Mínimo de velocidade atingido.");
        }
    }

    public void corrida(double distancia){
        double litragemNecessaria = distancia / consumo;

        if(litragemNecessaria > litragemTanque){
            double distanciaMaxima = litragemTanque * consumo;
            System.out.println("Falta " + (distancia - distanciaMaxima) + " km para ser percorrido.");
            velocidadeAtual = 0;
            litragemTanque = 0;
        } else {
            litragemTanque -= litragemNecessaria;
            System.out.println("Distância percorrida.");
        }
    }
}