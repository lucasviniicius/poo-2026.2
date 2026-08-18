public class Distancia {
    public double calculaDistancia(double x1, double y1, double x2, double y2){
        double distancia = Math.sqrt(
            Math.pow(x2 - x1, 2) +
            Math.pow(y2 - y1, 2)
        );

        return distancia;
    }
}
