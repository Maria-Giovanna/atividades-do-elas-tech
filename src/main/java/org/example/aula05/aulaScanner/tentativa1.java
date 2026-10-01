package org.example.aula05.aulaScanner;
import org.example.Cozinheiro;
import java.util.Scanner;

public class tentativa1 {
    static void main() {

        /* Pegar e criar um novo obj com a classe Cozinheiro (a cozinheira ivyh)
        * Definir alguma das variaveis pra ela ex: comidaPreferida etc.
        * Scanner pra digitar essa informação
        * e dps de digitar aparecer q a cozinheira ivyh gosta da comida digitada*/

        Cozinheiro ivyh = new Cozinheiro();
        Scanner comifav = new Scanner(System.in); /* entrada do sistema*/

        System.out.println("Qual sua comida favorita?");
        ivyh.comidaFavorita= comifav.nextLine();

        System.out.printf("Sua comida favorita é %s", ivyh.comidaFavorita);

    }
}
