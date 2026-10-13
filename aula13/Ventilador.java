package aula13;

public class Ventilador implements Tomada {
    private String marca;
    private String modelo;
    private int tensao;
    private boolean ligado;
    
    public Ventilador(String marca, String modelo, int tensao, boolean ligado){
        this.marca = marca;
        this.modelo = modelo;
        this.tensao = tensao;
        this.ligado = ligado;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getTensao(){
        return tensao;
    }

    public void setTensao(int tensao){
        this.tensao = tensao;
    }

    public boolean getLigado(){
        return ligado;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public void ligar(){
        if(ligado == false){
            ligado = true;
            System.out.println("Ventilador ligado");
        } else {
            System.out.println("Ventilador já está ligado");
        }
    }

    public void desligar(){
        if(ligado == true){
            ligado = false;
            System.out.println("Ventilador desligado");
        } else {
            System.out.println("Ventilador já está desligado");
        }
    }
}
