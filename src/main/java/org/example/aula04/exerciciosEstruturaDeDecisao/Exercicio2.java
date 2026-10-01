package org.example.aula04.exerciciosEstruturaDeDecisao;

public class Exercicio2 {
    static void main() {
    /*Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00). Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante. Se não for, mostre "Saldo insuficiente" e quanto está faltando.*/

        double saldoDaConta= 500.00, valorCompra= 320.00;

        if (saldoDaConta >= valorCompra){
            System.out.printf("Compra aprovada no valor de R$ %.2f. O saldo restante foi de R$ %.2f.", valorCompra, (saldoDaConta-valorCompra));
        }else{
            System.out.printf("Saldo insuficiente! Faltam R$ %.2f", (valorCompra-saldoDaConta));
        }
    }
}
