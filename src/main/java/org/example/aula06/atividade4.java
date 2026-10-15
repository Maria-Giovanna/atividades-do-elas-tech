package org.example.aula06;
import java.util.Scanner;

public class atividade4 {
    /*4 -  Crie uma variável com um número e mostre a tabuada dele de 1 a 10.
     */

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número qualquer");
        numero= scanner.nextInt();

        for (int tabuada= 1; tabuada <=10; tabuada++){
            System.out.printf("\n%d x %d = %d", numero, tabuada, (numero * tabuada));
        }
    }
}
