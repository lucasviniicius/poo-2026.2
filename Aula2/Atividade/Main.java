package Aula2.Atividade;

public class Main {
    public static void main(String[] Args){
        PontoA pontoA = new PontoA(2, 3);
        PontoB pontoB = new PontoB(6, 6);
        Distancia distancia = new Distancia();
        
        double resultado = distancia.calculaDistancia(pontoA.x, pontoA.y, pontoB.x, pontoB.y);
        System.out.println("Resultado: " + resultado);
    }
}
