package org.example.aula08.atividadeMetodos;

import java.util.Scanner;

public class AtividadeMetodo2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        String[]names= Metodos.guardarTresNomes(scanner);
        Metodos.saudar(names);
    }
}
