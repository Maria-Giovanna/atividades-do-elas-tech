package org.example.aula08.atividadeMetodos;

import java.util.Scanner;

public class AtividadeMetodo1 {

    static void main() {
        Scanner scanner= new Scanner(System.in);
        mostrarBoasVindas(scanner);
    }

    static void mostrarBoasVindas(Scanner scanner){
        System.out.println("Qual o seu nome?");
        String name = scanner.nextLine();

        System.out.printf("\nSeja bem vindo ou bem vinda ao curso de Java!", name);
    }
}
