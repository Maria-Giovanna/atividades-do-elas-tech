package org.example.aula05.ListaDeRevisão;


public class exercicio2 {
/*Faça um programa que use um laço for para contar de 1 até 15. Dentro do for, coloque um if para verificar se o número atual é par ou ímpar (dica: use o operador de resto da divisão % 2 == 0).
Imprima na tela o número e a palavra correspondente.
Exemplo de saída:
"1 é Ímpar"
"2 é Par"
*/

    static void main() {

      int i;

      for (i=1; i <= 15; i++){
         if (i % 2 == 0){
             System.out.printf("o número %d é PAR! \n", i);
         }else {
             System.out.printf("o número %d é IMPAR! \n", i);
         }
      }
    }
}
