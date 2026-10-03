package org.example.aula05.ListaDeRevisão.atividade5;
import java.util.Scanner;

public class exercicio5 {
    /*5 - Crie uma classe chamada Produto com os atributos nome (String) e preco (double).

Na classe principal, faça um laço for que repita 3 vezes.

A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.

Instancie um novo Produto e guarde nele os valores digitados.

Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!".
Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.*/

    static void main() {
        Produto produto = new Produto();
        Scanner scanner= new Scanner(System.in);

            for (int volta = 0; volta<=3; volta++){
                System.out.println("\nDigite o nome do produto para registrar:");
                produto.nome= scanner.nextLine();

                System.out.println("\nQual o preço dele?");
                produto.preco= scanner.nextDouble();
                scanner.nextLine();// limpar bug de enter

                if (produto.preco >100.00){
                    System.out.printf("O produto %s é muito caro", produto.nome);
                }else{
                    System.out.printf("O produto %s está com um preço acessível de %.2f\n", produto.nome, produto.preco);
                }
            }
    }
}
