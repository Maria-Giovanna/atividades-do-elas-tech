package org.example.aula05.aulaScanner;

import java.util.Scanner;

public class atividadeScanner {
    static void main() {
        Scanner sc = new Scanner(System.in);

        //atividade 1
        System.out.println("Qual o seu nome?");
        String nome= sc.nextLine();
        System.out.println("\nQual a sua idade?");
        int age= sc.nextInt();

        infoNaTela(nome,age);
        System.out.println("==========================");

        //atividade 2
        System.out.println("Digite um primeiro número:");
        int numero1= sc.nextInt();
        sc.nextLine();
        System.out.println("Digite um segundo número");
        int numero2= sc.nextInt();
        sc.nextLine();

        System.out.println(calculoDeDivisao(numero1,numero2));
        System.out.println(calculoDeMultiplicacao(numero1,numero2));
        System.out.println(calculoDesoma(numero1,numero2));
        System.out.println(calculoDeSubtracao(numero1,numero2));
        System.out.println(calculoDeResto(numero1,numero2));

        //atividade 3

        //atividade 4
    }

    static void infoNaTela(String name, int idade){
        System.out.printf("Oie %s!\nVocê tem %d anos e vai fazer "+ (idade+1)+ " anos no proximo aniversário", name,idade);
    }

    static int calculoDesoma(int a, int b){
        return a+b;
    }

    static int calculoDeSubtracao(int a, int b){
        return a-b;
    }

    static int calculoDeMultiplicacao(int a, int b){
        return a*b;
    }

    static int calculoDeDivisao(int a, int b){
        return a/b;
    }

    static int calculoDeResto(int a, int b){
        return  a%b;
    }

}


