package org.example.aula10.metodos;

import java.util.Scanner;

public class Metodos {

    static int[] dividirDoisNumeros(Scanner scanner) {
        int[] numeros = new int[2];
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("===================\n");
            System.out.println("Digite o número " + (i + 1) + " :");
            numeros[i] = scanner.nextInt();
            scanner.nextLine();

            if (i == 1) {
                if (numeros[i] == 0) {
                    throw new ArithmeticException("Não é possivel dividir por zero");
                } else if (numeros[i] < 0) {
                    throw new IllegalArgumentException("O divisor não pode ser negativo!");
                } else {
                    System.out.println("Número válido!");
                }
            }
        }
        return numeros;
    }
}
