package org.example.aula11.atividadeHashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Atividade1 {
    /*Crie um HashSet de nomes e adicione quatro valores, sendo um deles
   repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
   com o repetido.*/

   ArrayList<String> nomeDosClientes = new ArrayList<>();
   HashSet<String> combinacoesDosNomesDosClientes = new HashSet<>(nomeDosClientes);









   static HashSet<String> verOsNomesDaLista(HashSet<String> combinacoes, ArrayList<String> nomes){

      for (String nome: nomes){
         combinacoes.add(nome);
      }
      return combinacoes;
   }

   static ArrayList<String> nomes(Scanner scanner, ArrayList<String> nomeDosClientes){

      for (int i=0; i<3; i++){

         System.out.println("Bom dia, boa tarde e boa noite!");

      }


   }
}
