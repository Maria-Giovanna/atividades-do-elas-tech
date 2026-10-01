package org.example.aula05.ListaDeRevisão;
import java.util.Scanner;

public class exercicio3 {
    /*Usando um do-while e um switch, crie um menu interativo.

O menu deve oferecer três opções: (antes do switch, vamos por as opções pra pessoa saber oq digitar.)
1 - Ver camisas
2 - Ver calças
3 - Sair
Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.*/

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma das opções abaixo: \n1 - Ver camisas \n2- Ver calças \n3- Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Você selecionou as camisetas!");
                    break;
                case 2:
                    System.out.println("Você selecionou as calças!");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção invalida, digite uma opção existente no menu");
                    break;
            }
        }while (opcao != 3);

        System.out.println("Sessão encerrada.");
    }


}
