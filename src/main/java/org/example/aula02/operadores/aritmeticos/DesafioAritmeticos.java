package org.example.aula02.operadores.aritmeticos;

public class DesafioAritmeticos {
    static void main() {
        /* Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram. */

        int segundos= 3785, minutos= segundos/60, segundosSobrandoDosMinutos= segundos%60;

        System.out.printf("dentro de %d segundos, temos %d minutos e %d segundos!", segundos, minutos, segundosSobrandoDosMinutos);

    }
}
