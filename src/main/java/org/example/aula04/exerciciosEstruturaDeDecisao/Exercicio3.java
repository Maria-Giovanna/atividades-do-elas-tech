package org.example.aula04.exerciciosEstruturaDeDecisao;

public class Exercicio3 {
    static void main() {
        int opcao = 2;

        switch (opcao) {
            case 1:
                System.out.println("Café");
                break;
            case 2:
                System.out.println("Cappuccino");
                break;
            case 3:
                System.out.println("Chocolate quente");
                break;
            case 4:
                System.out.println("Chá");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
