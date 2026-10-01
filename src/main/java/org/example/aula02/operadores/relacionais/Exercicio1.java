package org.example.aula02.operadores.relacionais;

public class Exercicio1 {
    static void main() {
     /*Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de: são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
a = 10, b = 3
a = 3, b = 10
a = 5, b = 5*/

        double a = 10;
        double b = 3;

        System.out.println("a e b são iguais? " + (a == b));
        System.out.println("a e b são diferentes? " + (a != b));
        System.out.println("a é maior que b? " + (a > b));
        System.out.println("a é menor que b? " + (a < b));
    }
}
