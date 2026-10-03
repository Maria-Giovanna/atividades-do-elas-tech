package org.example.aula05.ListaDeRevisão.atividade7;
import java.util.Scanner;

public class cadastroAlunas {

    /*Programa que cadastra alunas;
     calcula a média delas
     diz se foram aprovadas.
     E O programa fica rodando >até a pessoa escolher sair<.*/

    /*Regras obrigatórias:
1. Crie uma classe Aluna com cinco atributos: nome, nota, nota2, media e passou (passou sendo boolean).

2. Toda informação fica nos atributos do objeto. Nada de criar variáveis soltas tipo double nota1 = sc.nextDouble(). O valor lido vai direto pro atributo: aluna.nota = sc.nextDouble().

3. Use while para manter o programa rodando até a pessoa escolher sair.

4. Use switch para tratar as opções do menu. Todos os casos precisam de break, e precisa ter um default.

5. Instancie a Aluna dentro do loop, no momento do cadastro. Cada volta cria uma aluna nova. (Ainda não estudamos como guardar vários valores, por enquanto, cada aluna é mostrada na tela e descartada na próxima iteração do loop.)

6. Calcule a média dentro do programa. Nada de pedir a média pronta pra pessoa.

7. Use if / else para definir se a aluna passou. A média mínima para aprovação é 6. Se a média for 6 ou mais, passou recebe true; se for menor, recebe false. O programa decide sozinho — não pergunte isso para a pessoa.

8. Use printf para mostrar o resultado: %s para o nome (String), %.1f para as notas e a média, e %b para o passou (boolean).
*/

    static void main() {
        Scanner scanner = new Scanner(System.in);
        Alunas aluna1= new Alunas();
        int opcao = 0;

        System.out.println("Seja bem vindo ao sistema de cadastro de nota das alunas!");

        while (opcao !=2){
            System.out.println("\nSelecione uma das opções para continuar:\n1 - Continuar\n2 - Sair do sistema");
            opcao=scanner.nextInt();
            scanner.nextLine();//limpar bug do espaço;
            switch (opcao){
                case 1:
                    System.out.println("Qual o nome da aluna?");
                    aluna1.name= scanner.nextLine();

                    System.out.printf("Qual a primeira nota da %s?", aluna1.name);
                    aluna1.nota[0]= scanner.nextDouble();

                    System.out.printf("Qual a segunda nota da %s?", aluna1.name);
                    aluna1.nota[1]= scanner.nextDouble();

                    aluna1.mediaDasNotas = calcularMedia(aluna1);

                    if (aluna1.mediaDasNotas<6.00){
                        aluna1.passouDeAno=false;
                    }else{
                        aluna1.passouDeAno=true;
                    }

                    //PRINTS DOS RESULTADOS
                    System.out.printf("O nome da aluna é %s.\nSua primeira nota foi %.2f, sua segunda nota foi %.2f.",aluna1.name, aluna1.nota[0], aluna1.nota[1]);
                    System.out.printf("\nA média da aluna esse semestre é %.2f.",aluna1.mediaDasNotas);

                    if (aluna1.passouDeAno==false){ //passouDeAno deu falso?
                        System.out.printf("\nInfelizmente, a %s reprovou de ano!", aluna1.name);
                    }else{ // passouDeAno deu true?
                        System.out.printf("\nParabens! Você foi aprovada %s", aluna1.name);
                    }
                    break;
                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Digite um dos valores informados");
            }
        }
    }
    static double calcularMedia(Alunas aluna){
        double soma = 0;
        for (int i=0; i<2; i++)
        soma= soma+aluna.nota[i];
        /* em tese, ele vai ir somando uma nota por uma, até ser possivel somar todas elas, e retornar média. Mas bem, é em tese */
        return soma/2;
    }
}
