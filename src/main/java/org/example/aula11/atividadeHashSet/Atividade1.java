package org.example.aula11.atividadeHashSet;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Scanner;

public class Atividade1 {
    /*Crie um HashSet de nomes e adicione quatro valores, sendo um deles
   repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
   com o repetido.*/

   static void main() {
      Scanner scanner = new Scanner(System.in);
      ArrayList<String> nomeDosClientes = new ArrayList<>();
      HashSet<String> combinacoesDosNomesDosClientes = new HashSet<>(nomeDosClientes);

      saudacao();
      adicionarOsNomesNaLista(scanner, nomeDosClientes);
      adicionarOsNomesParaVerificacao(combinacoesDosNomesDosClientes, nomeDosClientes);
      quantidadeDosNomesNaoRepetidos(combinacoesDosNomesDosClientes);

      //Qualquer que seja o nome repetido, ele só ignora e conta uma unica vez
   }


   public static HashSet<String> adicionarOsNomesParaVerificacao(HashSet<String> combinacoes, ArrayList<String> nomes){

      for (String nome: nomes){
         combinacoes.add(nome);
      }
      return combinacoes;
   }

   public static ArrayList<String> adicionarOsNomesNaLista(Scanner scanner, ArrayList<String> nomeDosClientes){

      for (int i=0; i<4; i++){
         System.out.println("Digite o "+ (i+1) +"º nome da lista:");
         nomeDosClientes.add(scanner.nextLine().trim().toUpperCase());
      }
      System.out.println("Muito obrigada por preencher os 3 nomes até aqui");

      return nomeDosClientes;
   }

   public static void saudacao(){
      System.out.println("Olá! Seja bem vindo ao sistema de verificação de clientes!\n");
      System.out.println("Abaixo, digite 4 nomes e verifique quantos estiveram fazendo pedido no comércio :)");
   }

   public static void quantidadeDosNomesNaoRepetidos(HashSet<String> nomes){
         System.out.println("clientes que fizeram pedidos: "+nomes);
         System.out.println("Quantidade de clientes diferentes: "+ nomes.size());
   }
}
