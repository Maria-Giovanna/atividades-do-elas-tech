package org.example.aula03.concatenacao;

public class Exercicio2 {
    static void main() {
        /*Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4). Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"*/

        String productName= "Caneca";
        int quantity= 10;
        double price= 12.50, valorDaCompra= price * quantity;;

        System.out.printf("Comprei %d unidades de %s por R$ %.2f. E o valor total da compra foi R$ %.2f.", quantity,productName, price, valorDaCompra);
    }
}
