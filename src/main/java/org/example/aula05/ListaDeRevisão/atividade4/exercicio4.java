package org.example.aula05.ListaDeRevisão.atividade4;
import org.example.aula05.ListaDeRevisão.atividade4.Pet;
import java.util.Scanner;


public class exercicio4 {

/*4 - Crie uma classe chamada Pet.

Dê a ela três atributos: nome (String), raca (String) e peso (double).

Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).

Atribua valores para os atributos de cada um deles.

Imprima os dados dos dois pets concatenando textos e variáveis.*/

    static void main() {
        Scanner scanner= new Scanner(System.in);
        Pet cat = new Pet();
        Pet dog = new Pet();

        System.out.println("\nQual o nome do seu gato?");
        cat.nome= scanner.nextLine();
        System.out.println("\nQual o nome do seu cachorro?");
        dog.nome= scanner.nextLine();

        System.out.println("\nQual o peso do seu gato?");
        cat.peso= scanner.nextDouble();
        System.out.println("\nQual o peso do seu cachorro?");
        dog.peso= scanner.nextDouble();

        scanner.nextLine(); //ta dando erro no enter. Então coloco isto para "comer" o enter

        System.out.println("\nQual a raça do seu gato?");
        cat.raca= scanner.nextLine();
        System.out.println("\nQual a raça do seu cachorro?");
        dog.raca= scanner.nextLine();

        System.out.printf("As informações que temos sobre seus bichinhos é: \n%s é o nome do seu gato, que pesa %.2fkg e é da raça %s. \nE %s é o nome do seu cachorro, que pesa %.2fkg e é da raça %s!", (cat.nome),(cat.peso), (cat.raca), (dog.nome), (dog.peso), (dog.raca));

    }
}
