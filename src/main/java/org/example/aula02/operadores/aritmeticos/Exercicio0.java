package org.example.aula02.operadores.aritmeticos;

public class Exercicio0 {
    static void main() {
        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));

        /*No primeiro println, o sistema está apenas concatenando os dois 2, ele não está fazendo uma conta, por isso resulta em 2+2 = 22.
        * Agora o segundo println está fazendo primeiro a conta entre os parenteses (2+2) e depois de realiza-lá, está fazendo a concatenação, por isso o resultado da 2+2 = 4*/
    }
}
