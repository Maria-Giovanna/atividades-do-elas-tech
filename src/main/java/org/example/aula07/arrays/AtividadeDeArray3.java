package org.example.aula07.arrays;
import java.util.Scanner;

public class AtividadeDeArray3 {

    static void main() {
    Scanner scanner = new Scanner(System.in);

    //preencher 5 numeros:
    double[]numerosAleatorios= preencherOsNumeros(scanner, 5);

    //printar os 5 numeros de traz pra frente:
    printaOsNumerosDeTrasPraFrente(numerosAleatorios);

    }

    static double[] preencherOsNumeros(Scanner scanner, int contador){
        double[]numerosAleatorios= new double[contador];

        for (int i=0; i<numerosAleatorios.length; i++){
            System.out.printf("\nPreencha o numero %d:", i);
            numerosAleatorios[i]= scanner.nextDouble();
            scanner.nextLine();
        }
        return numerosAleatorios;
    }

    static void printaOsNumerosDeTrasPraFrente(double[]numeros){
        for (int i= numeros.length-1; i>=0; i--){
            System.out.printf("\nO numero na posição "+ i+ " é :"+ numeros[i]);
        }
    }
}
