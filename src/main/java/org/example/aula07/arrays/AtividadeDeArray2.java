package org.example.aula07.arrays;

public class AtividadeDeArray2 {

    static void main() {
        // Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".

        int[] notas={8, 6, 10, 7, 9};
        mostrarAsNotasNaTela(notas);

        int soma= somaDasNotasNaTela(notas);
        int media= mediaDasNotas(notas);

        System.out.printf("\nA soma de todas as notas é: "+ soma);
        System.out.printf("\nA média das "+notas.length+ " notas é %d", media);

    }

    static void mostrarAsNotasNaTela(int[]notas){
    //vamos usar um for, que irá mostrar as 5 posições do array (precisar ter um dentro do metodo).

        for (int i=0; i < notas.length; i++){
            System.out.println("A nota "+ i + " é: "+ notas[i]);
        }
    }

    static int somaDasNotasNaTela(int[]notas){
        int soma=0;

        for (int i=0; i <notas.length; i++){
            soma += notas[i];
        }
        return soma;
    }

    static int mediaDasNotas(int[]notas){
        //chamando de onde vamos usar o total pra fazer a média
        int soma= somaDasNotasNaTela(notas);
        return soma/notas.length;
    }

}
