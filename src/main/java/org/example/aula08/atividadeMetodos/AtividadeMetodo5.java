package org.example.aula08.atividadeMetodos;

import java.util.Scanner;

public class AtividadeMetodo5 {

    static void main() {
        Scanner scanner= new Scanner(System.in);

        System.out.printf("=================================");
        System.out.printf("\nBom dia, boa tarde e boa noite! Bem vindo ao verificador de idade!");
        System.out.printf("\n=================================");

        int idade= Metodos.inserirIdadeDaPessoa(scanner);
        Metodos.eMaiorDeIdade(idade);

    }
}
