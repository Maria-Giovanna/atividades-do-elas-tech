package org.example.aula08.atividadeMetodos;

import java.util.Scanner;

public class AtividadeMetodo3 {

    /*3 — Crie um metodo dobro(int numero) que devolve o dobro do número recebido. No main, chame ele e mostre o resultado.*/
    static void main() {
        Scanner scanner=new Scanner(System.in);

        int resultado= Metodos.entregaDoDobroDoNumero(scanner);

        System.out.println("O dobro do valor digitado é: "+ resultado);
    }

}
