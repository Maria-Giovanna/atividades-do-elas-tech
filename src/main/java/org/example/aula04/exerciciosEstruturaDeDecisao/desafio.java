package org.example.aula04.exerciciosEstruturaDeDecisao;

public class desafio {
    static void main() {
        /*Desafio: Crie variáveis para três notas de uma aluna. Calcule a média e mostre: "Aprovada" se for 7 ou mais, "Recuperação" entre 5 e 6.9, e "Reprovada" abaixo de 5. Mostre também a média na tela. Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.
        Ps: Utilize double para o valor das notas. Para controlar as casas decimais, use printf
         */

        double nota1= 7.0, nota2= 7.0, nota3= 9.5, mediaTotal;

        mediaTotal= (nota1+nota2+nota3)/3;

        if (mediaTotal >= 7){
            System.out.printf("Sua média do semestre é %.2f.%nVocê foi APROVADA! Parabéns!!", mediaTotal);

        } else if (mediaTotal >=5 && mediaTotal <= 6.9) {
            System.out.printf("Sua média do semestre é %.2f. %n%nSeus estudos merecem mais atenção, então você ficará de RECUPERAÇÃO!!", mediaTotal);

        }else{
            System.out.printf("Sua média foi %.2f.\nVocê falhou com seus estudos esse semestre, por isso você está REPROVADO!!", mediaTotal);
        }
    }
}
