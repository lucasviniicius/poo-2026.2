import java.util.Scanner;

public class Introducao {
    public static int soma(int n1, int n2){
        System.out.println("Número 1: " + n1);
        System.out.println("Número 2: " + n2);
        return n1 + n2;
    }

    public static void main(String[] Args){
        String nome;
        int idade;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        if(idade >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        int contador = 0;

        do{
            System.out.println("Estou dentro do dowhile");
            contador++;
        } while(contador < 10);

        for(int i = 0; i < 10; i++){
            System.out.println("Estou dentro do for");
        }

        int contador2 = 0;

        while(contador2 < 10){
            System.out.println("Estou dentro do while");
            contador2++;
        }

        System.out.println("\n--------------------------------\n");

        int[] vetor = {1, 2, 3};
        int[] vetor2 = new int[3];

        for(int i : vetor){
            System.out.println(i);
        }

        for(int i : vetor2){
            System.out.println(i);
        }

        int resultado = soma(1, 4);
        System.out.println("Resultado da soma: " + resultado);

        entrada.close();
    }
}
