

public class Main {
    public static void main(String[] Args){
        Ponto pontoA = new Ponto(2, 3);
        Ponto pontoB = new Ponto(6, 6);
        Distancia distancia = new Distancia();
        
        double resultado = distancia.calculaDistancia(pontoA.x, pontoA.y, pontoB.x, pontoB.y);
        System.out.println("Resultado: " + resultado);
    }
}
