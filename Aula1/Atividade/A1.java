package atividade;

import java.util.Scanner;

public class A1 {
    public static void preencheMatriz(int[][] matriz, Scanner scanner){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void imprimeMatrizTransposta(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static int menorValorVetor(int[] vetor){
        int valor = vetor[0];

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < valor){
                valor = vetor[i];
            }
        }

        return valor;
    }

    public static boolean ePrimo(int n){
        if(n < 2) return false;

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void imprimePrimo(int sup, int inf){
        for(int i = sup; i <= inf; i++){
            if(ePrimo(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] Args){
        int[][] matriz = new int[3][3];

        Scanner scanner = new Scanner(System.in);

        preencheMatriz(matriz, scanner);
        imprimeMatrizTransposta(matriz);

        int[] vetor = {12, 5, 3, 9, 10};
        int resultado = menorValorVetor(vetor);
        System.out.println(resultado);

        boolean resultadoPrimo = ePrimo(7);
        System.out.println(resultadoPrimo);

        imprimePrimo(0, 10);
    }
}