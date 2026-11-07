package org.example.aula10.metodos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class atividadeTratamentoDeExcecoes1 {
/*Pedir dois números inteiros-- scanner e variaveis dentro de um array;
* Mostrar a divisão do primeiro pelo segundo -- return a/b (metodo que só faz a conta)
* Se a pessoa digitar 0 no SEGUNDO, tratar a ArithmeticException "n da pra dividir por 0"
* -- Para fazer o sistema n parar de rodar:
*  -- try catch no metodo
*
* podemos usar no metodo um throw e tratar no main quando aparecer o problema  */




    static void main() {
        Scanner scanner=new Scanner(System.in);

        try {
            int[]numeros= Metodos.dividirDoisNumeros(scanner);
            int resultado= numeros[0]/numeros[1];
            System.out.printf("Resultado da divisão %d / %d é = %d.", numeros[0], numeros[1], resultado);

        }catch (ArithmeticException | IllegalArgumentException aeiae){
            System.out.println("Erro: "+ aeiae.getMessage());

        }catch (InputMismatchException ime){
            //se digitar letras ao inves de números
            System.out.println("Erro: digite apenas números inteiros!");

        }finally {
            scanner.close();
        }

    }
}
