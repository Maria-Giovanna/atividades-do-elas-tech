package org.example.aula05.ListaDeRevisão;
import java.util.Scanner;

public class exercicio6 {

/*
6 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:

Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).

Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).

Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."
*/

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento:");
        int anoDeNascimento = scanner.nextInt();
        scanner.nextLine(); //limpar bug de enter

        System.out.println("\nQual o seu nome completo?");
        String nomeCompleto = scanner.nextLine();

        System.out.printf("\nO usuário, de nome %s, nasceu em %d!", nomeCompleto, anoDeNascimento);
    }
}
