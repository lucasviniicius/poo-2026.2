package aula10;

class Main{
    public static void main(String[] args) {
       System.out.println("=== TESTANDO A CLASSE CARRO ===");
        Carro carro = new Carro("Toyota", false, 50.0, 10.0, 0.0, 30.0, 180.0, "ABC-1234");

        // 1. Ligar o carro
        carro.chavear(); // Carro ligado

        // 2. Testar aceleração de Carro (+10 km/h por chamada)
        carro.acelerar();
        carro.acelerar();
        System.out.println("Velocidade atual do carro: " + carro.getVelocidadeAtual() + " km/h"); // 20.0 km/h

        // 3. Testar chavear() em movimento (deve frear de 5 em 5 até parar antes de desligar)
        System.out.println("--> Tentando desligar o carro em movimento:");
        carro.chavear(); 
        System.out.println("Velocidade após desligar: " + carro.getVelocidadeAtual() + " km/h"); // 0.0 km/h
        System.out.println("Estado do carro: " + (carro.getEstado() ? "Ligado" : "Desligado"));

        // 4. Testar Sobrecarga da Corrida com Gasolina Especial
        carro.chavear(); // Liga novamente
        System.out.println("\n--> Testando corrida com gasolina especial (100 km com 5L especial):");
        carro.corrida(100.0, 5.0); // 5L especial rendem 100 km (redução de 50% no consumo)
        System.out.println("Litragem restante no tanque: " + carro.getLitragemTanque() + " L");


        System.out.println("\n=== TESTANDO A CLASSE AVIÃO ===");
        // Criando um Avião: marca, estado (desligado), tanque (500L), consumo (2 km/L), 
        // velAtual (0), litragem (100L), velMax (250 km/h), voando (false)
        Aviao aviao = new Aviao("Boeing", false, 500.0, 2.0, 0.0, 100.0, 250.0, false);

        // 1. Ligar o avião
        aviao.chavear(); // Avião ligado

        // 2. Acelerar na pista até atingir a velocidade de voo (200 km/h)
        System.out.println("--> Acelerando na pista:");
        for (int i = 0; i < 20; i++) {
            aviao.acelerar();
        }
        System.out.println("Velocidade na pista: " + aviao.getVelocidadeAtual() + " km/h");

        // 3. Decolar com o método voar()
        aviao.voar();

        // 4. Acelerar em voo (+20 km/h por chamada, podendo ultrapassar a velocidade máxima)
        aviao.acelerar();
        System.out.println("Velocidade em voo: " + aviao.getVelocidadeAtual() + " km/h");

        // 5. Tentativa de desligar em voo/movimento (deve ser impedida)
        System.out.println("--> Tentando desligar o avião em movimento:");
        aviao.chavear(); 

        // 6. Testar pouso por redução de velocidade (< 200 km/h)
        System.out.println("--> Freando o avião:");
        aviao.frear(); // -10 km/h
        aviao.frear(); // Reduz para menos de 200 km/h e notifica o pouso

        // 7. Testar Corrida com Pouso Emergencial (tentando percorrer distância superior à autonomia)
        System.out.println("\n--> Testando corrida com distância maior que a litragem disponível:");
        // Com 100L e consumo de 2 km/L, a autonomia é de 200 km. Vamos pedir 300 km:
        aviao.corrida(300.0); 
        System.out.println("Velocidade após emergência: " + aviao.getVelocidadeAtual() + " km/h"); // 0 km/h
        System.out.println("Litragem após emergência: " + aviao.getLitragemTanque() + " L");
    }
}