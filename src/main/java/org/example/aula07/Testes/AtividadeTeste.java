package org.example.aula07.Testes;

public class AtividadeTeste {
    static void main() {
        Cadastro cadastro = new Cadastro();

        cadastro.nome= "Ana";
        cadastro.endereco= "Teste";
        cadastro.raca= "coitadolandia";

        cadastrar(cadastro);

        //aparece o erro mas de forma bonitinha
        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException ae) {
            System.out.println("\nNão se divide por zero");
        }

        try {
            int resultado = 10 / 0;
            System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Não dá pra dividir por zero!");

        } finally {
            System.out.println("Isso sempre roda.");
        }

        System.out.println("O programa continua.");

    }

    static void cadastrar(Cadastro cadastro){
        System.out.printf("Nome ==> %s; endereço ==> %s; raça do cachorro ==> %s", cadastro.nome, cadastro.endereco, cadastro.raca);
    }

}
