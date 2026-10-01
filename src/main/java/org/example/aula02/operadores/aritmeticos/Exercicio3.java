package org.example.aula02.operadores.aritmeticos;

public class Exercicio3 {
    static void main() {
        /*Crie variáveis para três notas (8, 6 e 10). Mostre a soma e a média.*/

        double nota1= 8, nota2= 6, nota3= 10, media= (nota1+nota2+nota3)/3;

        System.out.printf("A soma das notas é "+ (nota1+nota2+nota3)+ ". E a média das notas é %.2f", media);
    }
}
