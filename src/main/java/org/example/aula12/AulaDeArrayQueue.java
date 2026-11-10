package org.example.aula12;

import java.util.ArrayDeque;

public class AulaDeArrayQueue {

    static void main() {
        ArrayDeque<String> filaDeNomes = new ArrayDeque<>();

        filaDeNomes.add("Maria de Lourdes");
        filaDeNomes.add("Maria do Carmos");
        filaDeNomes.add("Maria Giovanna");
        filaDeNomes.add("Salve Maria");
        filaDeNomes.add("Doce Rainha");

        System.out.println(filaDeNomes);

        System.out.println("\n================================\n");

        System.out.println(filaDeNomes);
        System.out.println(filaDeNomes.peek());
        System.out.println(filaDeNomes.peekFirst());
        System.out.println(filaDeNomes.peekLast());

        System.out.println("\n================================\n");

        System.out.println(filaDeNomes);
        filaDeNomes.poll();

        System.out.println("\n"+filaDeNomes);
        filaDeNomes.pollFirst();

        System.out.println("\n"+filaDeNomes);
        filaDeNomes.pollLast();

        System.out.println("\n"+filaDeNomes);

        System.out.println("\n================================\n");

        System.out.println("A lista está vazia? "+filaDeNomes.isEmpty());

        System.out.println("\n================================\n");

        filaDeNomes.clear();
        System.out.println(filaDeNomes);


        System.out.println("\n================================\n");


        //boa pratica para que
        if (filaDeNomes.isEmpty() != true){
            System.out.println("A lista possui "+ filaDeNomes.size()+ " elementos dentro dele");
        }else {
            System.out.println("\n"+filaDeNomes);
            filaDeNomes.pollLast();

            System.out.println("\n"+filaDeNomes);
        }
    }



}
