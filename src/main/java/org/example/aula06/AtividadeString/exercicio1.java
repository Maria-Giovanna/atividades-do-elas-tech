package org.example.aula06.AtividadeString;
import java.util.Scanner;


public class exercicio1 {

    /*1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).

2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.

3 — Peça o nome da pessoa e mostre a primeira letra dele.

4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.

5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.

Digite seu nome: Ana
Digite de novo: ANA
Os nomes são iguais? true
*/

    static void main() {
        Scanner scanner = new Scanner(System.in);

        /*1*/
        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Seu nome possui "+ (nome.length())+ " letras (contando os espaços)");

        /*2*/
        System.out.println("Seu nome em letra mínusculas é "+ (nome.toLowerCase())+ ". Seu nome em letras  maiúscula "+ (nome.toUpperCase()));

        /*3*/
        System.out.printf("A primeira letra do seu nome é "+ (nome.charAt(0))+ "\n");

        /*4*/
        System.out.println("Digite uma frase qualquer.");
        String fraseQualquer= scanner.nextLine();
        System.out.println("\nDigite uma palavra qualquer");
        String palavraQualquer = scanner.nextLine();

        if (fraseQualquer.contains(palavraQualquer)== true){
            System.out.println("A palavra que você digitou aparece na frase \n");
        }else{
            System.out.println("A palavra digitada não aparece na frase que você digitou!\n");
        }

        /*5*/
        System.out.println("Digite seu nome:");
        String nome1= scanner.nextLine().trim();
        System.out.println("\nDigite novamente o seu nome:");
        String nome2= scanner.nextLine().trim();

        if (nome1.equalsIgnoreCase(nome2)== true){
            System.out.println("Os nomes são iguais");
        }else {
            System.out.println("Os nomes são diferentes");
        }
    }
}
