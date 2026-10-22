package org.example.aula07.arrays.arrayMultidimensional;

public class TesteDoArrayMultidimensional {
    static void main() {
        int[][] teste =new int[3][3];

        teste[0][0]=1;
        teste[0][1]=2;
        teste[0][2]=3;
        teste[1][0]=4;
        teste[1][1]=5;
        teste[1][2]=6;
        teste[2][0]=7;
        teste[2][1]=8;
        teste[2][2]=9;

    for (int[] teste2: teste){
        System.out.println(teste2[0]);
    }

    }
}
