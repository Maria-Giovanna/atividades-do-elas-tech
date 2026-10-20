package org.example.aula08.atividadeMetodos;

import java.util.Scanner;

public class Metodos {
    //atividade2
    static String[] guardarTresNomes(Scanner scanner){
        String[]names= new String[3];

        for (int i=0; i<3; i++){
            System.out.printf("Digite o nome %d:",i);
            names[i]=scanner.nextLine();
        }
        return names;
    }

    static void saudar(String[]names){
        for (int i = 0; i < names.length; i++){
            System.out.println("\nOie, "+ names[i]+ "! Tudo bem?");
        }
    }

    static int entregaDoDobroDoNumero(Scanner scanner){
        System.out.println("Digite o valor de um número:");
        int numero= scanner.nextInt();

        return numero*2;
    }

    static double[] digitarNumerosParaCalcularMedia(Scanner scanner){
        double[]numeros= new double[2];

        for (int i=0; i<numeros.length; i++){
            System.out.println("Digite o número "+i+" :");
            numeros[i]= scanner.nextDouble();
            scanner.nextLine();
        }
        return numeros;
    }

    static void mediaPrintadaNaTela(double[]numeros){
        double media = (numeros[0]+numeros[1])/numeros.length;
        System.out.printf("A média dos numeros %.1f e %.1f é = %.2f!", numeros[0], numeros[1], media);
    }

    static void eMaiorDeIdade(int idade){
        if (idade>=18){
            System.out.printf("\nA pessoa tem %d, então é considerada Maior de idade!", idade);
        } else{
            System.out.printf("\nA pessoa tem %d, então ainda é menor de idade!", idade);
        }
    }

    static int inserirIdadeDaPessoa(Scanner scanner){
        System.out.printf("\nInsira seu nome: ");
        String name= scanner.nextLine();

        System.out.printf("\n%s, qual a sua idade?", name);
        int idade= scanner.nextInt();
        scanner.nextLine();

        return idade;
    }

    static void imprimeNome(Scanner scanner){
        System.out.println("\nQual o seu nome?");
        String name = scanner.nextLine();

        System.out.printf("Olá, %s!",name);
    }

    static void naoImprimeNome(){
        System.out.println("Olá!");
    }
}