package org.example.aula04.exerciciosEstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Tem autorização? (true/false) ");
        boolean temAutorizacao = scanner.nextBoolean();

        if (idade >= 18 || temAutorizacao) {
            System.out.println("Pode entrar na festa por ter 18 anos ou por ter autorização.");
        } else {
            System.out.println("Não pode entrar na festa.");
        }

        if (idade >= 18 && temAutorizacao) {
            System.out.println("Pode entrar na festa por ser maior de 18 e ter autorização.");
        } else {
            System.out.println("Proibido entrar na festa.");
        }

        scanner.close();
    }
}
