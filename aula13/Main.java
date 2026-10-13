package aula13;

public class Main {
    public static void main(String[] args) {
        Ventilador v1 = new Ventilador("BMW", "Forte", 220, false);

        v1.ligar();
        v1.ligar();
        v1.desligar();   
        v1.desligar(); 
    }
}
