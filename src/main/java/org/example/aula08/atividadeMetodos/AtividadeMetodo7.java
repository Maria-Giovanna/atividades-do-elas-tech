package org.example.aula08.atividadeMetodos;

import java.util.Scanner;

public class AtividadeMetodo7 {

    /*Crie dois métodos chamados saudacao:
    um sem parâmetro, que imprime "Olá!"
    um que recebe um nome, e imprime "Olá, [nome]!"*/

    static void main() {
        Scanner scanner= new Scanner(System.in);

        Metodos.naoImprimeNome();
        Metodos.imprimeNome(scanner);
    }
}
