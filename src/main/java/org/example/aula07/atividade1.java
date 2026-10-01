package org.example.aula07;
import java.util.Scanner;

public class atividade1 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.println("Qual o seu nome aluna?");
        nome= scanner.nextLine().trim();

        mostrarBoasVindas(nome);
    }

    static void mostrarBoasVindas(String luna){
        System.out.printf("Seja bem-vinda ao curso de Java, %s", luna);
    }
}
