package org.example.aula05.ListaDeRevisão;
import java.util.Scanner;

public class exercicio1 {
    /*1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
*/

    static void main() {
        /*VARIÁVEIS*/
        Scanner scanner= new Scanner(System.in);
        double valor;
        String nomeDoLanche;

        System.out.println("Digite o nome de um dos lanches disponíveis:");
        nomeDoLanche = scanner.nextLine();
        System.out.print("Qual o valor do seu lanche escolhido? \nR$" );
        valor = scanner.nextDouble();

        /*CONDICIONAL*/
        if (valor >= 30.00){
            valor -= 5.00;
            System.out.printf("Você ganhou um desconto de R$5,00. \nO seu lanche %s custará R$ %.2f.", nomeDoLanche, valor);
        }else{
            System.out.printf("O seu lanche %s custará R$ %.2f.", nomeDoLanche, valor);
        }
    }
}
