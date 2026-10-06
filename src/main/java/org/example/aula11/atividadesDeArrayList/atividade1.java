package org.example.aula11.atividadesDeArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class atividade1 {
// Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.

    static void main() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for (int voltas=0; voltas<3; voltas++){
            System.out.println("Digite um nome:");
            String nome = scanner.nextLine();

            nomes.add(nome);
        }
        System.out.println(nomes);

    }
}
