package org.example.aula08.atividadeMetodos;

import java.util.Scanner;

public class AtividadeMetodo4 {
    static void main() {

        Scanner scanner=new Scanner(System.in);
        double [] numero= Metodos.digitarNumerosParaCalcularMedia(scanner);

        Metodos.mediaPrintadaNaTela(numero);
    }

}
