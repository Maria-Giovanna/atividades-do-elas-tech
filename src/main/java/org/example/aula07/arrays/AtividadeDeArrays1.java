package org.example.aula07.arrays;
import java.util.Scanner;

public class AtividadeDeArrays1 {
    /*1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.

    2 — Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".

    3 — Com o mesmo array de notas, calcule e mostre a soma e a média.

    4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.

Referência:
int[] notas = {8, 6, 10, 7, 9};
int[] notas = new int[5]
•for(int i = 0; i < notas.length; i++){

    System.out.println(notas[i]);

}*/
    static void main() {
        Scanner scanner = new Scanner(System.in);
        // Mostre o primeiro, o terceiro e o último.(uso do for com i +=2 ==== 0, 0+2, 2+2)

        String[]listaDeNomes= registrarOsNomes(scanner, 5);
        mostrarNomesDasPosicoesPares(listaDeNomes);

        scanner.close();

    }

    //metodo de arrays tbm é possivel
    static String[] registrarOsNomes(Scanner scanner, int quantidade){
        String[]listaDeNomes = new String[quantidade];

        for (int i=0; i<listaDeNomes.length; i++){
            System.out.printf("Digite o nome %d :", i);
            listaDeNomes[i]= scanner.nextLine();
        }

        return listaDeNomes;
    }

    static void mostrarNomesDasPosicoesPares(String[]listaDeNomes){
        System.out.println("\nNomes das posições pares:");

        for (int i=0; i< listaDeNomes.length; i+=2){
            System.out.printf("\nNome na posição "+i+" :"+listaDeNomes[i]);
        }
    }


}
